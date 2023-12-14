package com.example.fishmarket.recipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.fishmarket.R
import com.example.fishmarket.dashboardbuyer.MainActivity
import com.squareup.picasso.Picasso

class FullRecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_recipe)

        val backButton = findViewById<ImageButton>(R.id.backB)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val recipeNameTextView: TextView = findViewById(R.id.recipeNameTextView)
        val instructionsTextView: TextView = findViewById(R.id.instructionsTextView)
        val ingredientsTextView: TextView = findViewById(R.id.ingredientsTextView)
        val recipeImageView: ImageView = findViewById(R.id.recipeImageView)

        val recipeName = intent.getStringExtra("recipeName")
        val instructions = intent.getStringExtra("instructions")
        val ingredients = intent.getStringArrayListExtra("ingredients")
        val imageUrl = intent.getStringExtra("imageUrl")

        recipeNameTextView.text = recipeName
        instructionsTextView.text = instructions
        ingredientsTextView.text = ingredients?.joinToString("\n")

        // Load recipe image using Picasso
        if (!imageUrl.isNullOrBlank()) {
            Picasso.get().load(imageUrl).placeholder(R.drawable.default_image).into(recipeImageView)
        } else {
            recipeImageView.setImageResource(R.drawable.default_image) // Placeholder if no image available
        }
    }
}
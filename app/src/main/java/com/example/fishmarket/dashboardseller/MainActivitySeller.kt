package com.example.fishmarket.dashboardseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import com.example.fishmarket.LoginActivity
import com.example.fishmarket.R
import com.example.fishmarket.dashboardbuyer.MainActivity
import com.example.fishmarket.welcome.WelcomeActivity

class MainActivitySeller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_seller)

        val postSeafoodCard: CardView = findViewById(R.id.postseafoodCard)
        postSeafoodCard.setOnClickListener {
            // Handle button click, navigate to Post Seafood activity
            val intent = Intent(this@MainActivitySeller, PostSeafood::class.java)
            startActivity(intent)
        }

        val welcomeCard: CardView = findViewById(R.id.welcomeCard)
        welcomeCard.setOnClickListener {
            // Handle button click, navigate to Post Seafood activity
            val intent = Intent(this@MainActivitySeller, WelcomeActivity::class.java)
            startActivity(intent)
        }

        val findseafoodCard: CardView = findViewById(R.id.findseafoodCard)
        findseafoodCard.setOnClickListener {
            // Handle button click, navigate to Post Seafood activity
            val intent = Intent(this@MainActivitySeller, SeafoodListActivity::class.java)
            startActivity(intent)

        }
        val ordermanagementCard: CardView = findViewById(R.id.recipesCard)
        ordermanagementCard.setOnClickListener {
            // Handle button click, navigate to Post Seafood activity
            val intent = Intent(this@MainActivitySeller, OrderManagementActivity::class.java)
            startActivity(intent)
        }
        val logoutButton = findViewById<ImageButton>(R.id.logOutB)
        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
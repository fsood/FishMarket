package com.example.fishmarket.dashboardbuyer


data class OrderStatus(
    val orderId: String = "",
    var buyerId: String = "",
    val status: String = "",
    var totalPrice: String = "",
    var kgQuantity: String = "",
    var fishType: String = "",
    var deliveryName: String = "",
    var deliveryPhone: String = "",
    var deliveryLocation: String = "",
    var sellerId: String = "",
    var selectedItemId: String = "",
    var imageUrl: String = "",
    var phoneNumber: Long? = 0L, // Change the type to Long for whole numbers
    val generatedItemId: String = "",
    var deliveryInfo: String = "",
    var payment: String = "",
    var availability: String = ""
)

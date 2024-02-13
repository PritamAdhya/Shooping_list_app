package com.example.myshopinglistapp

import androidx.compose.ui.text.toUpperCase


fun main(){
//    val numbers= listOf(1,2,3)
//    val doubled= numbers.map { it*2 }
//    println(doubled)
//    val blueRoseVase = Vase(color= "Blue", design= "Rose")
//    val redRoseVase= Vase(color="Red",design="Rose")
//    println(blueRoseVase)
//    println(redRoseVase)
    val name : String ?="pritam"
    name?.let{
        println(it.toUpperCase())
    }
}
data class Vase(
    val color : String, val design: String
)
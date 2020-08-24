package com.tom

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().Hello()
    val h = Human()
    h.Hello()
}

//在同個Package會跟JAVA衝突
class Human{
    fun Hello(){
        println("Hey Kotlin")
    }
}
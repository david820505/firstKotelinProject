package com.tom

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().Hello()
    val h = Human()
    h.Hello()
    //Int
    //Float
    //val(unchangable) or var(changable)
    val age = 19
    val age1 : Int = 19
    var weight = 66.5f
    val name: String
    name = "Hank"
}

//在同個Package會跟JAVA衝突
class Human{
    fun Hello(){
        println("Hey Kotlin")
    }
}
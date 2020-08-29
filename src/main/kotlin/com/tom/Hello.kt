package com.tom

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().Hello()
    val h = Human(weight = 66.5f,height = 1.7f)
    println(h.bmi())
    val score = 88
    println(score >60)
    val c :Char = 'A'
    println(c.toInt() > 60)
    //Int
    //Float
    //val(unchangable) or var(changable)
    /*val age = 19
    val age1 : Int = 19
    var weight = 66.5f
    val name: String
    name = "Hank"*/
}

//在同個Package會跟JAVA衝突
class Human(var name: String = "", var weight: Float, var height:Float){
    init {
        println("test $weight")
    }
    //secondary constructor
//    constructor(name: String, weight: Float, height: Float): this(weight,height)

    fun bmi() :Float{
        val bmi = weight/ (height*height)
        return bmi
    }

    fun Hello(){
        println("Hey Kotlin")
    }
}
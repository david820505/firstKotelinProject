package com.kotlin

import java.util.*

fun main(args: Array<String>) {
    //userInput()
    val stu = Student("Josh", 80, 90)
    stu.print()
    println("High score: ${stu.highest()}")
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("plz enter student name")
    //var name = scanner.next()
    var name = null
    print("plz enter english")
    var english = scanner.nextInt()
    print("plz enter english")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}


class Student(var name: String?,var english: Int,var math: Int){
    fun print(){
        print(name+"\t"+english+"\t"+math + "\t"+getAverage()+ "\t"+passOrFailed())
        println("\t"+grading())
    }
    fun print2(){
        print("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}")
    }

    fun passOrFailed() = if(getAverage()>=60) "Pass" else "Failed"

    fun grading():Char{
        //var grading : Char = when (getAverage()){
        return when (getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        //return grading
    }
    fun grading2() = when (getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage(): Int{
        return (english+math)/2
    }
    fun getAverage2() = (english+math)/2

    fun highest() : Int{
        var max = if (english > math) english else math
        return max
    }
    fun highest2()  = if (english > math) english else math

    fun nameCheck(){
        println(name?.length)
    }
}
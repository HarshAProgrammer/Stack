package com.example.stack

fun main(args:Array<String>){

    val stack = OurStackImpl<Int>()

    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.push(40)
    println(stack)


    val removedElement = stack.pop()
    println("Removed Element is $removedElement")
    println(stack)
    println("Stack size currently is ${stack.size()}")
    var topElement = stack.peek()
    println("Top element is $topElement")
}
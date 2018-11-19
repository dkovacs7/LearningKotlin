package com.virtualpairprogrammers.learningkotlin.kotlin


//private fun printAString(value: String) {
//    println(value)
//}


private fun printAString(value: String) = println(value)



//fun addTwoNumbers(one: Double, two: Double) : Double {
//    return one + two
//}


//fun addTwoNumbers(one: Double, two: Double) : Double = one + two


fun addTwoNumbers(one: Double, two: Double) = one + two


fun printSomeMaths(one: Double, two: Double) {
    println("$one + $two is ${one + two}")
    println("$one - $two is ${one - two}")
}



fun main(args: Array<String>) {

    printAString("Hello world")

    println(addTwoNumbers(17.3, 9.6))
    printSomeMaths(two = 17.3, one = 9.6)

}





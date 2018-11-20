package com.virtualpairprogrammers.learningkotlin.kotlin

//class Customer {
//
//    var name : String = "Matt"
//    var address : String = "10 The High Street"
//    var age : Int = 21
//
//    constructor(name: String, address:String, age: Int) {
//        this.name = name
//        this.address = address
//        this.age = age
//    }
//}

class Customer(val name : String, val address : String, var age : Int) {

    constructor(name: String, age: Int) : this(name,"",age) {
        println("secondary constructor")
    }

    init {
        println("init block")
    }

}

//class Customer(val name : String, val address : String, var age : Int)

//class Customer(val name : String = "Matt", val address : String = "10 The High Street", var age : Int = 21)


fun main(args: Array<String>) {

    val customer = Customer("Matt", "10 The High Street", 21)

    customer.age = 22

    val customer2 = Customer("David", 34)

    println("${customer.name} is ${customer.age} years old")

    println("${customer2.name} is ${customer2.age} years old")


}
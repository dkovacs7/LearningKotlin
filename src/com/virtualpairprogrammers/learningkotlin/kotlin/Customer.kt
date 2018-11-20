package com.virtualpairprogrammers.learningkotlin.kotlin


class Customer(val name : String, val address : String, var age : Int) {

    constructor(name: String, age: Int) : this(name,"",age)

}


class AlternativeCustomer(val name: String, var age: Int) {
    var address : String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }

}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "")



fun main(args: Array<String>) {

    val customer = AnotherAlternativeCustomer("Matt", 21, "10 The High Street")

    customer.age = 22

    val customer2 = AnotherAlternativeCustomer("David", 34)

    println("${customer.name} is ${customer.age} years old")

    println("${customer2.name} is ${customer2.age} years old")


}
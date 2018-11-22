package com.virtualpairprogrammers.learningkotlin.kotlin


data class Customer(val name: String, val address: String, var age: Int) {

    constructor(name: String, age: Int) : this(name, "", age)

}


//class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "") {
//
//    var approved: Boolean = false
//        set(value) {
//            require(age >= 21) { "You can't approve someone under 21 years old." }
//            field = value
//        }
//
//}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "") {

    var approved: Boolean = false
        set(value) {
            if (age >= 21) field = value else println("You can't approve a customer under 21 years old.")
        }


    val nextAge= age + 1


    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = address


    fun uppercaseName() = name.toUpperCase()

    override fun toString() = "[$name, $age, $address]"


    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Micky",22, "Some Address")
    }


}


fun main(args: Array<String>) {

    val customer = AnotherAlternativeCustomer("Matt", 14, "10 High Street")
    customer.approved = true

    val customer2 = AnotherAlternativeCustomer("David", 21)
    customer2.approved = true

    println("${customer2.name} is ${customer2.age} years old, his approval is ${customer2.approved}, and his next age is ${customer2.nextAge}")

    println("${customer.name} is ${customer.age} years old, his approval is ${customer.approved}, and his next age is ${customer.nextAge}")

    println("The class $customer has the following uppercase name ${customer.uppercaseName()}")

    val customer3 = AnotherAlternativeCustomer.getInstance()

    println(customer3)

    val customer4 = Customer("Sally", 29)

    println(customer4)

    val customer5 = customer4.copy(name = "Diane")

    println(customer5)


    val (name, address, age) = customer5

    println(name)

    val (name2, address2, age2) = customer

    println(customer)



}
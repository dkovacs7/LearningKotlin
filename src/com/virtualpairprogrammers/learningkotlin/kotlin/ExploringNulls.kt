package com.virtualpairprogrammers.learningkotlin.kotlin



fun main(args: Array<String>) {

    var name: String? = null


    name = "Matt"

    // null-safe operator
    println(name?.toUpperCase())


}
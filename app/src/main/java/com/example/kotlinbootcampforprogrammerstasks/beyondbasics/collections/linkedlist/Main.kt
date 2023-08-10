package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.linkedlist

import java.util.LinkedList
// first you import the LikedList collection in Java

fun main(){

    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)
    println(node2)
    println(node3)

    // another example where you directly use LinkedList<>

    var planets =  LinkedList<String>()
    planets.addAll(listOf("Earth", "Venus", "Mars"))

    println("Planets: $planets\n")
    println("Planets count: ${planets.count()}\n")

    println("Planets count with condition: ${planets.count {x -> x.startsWith("E")}}\n")

    println("First planet: ${planets.first}\n")

    println("Last planet: ${planets.last}\n")

    planets.addFirst("Mercury")
    println("Planets addFirst: $planets\n")

    planets.addLast("Pluto")
    println("Planets addLast: $planets\n")

    planets.removeFirst()
    println("Planets removeFirst: $planets\n")

    planets.removeLast()
    println("Planets removeLast: $planets\n")

    planets.reverse()
    println("Planets reverse: $planets\n")

    for(planet in planets)
    {
        println("Iterating: $planet\n")
    }

    planets.addAll(listOf("Jupiter", "Saturn"))

    for(planet in planets)
    {
        println("Iterating: $planet\n")
    }

    println("Planets size: ${planets.size}\n")

    planets.add(2, "Jupiter")
    println("Planets add: $planets\n")

    println("Planets size: ${planets.size}\n")

    println("Planets size: ${planets.distinct()}\n")

    if(planets.contains("Pluto")) println("Pluto is a Planet!") else println("Pluto is NOT a Planet!")

    planets.remove("Sun")
    println("Planets remove non-exist: $planets\n")

    planets.remove("Jupiter")
    println("Planets remove Jupiter 1: $planets\n")

    planets.remove("Jupiter")
    println("Planets remove Jupiter 2: $planets\n")

    planets.removeAll(listOf("Earth", "Venus"))
    println("Planets remove all: $planets\n")

    planets.removeAt(0)
    println("Planets remove at: $planets\n")

    planets.addAll(listOf("Earth", "Venus", "Mars"))
    planets.removeIf { x -> x.startsWith("V") }
    println("Planets remove if: $planets\n")

    planets.addAll(listOf("Earth", "Venus", "Mars"))

    planets.clear()
    println("Planets clear: $planets\n")

    println("Planets size: ${planets.size}\n")

    if(planets.isEmpty()) println("Planets list is empty!\n") else println("Planets list is NOT Empty!")

    var numbers =  LinkedList<Int>();
    numbers.addAll(listOf(21, 44, 99, 74, 33))
    println("Numbers max: ${numbers.max()}\n")

    println("Numbers max: ${numbers.min()}\n")
}

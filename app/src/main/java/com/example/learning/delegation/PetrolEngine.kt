package com.example.learning.delegation

class PetrolEngine: Engine {
    override fun start() = println("Petrol engine started")
    override fun stop() = println("Petrol engine stopped")
    override fun getSpeed() = 100

}
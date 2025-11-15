package com.example.learning.delegation

class Car(engine: Engine): Engine by engine {
    fun drive() {
        start()  // avtomatik engine.start() çağırılır
        println("Driving at ${getSpeed()} km/h")
        stop()   // avtomatik engine.stop() çağırılır
    }
}
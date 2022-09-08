package com.example.kmmlib

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
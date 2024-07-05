package com.example.demo.controller

import com.example.demo.`interface`.PremierService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PremierController (private val premierService: PremierService) {

    @GetMapping("/premier")
    fun premier():String{
        return premierService.getPremierService()
    }
}
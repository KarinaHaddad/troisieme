package com.example.demo.service

import com.example.demo.`interface`.PremierService
import org.springframework.stereotype.Service

@Service
class PremierServiceImp : PremierService {

    override fun getPremierService(): String {
        return "premier"
    }
}
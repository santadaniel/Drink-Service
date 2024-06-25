package com.danielsanta.drink.controller

import com.danielsanta.drink.model.mapper.DrinkMapper.toResponse
import com.danielsanta.drink.service.DrinkService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DrinkController(private val drinkService: DrinkService) {
    @GetMapping("/drinks")
    fun getDrinks() = drinkService.getDrinks().map { it.toResponse() }
}
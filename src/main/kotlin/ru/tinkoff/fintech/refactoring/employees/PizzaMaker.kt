package ru.tinkoff.fintech.refactoring.employees

import ru.tinkoff.fintech.refactoring.menu.Pizza


class PizzaMaker {

    fun makePizza(orderId: Int, pizza: Pizza) {
        println("[Пицца мейкер] Делаю пиццу: ${pizza.name}")
        println("[Пицца мейкер] Из ингридиетов:")
        var pizzaPrice = 0.0
        var ingredientCounter = 0
        pizza.ingredients.forEach {
            println("[Пицца мейкер] - ${it.ingredient.name}: в количестве ${it.count} за ${it.ingredient.price}$")
            pizzaPrice += it.ingredient.price * it.count
            ingredientCounter += it.count
        }

        println("[Пицца мейкер] время приготовления $ingredientCounter минут")
        val roundedPrice = "%.2f".format(pizzaPrice)
        println("[Пицца мейкер] в сумме за все $roundedPrice$")

        println("[Пицца мейкер] заказ $orderId готов")
    }

}

package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employees.*
import ru.tinkoff.fintech.refactoring.menu.*
import ru.tinkoff.fintech.refactoring.pizzaStore.PizzaStore


fun main() {
    val pizzaByName = listOf(Carbonara(), Marinara(), Sardinia(), Valtellina(), Peasant()).associateBy { it.name }
    val coffeeByName = listOf(Espresso(), Cappuccino()).associateBy { it.name }
    val pizzaStore = PizzaStore(
        Menu(pizzaByName, coffeeByName),
        PizzaMaker(),
        Barista()
    )
    try {
        pizzaStore.orderPizza("Маринара")
        pizzaStore.orderCoffee("Капучино")
    } catch (e: NoSuchElementException) {
        println("[Кассир]: ${e.message}")
    }
}

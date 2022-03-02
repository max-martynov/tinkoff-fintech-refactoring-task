package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employees.*
import ru.tinkoff.fintech.refactoring.menu.*


fun main() {
    val pizzaByName = listOf(Carbonara(), Marinara(), Sardinia(), Valtellina(), Peasant()).associateBy { it.name }
    val coffeeByName = listOf(Espresso(), Cappuccino()).associateBy { it.name }
    val pizzaStore = PizzaStore(
        Menu(pizzaByName, coffeeByName),
        PizzaMaker(),
        Barista()
    )
    val pizzaOrder = pizzaStore.orderPizza("Маринара")
    val coffeeOrder = pizzaStore.orderCoffee("Капучино")
    pizzaStore.executeOrder(pizzaOrder, coffeeOrder)
}

package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employees.*
import ru.tinkoff.fintech.refactoring.menu.*


fun main() {
    val pizzaSet = setOf(Carbonara(), Marinara(), Sardinia(), Valtellina(), Peasant())
    val coffeeSet = setOf(Espresso(), Cappuccino())
    val pizzaStore = PizzaStore(
        Menu(pizzaSet, coffeeSet),
        PizzaMaker(),
        Barista()
    )
    val pizzaOrder = pizzaStore.orderPizza("Маринара")
    val coffeeOrder = pizzaStore.orderCoffee("Капучино")
    pizzaStore.executeOrder(pizzaOrder, coffeeOrder)
}

package ru.tinkoff.fintech.refactoring.pizzaStore

import ru.tinkoff.fintech.refactoring.employees.*
import ru.tinkoff.fintech.refactoring.menu.Menu


class PizzaStore(
    private val menu: Menu,
    private val pizzaMaker: PizzaMaker,
    private val barista: Barista
) {

    private var orderNumber = 0

    fun orderCoffee(name: String) {
        val coffee = menu.findCoffeeByName(name)
            ?: throw NoSuchElementException("$name is not available for order at the moment.")

        barista.makeCoffee(++orderNumber, coffee)
    }

    fun orderPizza(name: String) {
        val pizza = menu.findPizzaByName(name)
            ?: throw NoSuchElementException("$name is not available for order at the moment.")

        pizzaMaker.makePizza(++orderNumber, pizza)
    }

}

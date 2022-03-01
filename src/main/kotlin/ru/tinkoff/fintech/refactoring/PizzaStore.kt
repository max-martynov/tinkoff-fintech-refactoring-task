package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employees.*
import ru.tinkoff.fintech.refactoring.menu.Menu


class PizzaStore(
    private val menu: Menu,
    private val pizzaMaker: PizzaMaker,
    private val barista: Barista
) {

    var orderNumber = 0

    fun orderCoffee(name: String): CoffeeOrder? {
        val coffee = menu.findCoffeeByName(name)
            ?: return null

        return CoffeeOrder(
            number = ++orderNumber,
            coffee = coffee
        )
    }

    fun orderPizza(name: String): PizzaOrder? {
        val pizza = menu.findPizzaByName(name)
            ?: return null

        return PizzaOrder(
            number = ++orderNumber,
            pizza = pizza
        )
    }

    fun executeOrder(pizzaOrder: PizzaOrder? = null, coffeeOrder: CoffeeOrder? = null) {
        if (pizzaOrder != null) {
            pizzaMaker.makePizza(pizzaOrder.number, pizzaOrder.pizza)
        }

        if (coffeeOrder != null) {
            barista.makeCoffee(coffeeOrder.number, coffeeOrder.coffee)
        }
    }

}

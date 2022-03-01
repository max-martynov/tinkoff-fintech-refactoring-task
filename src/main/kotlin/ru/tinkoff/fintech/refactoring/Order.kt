package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.menu.Coffee
import ru.tinkoff.fintech.refactoring.menu.Pizza


abstract class Order {
    abstract val number: Int
}

data class PizzaOrder(
    override val number: Int,
    val pizza: Pizza
) : Order()

data class CoffeeOrder(
    override val number: Int,
    val coffee: Coffee,
) : Order()

package ru.tinkoff.fintech.refactoring.menu

class Menu(private val pizzaSet: Set<Pizza>, private val coffeeSet: Set<Coffee>) {

    fun findPizzaByName(pizzaName: String): Pizza? =
        pizzaSet.find { it.name == pizzaName }

    fun findCoffeeByName(coffeeName: String): Coffee? =
        coffeeSet.find { it.name == coffeeName }

}

package ru.tinkoff.fintech.refactoring.menu

class Menu(private val pizzaByName: Map<String, Pizza>, private val coffeeByName: Map<String, Coffee>) {

    fun findPizzaByName(pizzaName: String): Pizza? =
        pizzaByName[pizzaName]

    fun findCoffeeByName(coffeeName: String): Coffee? =
        coffeeByName[coffeeName]

}

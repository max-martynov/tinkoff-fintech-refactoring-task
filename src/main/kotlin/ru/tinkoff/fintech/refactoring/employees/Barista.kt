package ru.tinkoff.fintech.refactoring.employees

import ru.tinkoff.fintech.refactoring.menu.Coffee

class Barista {

    fun makeCoffee(orderId: Int, coffee: Coffee) {
        println("[Бариста] Готовлю напиток: ${coffee.name}")
        println("[Бариста] Время приготовления: ${coffee.brewTimeInMinutes} минут")
        val roundedPrice = "%.2f".format(coffee.price)
        println("[Бариста] Стоимость напитка: $roundedPrice")
        println("[Бариста] заказ $orderId готов")
    }
}

package ru.tinkoff.fintech.refactoring.menu


abstract class Coffee : MenuItem() {
    abstract val brewTimeInMinutes: Int
}

data class Espresso(
    override val name: String = "Эспрессо",
    override var price: Double = 5.0,
    override val brewTimeInMinutes: Int = 5
) : Coffee()

data class Cappuccino(
    override val name: String = "Капучино",
    override var price: Double = 3.48,
    override val brewTimeInMinutes: Int = 6
) : Coffee()

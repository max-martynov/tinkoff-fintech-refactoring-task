package ru.tinkoff.fintech.refactoring.menu


abstract class Ingredient {
    abstract val name: String
    abstract var price: Double
}

data class Eggs(
    override val name: String = "Яйца",
    override var price: Double = 3.48
) : Ingredient()

data class Bacon(
    override val name: String = "Бекон",
    override var price: Double = 6.48
) : Ingredient()

data class Dough(
    override val name: String = "Тесто",
    override var price: Double = 1.00
) : Ingredient()

data class Cheese(
    override val name: String = "сыр",
    override var price: Double = 0.98
) : Ingredient()

data class Tomato(
    override val name: String = "Томат",
    override var price: Double = 1.53
) : Ingredient()

data class Olives(
    override val name: String = "Оливки",
    override var price: Double = 1.53
) : Ingredient()

data class Parmesan(
    override val name: String = "Пармезан",
    override var price: Double = 3.98
) : Ingredient()

data class Mushrooms(
    override val name: String = "Грибы",
    override var price: Double = 3.34
) : Ingredient()

data class Asparagus(
    override val name: String = "Спаржа",
    override var price: Double = 3.34
) : Ingredient()

data class Salami(
    override val name: String = "Салями",
    override var price: Double = 5.0
) : Ingredient()

data class MeatMix(
    override val name: String = "Мясное ассорти",
    override var price: Double = 9.38
) : Ingredient()

data class JerkedBeef(
    override val name: String = "Вяленая говядина",
    override var price: Double = 12.24
) : Ingredient()

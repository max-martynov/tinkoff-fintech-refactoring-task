package ru.tinkoff.fintech.refactoring.menu


abstract class Pizza : MenuItem() {

    override var price: Double
        get() = ingredients.sumOf { it.ingredient.price * it.count }
        set(value) {}

    abstract val ingredients: List<IngredientWithCount>

}

data class IngredientWithCount(
    val ingredient: Ingredient,
    val count: Int
)

data class Carbonara(
    override val name: String = "Карбонара",
    override val ingredients: List<IngredientWithCount> = listOf(
        IngredientWithCount(Eggs(), 1),
        IngredientWithCount(Bacon(), 2),
        IngredientWithCount(Dough(), 1),
        IngredientWithCount(Cheese(), 1)
    )
) : Pizza()

data class Marinara(
    override val name: String = "Маринара",
    override val ingredients: List<IngredientWithCount> = listOf(
        IngredientWithCount(Tomato(), 2),
        IngredientWithCount(Olives(), 3),
        IngredientWithCount(Dough(), 1)
    )
) : Pizza()

data class Sardinia(
    override val name: String = "Сардиния",
    override val ingredients: List<IngredientWithCount> = listOf(
        IngredientWithCount(Salami(), 3),
        IngredientWithCount(Olives(), 1),
        IngredientWithCount(Dough(), 1),
        IngredientWithCount(Cheese(), 3)
    )
) : Pizza()

data class Valtellina(
    override val name: String = "Вальтеллина",
    override val ingredients: List<IngredientWithCount> = listOf(
        IngredientWithCount(JerkedBeef(), 1),
        IngredientWithCount(Asparagus(), 1),
        IngredientWithCount(Dough(), 1),
        IngredientWithCount(Parmesan(), 2)
    )
) : Pizza()

data class Peasant(
    override val name: String = "Крестьянская",
    override val ingredients: List<IngredientWithCount> = listOf(
        IngredientWithCount(Mushrooms(), 3),
        IngredientWithCount(Tomato(), 1),
        IngredientWithCount(Dough(), 1),
        IngredientWithCount(Asparagus(), 1),
        IngredientWithCount(MeatMix(), 1)
    )
) : Pizza()

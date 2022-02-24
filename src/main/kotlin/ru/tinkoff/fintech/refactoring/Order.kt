package ru.tinkoff.fintech.refactoring


data class Order(
    val items: List<MenuItemWithCount>
)

data class MenuItemWithCount(
    val menuItem: MenuItem,
    val count: Int
)
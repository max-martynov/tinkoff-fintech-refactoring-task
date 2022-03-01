plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "ru.tinkoff"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("ru.tinkoff.fintech.refactoring.MainKt")
}
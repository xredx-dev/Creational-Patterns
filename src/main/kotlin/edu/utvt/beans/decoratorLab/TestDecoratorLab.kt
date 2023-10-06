package edu.utvt.beans.decoratorLab

fun main() {
    val dayOfTheDeadCelebration = DayOfTheDeadCelebration()
    println("Base Celebration: ${dayOfTheDeadCelebration.Decorate()}")

    val decoratedWithFlowers = FlowersDecorator(dayOfTheDeadCelebration)
    println("Decorated with Flowers: ${decoratedWithFlowers.Decorate()}")

    val decoratedWithSugarSkulls = SugarSkullsDecorator(dayOfTheDeadCelebration)
    println("Decorated with Sugar Skulls: ${decoratedWithSugarSkulls.Decorate()}")

    val decoratedWithCandles = CandlesDecorator(dayOfTheDeadCelebration)
    println("Decorated with Candles: ${decoratedWithCandles.Decorate()}")
}
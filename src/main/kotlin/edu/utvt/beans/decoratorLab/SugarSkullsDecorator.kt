package edu.utvt.beans.decoratorLab

class SugarSkullsDecorator(private val decoratedDay: DayOfTheDead) : DayOfTheDead {
    override fun Decorate(): String {
        val baseDecoration = decoratedDay.Decorate()
        return "$baseDecoration with sugar skulls"
    }
}
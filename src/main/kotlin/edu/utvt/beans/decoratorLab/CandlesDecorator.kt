package edu.utvt.beans.decoratorLab

class CandlesDecorator(private val decoratedDay: DayOfTheDead) : DayOfTheDead {
    override fun Decorate(): String {
        val baseDecoration = decoratedDay.Decorate()
        return "$baseDecoration with colorful candles"
    }
}
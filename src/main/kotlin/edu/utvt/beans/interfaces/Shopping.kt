package edu.utvt.beans.interfaces

interface Shopping {
    val items: MutableList<AmazonItem>

    fun removeItem(item: AmazonItem)

    fun checkOut(): PurchaseDetail
    abstract fun addItem(item: AmazonItem)
}
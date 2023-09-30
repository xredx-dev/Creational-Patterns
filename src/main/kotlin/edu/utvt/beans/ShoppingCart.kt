package edu.utvt.beans

import edu.utvt.beans.interfaces.AmazonItem
import edu.utvt.beans.interfaces.Shopping

object ShoppingCart:Shopping {
    val items = mutableListOf<AmazonItem>();

    fun addItem(item: AmazonItem){
        this.items.add(item);
    }

    override fun AddItem(item: AmazonItem) {
        TODO("Not yet implemented")
    }
}
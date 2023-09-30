package edu.utvt.beans

import edu.utvt.beans.interfaces.AmazonItem
import edu.utvt.beans.interfaces.PurchaseDetail
import edu.utvt.beans.interfaces.Shopping

object ShoppingCart:Shopping {
    override val items: MutableList<AmazonItem> = mutableListOf()
    override fun removeItem(item: AmazonItem) {
        items.removeIf { it.name == item.name }
    }
    override fun checkOut(): PurchaseDetail {
        val totalCostWithoutTaxes = calculateTotalCostWithoutTaxes()
        val totalCostWithTaxes = calculateTotalCostWithTaxes()

        return PurchaseDetail(items, totalCostWithoutTaxes, totalCostWithTaxes)
    }

    override fun addItem(item: AmazonItem) {
        this.items.add(item);
    }

    private fun calculateTotalCostWithoutTaxes(): Double {
        return items.sumOf { it.price }
    }
    private fun calculateTotalCostWithTaxes(): Double {
        val taxRate = 0.10
        val totalCostWithoutTaxes = calculateTotalCostWithoutTaxes()
        val taxAmount = totalCostWithoutTaxes * taxRate
        return totalCostWithoutTaxes + taxAmount
    }
}
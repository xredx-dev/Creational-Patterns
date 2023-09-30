package edu.utvt.beans.interfaces

data class PurchaseDetail(
    val items: List<AmazonItem>,
    val totalCostWithoutTaxes: Double,
    val totalCostWithTaxes: Double
)

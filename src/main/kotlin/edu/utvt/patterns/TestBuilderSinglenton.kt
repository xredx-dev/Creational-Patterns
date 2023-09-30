package edu.utvt.patterns

import edu.utvt.beans.Antivirus
import edu.utvt.beans.Shoes
import edu.utvt.beans.ShoppingCart
import edu.utvt.beans.interfaces.AmazonItem

fun main():Unit {
    val shoes = Shoes("Estrella del Sur");
    var shopping = ShoppingCart;
    var shopping2 = ShoppingCart;
    var antivirus = Antivirus("Estampita del tutor");

    ShoppingCart.addItem(shoes);

    ShoppingCart.addItem(antivirus);

    println(shoes);
    println("=======================");
    println(shoes);
    println(antivirus);
}

object TestBuilderSingleton {
    @JvmStatic
    fun main(args: Array<String>) {
        ShoppingCart.addItem(object : AmazonItem {
            override val name = "Producto 1"
            override val price = 20.0
        })
        ShoppingCart.addItem(object : AmazonItem {
            override val name = "Producto 2"
            override val price = 30.0
        })
        ShoppingCart.removeItem(object : AmazonItem {
            override val name = "Producto 1"
            override val price = 20.0
        })

        val purchaseDetail = ShoppingCart.checkOut()

        println("Detalle de la compra:")
        println("Elementos del carrito: ${purchaseDetail.items}")
        println("Costo total sin impuestos: ${purchaseDetail.totalCostWithoutTaxes}")
        println("Costo total con impuestos: ${purchaseDetail.totalCostWithTaxes}")
    }
}

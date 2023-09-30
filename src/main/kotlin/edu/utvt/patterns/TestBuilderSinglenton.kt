package edu.utvt.patterns

import edu.utvt.beans.Antivirus
import edu.utvt.beans.Shoes
import edu.utvt.beans.ShoppingCart

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
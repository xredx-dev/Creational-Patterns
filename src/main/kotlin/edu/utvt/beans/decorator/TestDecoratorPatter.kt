package edu.utvt.beans.decorator

import edu.utvt.beans.Color
import edu.utvt.beans.Shirt

fun main() {
    var wishList = WishList();
    var wishListGet = WishListGet(wishList);
    var wishListSetValidation = WishListSetValidation(wishList);

    val shirt = Shirt("T-Shirt", Color.WHITE);
    val shirt2 = Shirt("T-Shirt2", Color.ORANGE);
    val shirt3 = Shirt("T-Shirt2AAA", Color.GREEN);

    wishList.set("T-Shirt",shirt);
    wishListGet.set("T-Shirt",shirt2);

    wishListGet.get("T-Shirt");
    wishListGet.get("T-Shirt2");
    wishListSetValidation.set("T-Shirt2AAA",shirt3)

}
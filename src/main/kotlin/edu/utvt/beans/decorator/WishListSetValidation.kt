package edu.utvt.beans.decorator

import edu.utvt.beans.interfaces.AmazonItem
import edu.utvt.beans.interfaces.Wish

class WishListSetValidation(private  val wish:Wish):Wish by wish {

    private  val maxItemNameLength = 10;

    override fun set(itemName: String, item: AmazonItem) {
        require(itemName.length < maxItemNameLength){
            "$itemName name is longer than $maxItemNameLength characters!"
        }
        wish.set(itemName,item);
    }
}
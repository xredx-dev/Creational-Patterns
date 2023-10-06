package edu.utvt.beans.decorator

import edu.utvt.beans.interfaces.AmazonItem
import edu.utvt.beans.interfaces.Wish

class WishListGet(private val wish:Wish):Wish by wish {
    override fun get(itemNane:String):AmazonItem?{
        println("we are looking for: $itemNane");
        return wish[itemNane];
    }
}
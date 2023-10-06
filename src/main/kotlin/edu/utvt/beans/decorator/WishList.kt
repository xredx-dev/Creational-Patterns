package edu.utvt.beans.decorator

import edu.utvt.beans.interfaces.AmazonItem
import edu.utvt.beans.interfaces.Wish

class WishList:Wish {
    private val list = mutableMapOf<String,AmazonItem>()

    override fun get(itemName: String):AmazonItem?{
        return list[itemName]?:null;
    }

    override fun set(itemName: String,item: AmazonItem){
        println("New item has beed added: ${item}");
        list.put(itemName,item);
    }
}
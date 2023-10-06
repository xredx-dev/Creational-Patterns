package edu.utvt.beans.interfaces

interface Wish {
    operator fun get(itemName:String):AmazonItem?
    operator fun set(itemName: String, item:AmazonItem)
}
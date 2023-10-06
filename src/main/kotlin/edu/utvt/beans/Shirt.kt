package edu.utvt.beans

import edu.utvt.beans.interfaces.AmazonItem

data class Shirt(
    override var name: String,
    var color: Color = Color.PURPLE,
) : AmazonItem {
    override val price: Double
        get() = TODO("Not yet implemented")
}

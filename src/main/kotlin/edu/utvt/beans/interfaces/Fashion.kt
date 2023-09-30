package edu.utvt.beans.interfaces

import edu.utvt.beans.FashionStyles
import edu.utvt.beans.Outfit

interface Fashion {
    fun getOutfit(fashionStyles: FashionStyles):Outfit;
    fun getSportyOutfit():Outfit;
    fun getDefaultOutfit():Outfit;
}
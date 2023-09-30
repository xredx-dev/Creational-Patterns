package edu.utvt.beans

import edu.utvt.beans.interfaces.Fashion

object OutfitFactory: Fashion {
    override fun getOutfit(fashionStyles: FashionStyles): Outfit {
        val outfit = when (fashionStyles) {
            FashionStyles.SPORTY -> getSportyOutfit()
            FashionStyles.CASUAL -> getCasualOutfit()
            FashionStyles.CLASSIC -> getClassicOutfit()
            FashionStyles.STREET_WEAR -> getStreetwearOutfit()
            FashionStyles.PUNK -> getPunkOutfit()
            FashionStyles.PREPPY -> getPreppyOutfit()
            FashionStyles.GRUNGE -> getGrungeOutfit()
            FashionStyles.BOHEMIAN -> getBohemianOutfit()
        }
        return outfit
    }

    override fun getSportyOutfit(): Outfit = Outfit(
        Shirt("Sporty Shirt", Color.RED),
        Pants("Sporty Pants", Color.BLUE),
        Shoes("Sporty Shoes", Color.GREEN)
    )

    override fun getDefaultOutfit() = Outfit(
        Shirt("T-Shirts",Color.WHITE),
        Pants("Joggers",Color.GREEN),
        Shoes("Tennis",Color.YELLOW)
    )

    fun getCasualOutfit(): Outfit = Outfit(
        Shirt("Casual Shirt", Color.YELLOW),
        Pants("Casual Pants", Color.PURPLE),
        Shoes("Casual Shoes", Color.BLACK)
    )

    fun getClassicOutfit(): Outfit = Outfit(
        Shirt("Classic Shirt", Color.WHITE),
        Pants("Classic Pants", Color.BLACK),
        Shoes("Classic Shoes", Color.PINK)
    )

   fun getStreetwearOutfit(): Outfit = Outfit(
        Shirt("Streetwear Shirt", Color.ORANGE),
        Pants("Streetwear Pants", Color.GRAY),
        Shoes("Streetwear Shoes", Color.BLACK)
    )

    fun getPunkOutfit(): Outfit = Outfit(
        Shirt("Punk Shirt", Color.BLACK),
        Pants("Punk Pants", Color.BLACK),
        Shoes("Punk Shoes", Color.BLACK)
    )

    fun getPreppyOutfit(): Outfit = Outfit(
        Shirt("Preppy Shirt", Color.BLUE),
        Pants("Preppy Pants", Color.PURPLE),
        Shoes("Preppy Shoes", Color.WHITE)
    )

    fun getGrungeOutfit(): Outfit = Outfit(
        Shirt("Grunge Shirt", Color.GRAY),
        Pants("Grunge Pants", Color.BLACK),
        Shoes("Grunge Shoes", Color.ORANGE)
    )
    fun getBohemianOutfit(): Outfit = Outfit(
        Shirt("Grunge Shirt", Color.WHITE),
        Pants("Grunge Pants", Color.BLACK),
        Shoes("Grunge Shoes", Color.GRAY)
    )
}
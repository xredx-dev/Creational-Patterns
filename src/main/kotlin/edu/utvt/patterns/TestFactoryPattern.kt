package edu.utvt.patterns

import edu.utvt.beans.FashionStyles
import edu.utvt.beans.Outfit
import edu.utvt.beans.OutfitFactory

fun main() {
    val outfitFactory = OutfitFactory

    val sportyOutfit = outfitFactory.getOutfit(FashionStyles.SPORTY)
    val casualOutfit = outfitFactory.getOutfit(FashionStyles.CASUAL)
    val classicOutfit = outfitFactory.getOutfit(FashionStyles.CLASSIC)
    val streetwearOutfit = outfitFactory.getOutfit(FashionStyles.STREET_WEAR)
    val punkOutfit = outfitFactory.getOutfit(FashionStyles.PUNK)
    val preppyOutfit = outfitFactory.getOutfit(FashionStyles.PREPPY)
    val grungeOutfit = outfitFactory.getOutfit(FashionStyles.GRUNGE)

    println("Sporty Outfit:")
    printOutfitDetails(sportyOutfit)

    println("\nCasual Outfit:")
    printOutfitDetails(casualOutfit)

    println("\nClassic Outfit:")
    printOutfitDetails(classicOutfit)

    println("\nStreetwear Outfit:")
    printOutfitDetails(streetwearOutfit)

    println("\nPunk Outfit:")
    printOutfitDetails(punkOutfit)

    println("\nPreppy Outfit:")
    printOutfitDetails(preppyOutfit)

    println("\nGrunge Outfit:")
    printOutfitDetails(grungeOutfit)
}

fun printOutfitDetails(outfit: Outfit) {
    println("Shirt: ${outfit.shirt.name} (${outfit.shirt.color})")
    println("Pants: ${outfit.pants.name} (${outfit.pants.color})")
    println("Shoes: ${outfit.shoes.name} (${outfit.shoes.color})")
}

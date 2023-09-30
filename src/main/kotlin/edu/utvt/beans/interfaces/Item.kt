package edu.utvt.beans.interfaces

import edu.utvt.beans.Color
import edu.utvt.beans.Department

abstract class Item(override var name:String, open var color:Color, open var department: Department):AmazonItem
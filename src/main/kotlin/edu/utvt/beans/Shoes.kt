package edu.utvt.beans

import edu.utvt.beans.interfaces.Item

data class Shoes(
    override var name: String,
    override var color: Color = Color.BLACK,
    override var department: Department = Department.HOME_AND_KITCHEN
):Item(name, color, department)

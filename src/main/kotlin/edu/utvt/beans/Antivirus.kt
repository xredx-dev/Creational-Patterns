package edu.utvt.beans

import edu.utvt.beans.interfaces.Item

data class Antivirus(
    override var name:String,
    override var color: Color = Color.GREEN,
    override var department: Department = Department.COMPUTERS
):Item(name, color, department) {
    override val price: Double
        get() = TODO("Not yet implemented")
}

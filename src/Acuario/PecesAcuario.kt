package Acuario

abstract class Pez {
    abstract val color: String
}
interface AccionPez {
    fun comer()
}

class Tiburon: Pez(), AccionPez{
    override val color = "gris"

    override fun comer (){
        println("Comer y cazar ")
    }
}
class PezPayaso: Pez(), AccionPez{
    override val color = "dorado"
    override fun comer (){
        println("Comer algas")
    }
}

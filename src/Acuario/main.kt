package Acuario

fun construirAcuario() {

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}
fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburón es de color: ${tiburon.color}")
    tiburon.comer()
    println("El pez payaso es de color: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main(){
    construirAcuario()
}
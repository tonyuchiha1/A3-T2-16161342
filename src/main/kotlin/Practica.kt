fun main() {

    var listaMutable = MutableList(10) {
        (1 + Math.random() * 10).toInt()
    }

    var pos = 0
    listaMutable.forEach {
        println("La posicion es:$pos contiene $it")
        pos += 1
    }

    buscar(listaMutable, 0)

}
fun buscar(lista: MutableList<Int>, Indice: Int) {
    if (Indice <= 9) {

        if (lista.elementAt(Indice) == 5)
            println("es 5 en :la posicion $Indice")
        buscar(lista, Indice + 1)
    }
}
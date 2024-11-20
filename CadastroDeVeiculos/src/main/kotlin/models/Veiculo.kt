package models;

abstract class Veiculo(val modelo: String, val marca: String, val ano: Int) {
    var placa: String = ""

    abstract fun obterCategoria(): String

    open fun mostrarDetalhes() {
        println("Modelo: $modelo, Marca: $marca, Ano: $ano, Placa: $placa")
    }

    fun setPlaca(placa: String) {
        this.placa = placa
    }
}
package models;

//carro herda ( : ) veiculo (class carro: veiculo)
class Carro(modelo: String, marca: String, ano: Int, val numeroDePortas:Int) : Veiculo(modelo,marca,ano) { 
    override fun obterCategoria(): String {
        return "Carro";
    }
    override fun mostrarDetalhes(){
        super.mostrarDetalhes();
        println("Número de portas: $numeroDePortas")
    }
}
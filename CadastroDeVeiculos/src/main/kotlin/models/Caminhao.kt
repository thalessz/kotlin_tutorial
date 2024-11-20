package models;

class caminhao (modelo:String, marca:String, ano:Int, val capacidadeCarga: Double) : Veiculo(modelo,marca,ano) {
    override fun obterCategoria(): String {
        return "caminhao"
    }
    override fun mostrarDetalhes(){
        super.mostrarDetalhes();
        println("Capacidade de carga $capacidadeCarga toneladas");
    }
    
}
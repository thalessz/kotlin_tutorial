package models;

class CadastroDeVeiculos {
    private val listaVeiculos = mutableListOf<Veiculo>()

    fun cadastrarVeiculo(veiculo: Veiculo) {
        listaVeiculos.add(veiculo);
    }

    fun exibirVeiculos(): List<Veiculo> {
        return listaVeiculos;
    }

    fun buscarVeiculoPorModelo(modelo: String): Veiculo? {
        return listaVeiculos.find { it.modelo == modelo }
    }
}
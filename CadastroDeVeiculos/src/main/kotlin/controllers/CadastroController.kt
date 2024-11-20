package controllers;

class cadastroController(private val cadastro: CadastroDeVeiculos) {
    fun cadastrarVeiculo(){
        println("Digite o modelo do veículo:");
        val modelo = readLine() ? : "";
        println("Digite a marca do veículo");
        val marca = readline() ? : "";
        println("Digite o ano do veículo:");
        val ano = readLine()?.toIntOrNull() ?: 2022;
        println("Digite o número de portas do veículo");
        val ano = readLine()?.toIntOrNull() ?: 2;


        val carro = Carro(modelo,marca,ano,4);
        cadastro.cadastrarVeiculo(carro);
        println("Veículo inserido com sucesso!");
    }

    fun exibirVeiculos(){
        val veiculos = cadastro.exibirVeiculos();
        if (veiculos.isEmpty()){
            println("nenhum veículo encontrado")
        } else {
            veiculos.forEach {
                veiculo -> veiculo.mostrarDetalhes()
            }
        }
    }

    fun buscarVeiculo(){
        println("Digite o modelo do veículo para busca:")
        val modelo = readLine()?:""
        val veiculo = cadastro.buscarVeiculoPorModelo(modelo)
        if(veiculo != null){
            veiculo.mostrarDetalhes()
        } else {
            println("Veículo não encontrado");
        }
    }
}
    
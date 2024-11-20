import models.CadastroDeVeiculos
import controllers.CadastroController

fun main(){
    val cadastroDeVeiculos = CadastroDeVeiculos();
    val cadastroController = CadastroController(cadastroDeVeiculos);

    var continuar: Boolean = true; 
    while(continuar){
        println("\nMenu:")
        println("1. Cadastrar Veículo")
        println("2. Exibir Veículos Cadastrados")
        println("3. Buscar Veículo")
        println("4. Sair")
        println("Escolha uma opção:")

        when (readLine()?.toInt()) {
            1 -> cadastroController.cadastrarVeiculo()
            2 -> cadastroController.exibirVeiculos()
            3 -> cadastroController.buscarVeiculo()
            4 -> continuar = false
            else -> println("Opção inválida!")
        }
    }
}
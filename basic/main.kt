// Declaração de Variáveis
// Imutável
val nome: String = "Kotlin"
println(nome) // Imprime "Kotlin"

// Mutável
var idade: Int = 25
idade = 26
println(idade) // Imprime 26

// Tipos de Dados
val inteiro: Int = 10
val texto: String = "Kotlin"
val flutuante: Double = 10.5
val booleano: Boolean = true

// Listas
val listaImutavel = listOf("Kotlin", "Java")
println(listaImutavel) // Imprime [Kotlin, Java]

val listaMutavel = mutableListOf("Kotlin", "Java")
listaMutavel.add("Python")
println(listaMutavel) // Imprime [Kotlin, Java, Python]

// Mapas
val mapa = mapOf(1 to "Um", 2 to "Dois")
println(mapa) // Imprime {1=Um, 2=Dois}

val mapaMutavel = mutableMapOf(1 to "Um")
mapaMutavel[2] = "Dois"
println(mapaMutavel) // Imprime {1=Um, 2=Dois}

// Arrays
val array = arrayOf(1, 2, 3)
array[0] = 10
println(array[0]) // Imprime 10

// Estruturas de Loop
// For
for (i in 1..5) {
    println(i) // Imprime números de 1 a 5
}

// While
var contador = 0
while (contador < 5) {
    println(contador)
    contador++
}


val numero = -1
val resultado = if (numero > 0) "Positivo" else "Negativo"
println(resultado) 

// When é tipo um switch case
val opcao = 1
when (opcao) {
    1 -> println("Um")
    else -> println("Outro")
}

// Função Simples
fun soma(a: Int, b: Int): Int {
    return a + b
}

println(soma(5, 10)) 

// Função com retorno unit
fun saudacao() {
    println("Olá, seja bem-vindo ao Kotlin!")
}

saudacao() 

// Função com Lambda
val multiplicar: (Int, Int) -> Int = { a, b -> a * b }
println(multiplicar(4, 5)) 

// Operações com Nullable (Null Safety)
val nomeNullable: String? = null
println(nomeNullable?.length ?: "Nome é nulo") // Imprime "Nome é nulo"

// Try/Catch
try {
    val resultadoDivisao = 10 / 0
} catch (e: ArithmeticException) {
    println("Erro: ${e.message}") 
} finally {
    println("Finalizando operação.") 
}

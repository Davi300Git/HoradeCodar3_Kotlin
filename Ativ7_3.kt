// 7 - Escreva um algoritmo para ler as notas de avaliações de um aluno,
// calcule e imprima a média (simples) desse aluno. Só devem ser aceitos
// valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido,
// deve ser solicitado um novo valor ao usuário.

fun main() {
    val totalNotas = 6
    var soma = 0.0

    println("Calculadora de Média de Aluno")
    println("Por favor, insira 6 notas válidas(entre 0 e 10).")

    for(i in 1..totalNotas){
        var nota: Double
        do {
            println("Digite a nota $i:")
            nota = readln().toDouble()

            if (nota < 0 || nota > 10) {
                println("Nota inválida! A nota deve estar entre 0 e 10. Tente novamente.")
            }
        }while (nota < 0 || nota > 10) // Repete até que uma nota válida seja inserida

        soma += nota // Adiciona a nota válida à soma
    }

    // Calcula a média
    val media = soma / totalNotas

    // Exibe o resultado
    println("A média do aluno é: $media")
}
    
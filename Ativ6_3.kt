//6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
// Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem
// "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S",
// o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a
// quantidade de alunos aprovados.

fun main(){
    var aprovados = 0
    var continuar : String

    do{
        println("Digite a primeira nota: ")
        val nota1 = readln().toDouble()
        println("Digite a primeira nota: ")
        val nota2 = readln().toDouble()

        val media = (nota1 + nota2) / 2
        println("A média final do aluno é: $media")
        if(media >= 9.5){
            println("Aluno aprovado!")
        }
        else{
            println("Aluno reprovado!")
        }
        println("Calcular a média de outro aluno Sim/Não? (S/N)")
        continuar = readln().uppercase()
    }while(continuar == "S")
    println("Total de alunos aprovados: $aprovados")
}
//5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números
// inteiros informados pelo usuário e todos os números inteiros entre eles.
// Considere que o primeiro sempre será menor que o segundo.

fun main(){
    println("Digite o primeiro número inteiro: ")
    val num1 = readln().toInt()
    println("Digite o segundo número inteiro(maior que o primeiro): ")
    val num2 = readln().toInt()

    if (num2 <= num1) {
        println("O segundo número dave ser maior que o primeiro.")
        return
    }

    var soma = 0
    var quantidade = 0

    for (i in num1..num2) {
        soma +=  i
        quantidade++
    }
    val media = soma.toDouble() / quantidade
    println("A média arimética dos números entre $num1 e $num2 é: $media")
}

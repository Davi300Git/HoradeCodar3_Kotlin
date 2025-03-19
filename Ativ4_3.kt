// 4 - Faça um algoritmo que calcule e escreva a média aritmética dos
// números inteiros entre 15 (inclusive) e 100 (inclusive).
fun main(){
    var soma = 0
    var conta = 0

    for(i in 15..100){
        soma += i
        conta ++
    }
    val media = soma.toDouble() / conta

    println("A média dos entre 15 e 100 é: $media")
}
//8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
// Considere que o N será sempre maior que ZERO.
//N  é um valor informado pelo usuário

fun main(){
    println("Digite um valor para N(maior que zero")
    val n  = readln().toInt()

    if(n <= 0){
        println("O valor de N dave ser maior que zero.")
        return
    }
    println("Valores inteiros de 1 até $n:")
    for (i in 1..n){
        println(i)
    }
}
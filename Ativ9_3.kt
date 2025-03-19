// 9 - Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.

fun main(){
    var num = 101
    val quantidade = 10
    var contador = 0

    println("Os 10 primeiros números inteiros maiores que 100 são:")
    while (contador < quantidade){
        println(num)
        num++
        contador++
    }
}

//11 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.
fun main(){
    println("Digite um valor para N (maior que zero): ")
    val n = readLine()!!.toInt()

    if (n <= 0) {
        println("O valor de N deve ser maior que zero.")
        return
    }
    for (i in 1..n) {
        println("\nTabuada do $i:")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }
}
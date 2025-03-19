// 10 - Escreva um programa em que o usuário informe 10 valores e escreva
// quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42)
// e quantos deles estão fora deste intervalo.

fun main(){
    val totalValores = 10
    var dentroIntervalo = 0
    var foraIntervalo = 0

    println("Digite 10 valores:")
    for (i in 1..totalValores){
        println("Digite o valor $i: ")
        val valor = readln().toDouble()

        if (valor >= 24 && valor <= 42){
            dentroIntervalo++
        }
        else{
            foraIntervalo
        }
    }
    println("Quantidade de valores dentro do intervalo [24, 42]: $dentroIntervalo")
    println("Quantidade de valores fora do intervalo [24, 42]: $foraIntervalo")
}
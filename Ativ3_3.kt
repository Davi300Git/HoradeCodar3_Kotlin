//3 - Escreva um algoritmo para imprimir os números de 1
// (inclusive) a 10 (inclusive) em ordem decrescente.
//Exemplo: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

fun main(){
    println("Iniciando contagem ...")

    for(i in 10 downTo 1){
        print(i)
        Thread.sleep(1000)
        if(i > 1) {
            print(",")
        }
    }
}
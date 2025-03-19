fun main() {
    println("Iniciando contagem regressiva...")

    for (i in 30 downTo 0) {
        println(i) // Exibe o número atual da contagem
            Thread.sleep(1000)
    }
    println("EXPLOSÃO!!!")
}

fun main() {
    println("Iniciando contagem regressiva...")

    for (i in 30 downTo 0) {
        println(i) // Exibe o número atual da contagem
        try {
            Thread.sleep(900)
        } catch (e: InterruptedException) {
            e.printStackTrace() // Trata possíveis erros durante a pausa
        }
    }
    println("EXPLOSÃO!!!")
}
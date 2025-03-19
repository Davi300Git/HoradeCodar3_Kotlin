//2 - Escreva um algoritmo para ler 2 valores informados pelo usuário e enquanto
// o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo valor,
// mas para a mesma variável. Ou seja, para o segundo valor não pode ser aceito o valor
// zero nem um valor negativo.
//O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo
// segundo valor e exibir o resultado ao usuário.

fun main(){
    print("Digite o primeiro valor: ")
    val valor1 = readln().toDouble()
    var valor2 : Double

    do{
        print("Digite o segundo valor(deve ser maior que zero): ")
        valor2 = readln().toDouble()
        if(valor2 <= 0){
            println("Valor Inválido! O segundo valor deve ser maior que zero.")
        }
    }
        while (valor2 <= 0 )
        val resultado = valor1/ valor2
    println("O resultado é: $resultado")
}

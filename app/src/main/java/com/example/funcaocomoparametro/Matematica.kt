package com.example.funcaocomoparametro


fun main() {

    val n1 = 30
    val n2 = 10
    println("Cálculos de mátemática utilizando 2 números $n1 e $n2")

    println()
    println("Adição")
    val ret1 = Calculo(n1,n2,::soma)
    println("Resultado de Adição: $ret1")

    println()
    println("Subtração")
    val ret4 = Calculo(n1,n2,::subtracao)
    println("Resultado de Subtração: $ret4")

    println()
    println("Multiplicação")
    val ret2 = Calculo(n1,n2,::multiplicacao)
    println("Resultado de Multiplicação $ret2")

    println()
    println("Divisão")
    val ret3 = Calculo(n1,n2,::divisao)
    println("Resultado de Divisão: $ret3")
}

fun Calculo(a: Int,b:Int, funcao: (Int,Int)-> Int): Int{
    val resposta = funcao(a,b)
    return resposta
}

fun soma(n1: Int, n2: Int): Int{
    return n1+n2
}

fun subtracao(n1: Int, n2: Int): Int{
    return n1-n2
}

fun multiplicacao(n1: Int, n2: Int): Int{
    return n1*n2
}

fun divisao(n1: Int, n2: Int): Int{
    return n1/n2
}



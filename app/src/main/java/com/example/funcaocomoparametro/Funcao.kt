package com.example.funcaocomoparametro

import kotlin.reflect.KFunction2

fun main(){

    println("1) Utilizando a função soma")
    val result = somar (10,5)
    println("Resultado de Soma: $result")

    println()
    println("2) Utilizando soma através da classe matemática")
    val result2 = Matematica()
    println("Resultado de Soma: ${result2.somar(20,25)}")

    println()
    println("3) Passando função somar como parâmetro")
    val result3 = calculadora (10, 30, ::somar)
    println("Resultado de Soma: $result3")

    println()
    println("4) Passando função Multiplicar como parâmetro")
    val result4 = calculoGeral(10,10, ::multiplica  )
    println("Resultado de Multiplica: $result4")


    println()
    println("5) Passando soma através da classe matemática")
    val mat = Matematica()
    val result5 = mat.somar(12,10)
    println("Resultado de Soma: $result5")


}

fun somar(n1:Int, n2:Int): Int{

    val calculoSoma = n1+n2
    return calculoSoma
}

class Matematica{

    fun somar(n1: Int,n2:Int): Int{
        val resp = n1 + n2
        return resp
    }

}

fun calculadora(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{

    val retorno = funcao(a, b)
    return  retorno

}

fun multiplica(n1: Int, n2: Int): Int {

    return n1*n2

}


fun calculoGeral(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{

    val retCalculo = funcao(a,b)
    return retCalculo
}
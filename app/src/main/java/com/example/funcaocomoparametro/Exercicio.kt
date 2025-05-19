package com.example.funcaocomoparametro

fun main(){

    val cat = Cat("Mingau","Siamês", 2 )
    cat.commonAll()
    cat.especific()

    println()
    val dog = Dog("Bilu","Pequinês", 4)
    dog.commonAll()
    dog.especific()
}

open class Animals(racas: String, idades: Int){
    val raca = racas
    val idade = idades
    fun commonAll(){
        println("Respirar e comer é comum a todos os animais")
        println("Raça do animal $raca e a idade: $idade")
    }
}


class Cat(nome: String, raca: String, idade: Int): Animals(raca, idade ){
    val nome = nome
    fun especific (){
        println("Característica particular Miar")
        println("Nome do pet: $nome")

    }
}

class Dog(nome: String, raca: String, idade: Int): Animals(raca, idade){
   val nome = nome
    fun especific (){
        println("Característica particular Latir")
        println("Nome do pet: $nome")
    }
}
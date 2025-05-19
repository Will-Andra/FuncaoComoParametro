package com.example.funcaocomoparametro


fun main() {
    val cachorro = Cachorro("Rex", 3, "Labrador")
    cachorro.exibirDetalhes()
    cachorro.latir()

    val gato = Gato("Mimi", 2, "Cinza")
    gato.exibirDetalhes()
    gato.miar()
}

open class Animal(val nome: String, val idade: Int) { //Open permite que seja herdado
    fun exibirDetalhes() {
        println("Nome: $nome, Idade: $idade anos")
    }
}

class Cachorro(nome: String, idade: Int, val raca: String) : Animal(nome, idade) {
    fun latir() {
        println("$nome da raça $raca, está latindo! 🐶")
    }
}

class Gato(nome: String, idade: Int, val cor: String) : Animal(nome, idade) {
    fun miar() {
        println("$nome que é da cor $cor, está miando! 🐱")
    }
}
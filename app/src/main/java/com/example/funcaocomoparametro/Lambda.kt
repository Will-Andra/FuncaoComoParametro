package com.example.funcaocomoparametro

fun main(){

    val botao = Botao()
    //Aqui a função lámbida é criada mas não é quem executa. Quem executa é o método em botão
    botao.setSetupBotao{nome ->  //função com parâmetro "nome" que é uma string, mas que só vai ser definido la no metodo que é quem recebe e executa
        println("Executando uma função Lambda para nome: $nome") //posso usar n"ome" aqui, pois qdo for executada o setSetupBotao vai me passar a informação
    }

    val carro = Carro("Ferrari")
    carro.setModelo { marca ->
        println("Marca Selecionada pelo usuário: $marca")
    }

}

class Botao{
    fun setSetupBotao(funcao: (String)-> Unit){ //é como se recebece a função inteira, com um parâmetro
        funcao("José da Silva") //Eu passo o parâmetro para função
    }
}

class Carro(nomeMarca: String){
    val nome = nomeMarca
    fun setModelo(funcao: (String)-> Unit){
        funcao(nome)
    }

}
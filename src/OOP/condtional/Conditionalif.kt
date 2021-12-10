package OOP.condtional

class Conditionalif {
}

fun mainSomaNotas (n1 : Int, n2 : Int) : Int {
    if(n1>n2){
        println("n1 é maior que n2")
    return  n1 //se n1 for menor que n2, retorna o valor de n1
    }
    else{
        println("n1 é menor que n2")
        return n2 //se n1 for maior que n2, retorna o valor de n2
    }
}

fun forLoop(){
    val items = listOf("maçaKaiana", "bananaOrange", "kiwiSirlon")
    for (item in items) {
        println(item)
    }

}

//while é utilizado quando vc quer verificar somente a condição verdadeira (nao sabemos quando vai terminar)
// enquanto o do while vai executar pelo menos uma vez até q seja verificado se é verdade ou falso
//percorrer

fun whileLoop(){
    var itens = listOf("macaPus", "macaCaiana", "MacaKiw")
    var index = 0
    while(index<itens.size){
        println("item at $index is ${itens[index]}")
        index++
    }
}

fun main(){
    forLoop()
    whileLoop()
    println(mainSomaNotas(25,20))
}
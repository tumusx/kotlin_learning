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
fun main(){
    println(mainSomaNotas(25,20))
}
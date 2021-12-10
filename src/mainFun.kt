

/*o ponto de entrada da linguagem kotlinn é a fun main, ou seja,
 vamos rodar a partir dela, igual no  C :D --> Também tem como fazer isso obtendo args strings
 a gente cria uma funcao de um tipo e depois chamamos na fun main passando
 algum dado ()

*/

fun sum(a:Int, b: Int): Int = a+b // o corpo da funcao pode ser uma expressao, mas ela nao vai retornar um tipo definido igual essa implementada abaixo

fun printSum(x: Int, y: Int) { // é uma funcao que nao retorna nada, ou seja, Unit (similar logico com o void)

    println("sum of $x and $y is ${x+y}")
}

/*
fun sum(a:Int, b: Int): Int{
return a+b --> retorno é definido
}
*/
//podemos fazer a declaracoa da variavel antes do comeco da funcao, como abaixo

val pi = 3.14
var x = 0

fun incrementX(){
    x += 1
}

fun variaveisKotlin () {
        val var1: Int = 1 // valor imutável
        var var2 = 2 // valor mutável porem nao associando o tipo da variavel
        val var3:Int //especificado o tipo, mas nao o valor contido na variavel
        val var4:Int? //espeficando o tipo e o valor pode ser nulo //tratamento de erro

}

fun main(){
        incrementX()
        printSum(1,29)

        println(sum(1,2))

}


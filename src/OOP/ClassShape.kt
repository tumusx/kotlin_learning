package OOP
open class ClassHerdada

class ClassShape (var altura:Double, var largura:Double) {
        var perimetro = (largura + altura) * 2

 }

fun main(){
    val shape = ClassShape(10.0, 20.0)
    println(shape.perimetro)
}
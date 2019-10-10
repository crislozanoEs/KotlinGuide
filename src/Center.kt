import Classes.Person
import java.util.*

fun main(args: Array<String>){
    var saludos = listOf("hola", "hi", "hello", "Arribederchi")
    foo("Los mensajes son: \n") {for((index,value) in saludos.withIndex()) imprimirEdad2(value,index)}
    foo("El mensaje es ", { imprimirEdad1("hola",1) })
    var person =  Person(identification = 3)
    val (born, type) = getTypeAndYear(person.age)
    println("Was born in $born, so he/she is a $type")
}

fun foo(generalMessage: String, bar: ()->Unit){
    print("$generalMessage")
    bar()
}

val imprimirEdad2 :(String, Int)->Unit ={message, cant->print("$cant. $message\n")}
fun imprimirEdad1(message: String, cant: Int){
    println("$cant. $message")
}

fun getTypeAndYear(age: Int = 0): Pair<Int,String>{
    val year = Calendar.getInstance().get(Calendar.YEAR)
    val type = if(age<18) "kid" else if(age<60) "adult" else "senior"
    return (year-age to type)
}
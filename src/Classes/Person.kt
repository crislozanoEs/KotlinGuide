package Classes

import java.util.*

open class Person (var age: Int = 0, var name: String = "", var telephone: Int = 123, var lastName: String){  //Error (in the constructor) if the parameters are not initialized

    open var culture = "global"
    constructor(identification: Int): this(lastName = "lolo"){ //If the parameter is not initialized the secondary constructor has to give it a value
        if(identification==3){
            age = 21
            name = "pepe"
            telephone = 2112222
        }
    }

    var born = Calendar.getInstance().get(Calendar.YEAR) - age //It is initialized when we call the constructor.
}

/**
class LatinPerson: Person(identification = 12){  //NO FUNCIONA ASI!
    override var culture = "latin"
    constructor(identification: Int) : super() {
        if(identification==12){
            age = 48
            name = "pepo"
            telephone = 22222222
        }
    }
}
*/


class LatinPerson(identification: Int) : Person(identification=12) {  //SI FUNCIONA
    override var culture = "latin"

    init {
        if(identification==12){
            age = 48
            name = "pepo"
            telephone = 22222222
        }
    }
}

abstract class hablar(){

    abstract var tono: String
}
class gritar():hablar(){
    override var tono = "duro"
}
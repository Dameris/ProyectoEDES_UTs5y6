package clases

class Pokemon(tipo: String,Nombre:String,Lore:String,Fuerza:Int,Vida:Int) : Tipo(tipo) {
    var nombre = ""
    var lore = ""
    var fuerza = 0
    var vida = 0

    init {
        nombre = Nombre
        lore = lore
        fuerza = Fuerza
        vida = Vida
    }


}
package clases

class Pokemon(tipo: String,Nombre:String,Lore:String,Fuerza:Int,Vida:Int) : Tipo(tipo) {
    var nombre = ""
    var lore = ""
    var fuerza = 0
        set(value) {
            if (value<0){
                println("La fuerza no puede ser negativa")
            }
        }
    var vida = 0
        set(value) {
            if (value<0){
                println("La vida no puede ser negativa")
            }
        }
    init {
        nombre = Nombre
        lore = lore
        fuerza = Fuerza
        vida = Vida
    }


}
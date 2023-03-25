package clases

class Pokemon(tipo: String, nombre:String, lore:String, fuerza:Int, vida:Int) : Tipo(tipo) {
    private var nombre = ""
    private var lore = ""
    private var fuerza = 0
        set(value) {
            if (value < 0){ println("La fuerza no puede ser negativa") }
            else { field = value }
        }
    private var vida = 0
        set(value) {
            if (value<0){ println("La vida no puede ser negativa") }
            else { field = value }
        }
    init {
        this.fuerza = fuerza
        this.vida = vida
    }
}
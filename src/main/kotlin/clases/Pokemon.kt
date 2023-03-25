package clases

class Pokemon(tipo: String, nombre:String, lore:String, fuerza:Int, vida:Int) : Tipo(tipo) {
    private var nombre = ""
    private var lore = ""
    private var fuerza = 0
    private var vida = 0

    init {
        this.nombre = nombre
        this.lore = lore
        this.fuerza = fuerza
        this.vida = vida
    }
}
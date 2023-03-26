package clases

open class Pokemon(tipo: String, nombre:String, lore:String, fuerza:Int, vida:Int) : Tipo(tipo) {
     var nombre = ""
        set(value) {
            if (value.isEmpty()) { throw IllegalArgumentException("El nombre no puede estar vacío") }
            else { field = value }
        }
     var lore = ""
        set(value) {
            if (value.isEmpty()) { throw IllegalArgumentException("El lore del Pokémon no puede estar vacío") }
            else { field = value }
        }
     var fuerza = 0
        set(value) {
            if (value < 0){ throw IllegalArgumentException("La fuerza no puede ser negativa") }
            else { field = value }
        }
     var vida = 0
        set(value) {
            if (value<0){ throw IllegalArgumentException("La vida no puede ser negativa") }
            else { field = value }
        }
    init {
        this.nombre = nombre
        this.lore = lore
        this.fuerza = fuerza
        this.vida = vida
    }

    fun recibirAtaque(ataque: Ataque): Double { return vida - (ataque.danyo * multiplicadorInicial) }
    override fun toString(): String {
        return "Pokémon\n" +
                "---------\n" +
                "Nombre: $nombre\n" +
                "Tipo: $tipo\n" +
                "Lore: $lore\n" +
                "Fuerza: $fuerza\n" +
                "Vida: $vida\n\n"
    }
}
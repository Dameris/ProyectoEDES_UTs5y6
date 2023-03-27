package clases
/**
 *
 * Clase para crear un Pokemon
 * Esta clase hereda de la clase Tipo
 *
 * @property Pokemon
 * @constructor tipo, nombre, lore, fuerza, vida
 * @param nombre indica el nombre del pokemon el cuál tiene un setter que impide que el argumento este vacio
 * @param lore indica el lore con algunas caracteristicas del pokemon el cuál tiene un setter que impide que el argumento este vacío
 * @param fuerza indica los puntos de fuerza que tiene el pokemon el cuál tiene un setter que impide que el número no sea menor a 0
 * @param vida indica los puntos de vida que tiene el pokemon el cuál tiene un setter que impide que el número no sea menor a 0
 * @author Alejandro Diaz y Daniel Merino
 * @since 1.0
 *
 */
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

    /**
     * Aquí inicializamos el constructor en las variables creadas
     */
    init {
        this.nombre = nombre
        this.lore = lore
        this.fuerza = fuerza
        this.vida = vida
    }

    /**
     * Esta función recibe el ataque del pokemon
     *
     * @return La vida actualizada después del ataque recibido
     *
     */
    fun recibirAtaque(ataque: Ataque): Double { return vida - (ataque.danyo * multiplicadorInicial) }

    /**
     * Este método devuelve una cadena que representa el pokemon con todos los detalles
     *
     * @return Una representación en formato cadena del pokemon
     */
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
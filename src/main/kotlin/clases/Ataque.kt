package clases

/**
 *
 * Clase para crear un ataque
 * Esta clase hereda de la clase Tipo
 *
 * @property Ataque
 * @constructor nombre, tipo(clase tipo), danyo
 * @param nombre Indica el nombre del ataque y tiene un setter que impide que el texto este vacío
 * @param danyo Indica el daño del ataque y tiene un setter que impide que el número pueda ser negativo
 * @author Alejandro Diaz y Daniel Merino
 * @since 1.0
 *
 */

class Ataque(var nombre: String, tipo: String, danyo: Int): Tipo(tipo) {

    internal var danyo = 0
        set(value) {
            if (value < 0){ throw IllegalArgumentException("El daño no puede ser negativo") }
            else { field = value }
        }
    /**
     * Se inicializa el constructor
     */
    init {
        this.danyo = danyo
    }
}
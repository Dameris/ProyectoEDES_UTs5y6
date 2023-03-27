package clases

/**
 *
 * Clase para crear un jugador
 * Esta clase hereda de la clase Jugador
 *
 * @property Jugador
 * @constructor tipo, nombre, lore, fuerza, vida
 * @author Alejandro Diaz y Daniel Merino
 * @since 1.0
 *
 */

class Jugador(tipo: String, nombre: String, lore: String, fuerza: Int, vida: Int):
    Pokemon(tipo, nombre, lore, fuerza, vida)
package clases

/**
 *
 * Clase para crear un jugador
 * Esta clase hereda de la clase Jugador
 *
 * @property Jugador
 * @constructor pokemon, nombre, lore, fuerza, vida, tipo
 * @author Alejandro Diaz y Daniel Merino
 * @since 1.0
 *
 */

class Jugador(pokemon: String, nombre: String, lore: String, fuerza: Int, vida: Int, tipo: Int):
    Pokemon(pokemon, nombre, lore, fuerza, vida)
package clases

class combatePokemon {
}

fun main() {
    val mapaPokemonElegibles = mutableMapOf<String, Pokemon>()

    val pikachu = Pokemon("Electrico", "Pikachu", "Es el Pokémon más conocido y reconocible", 56, 76)
    mapaPokemonElegibles[pikachu.nombre] = pikachu
    val charizard = Pokemon("Fuego", "Charizard", "Es uno de los Pokémon más icónicos y populares", 85, 157)
    mapaPokemonElegibles[charizard.nombre] = charizard
    val squirtle = Pokemon("Agua", "Squirtle", "Es muy popular debido a su lindo aspecto y su habilidad para aprender poderosas técnicas de agua", 98, 173)
    mapaPokemonElegibles[squirtle.nombre] = squirtle
    val venusaur = Pokemon("Planta", "Venusaur", "Además de sus habilidades de lucha, es conocido por su capacidad para controlar el clima", 83, 164)
    mapaPokemonElegibles[venusaur.nombre] = venusaur

    for (valor in mapaPokemonElegibles.values) {
        println(valor.toString())
    }
    println("Jugador 1, elija su Pokémon:")
    var pokemonJugador1 = readln()
    val jugador1: Pokemon
    while (true) {
        if (mapaPokemonElegibles.containsKey(pokemonJugador1)) {
            jugador1 = mapaPokemonElegibles[pokemonJugador1]!!
            break
        }

        else{
            println("El pokemon que has elegido no esta en la lista")
            println("Vuelva a elegir pokemon:")
            pokemonJugador1 = readln()
        }

    }


    println("Jugador 2, elija su Pokémon:")
    var pokemonJugador2: String = readln()
    val jugador2: Pokemon
    while (true) {
        if (mapaPokemonElegibles.containsKey(pokemonJugador2)) {
            jugador2 = mapaPokemonElegibles[pokemonJugador2]!!
            break
        }
        else{
            println("El pokemon que has elegido no esta en la lista")
            println("Vuelva a elegir pokemon:")
            pokemonJugador2 = readln()
        }
    }

    var turno = 1
    while (jugador1.vida > 0 && jugador2.vida > 0) {
        println("Ronda $turno")
        if(turno % 2 !=  0) {
            println("Turno del jugador 1")
            val ataque1 = jugador1.fuerza * jugador1.comprobarEfectividad(jugador2.tipo,jugador1.tipo)
            jugador2.vida = (jugador2.vida - ataque1).toInt()
            println("la vida del jugador 2 esta en ${jugador2.vida}")
        }
        else{
            println("Turno del jugador 2")
            val ataque2 = jugador2.fuerza * jugador2.comprobarEfectividad(jugador1.tipo,jugador2.tipo)
            jugador1.vida = (jugador1.vida - ataque2).toInt()
            println("la vida del jugador 1 esta en ${jugador1.vida}")
        }
        turno++
    }

    if(jugador1.vida > jugador2.vida) { println("El ganador a sido el jugador 1") }
    else { println("El ganador a sido el jugador 2") }
}
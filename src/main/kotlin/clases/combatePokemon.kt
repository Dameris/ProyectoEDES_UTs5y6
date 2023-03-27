package clases

class combatePokemon {
}

fun main() {
    val MapaPokemonElegibles = mutableMapOf<String, Pokemon>()

    val pikachu = Pokemon("Electrico", "Pikachu", "Es el Pokémon más conocido y reconocible", 56, 76)
    MapaPokemonElegibles[pikachu.nombre] = pikachu
    val charizard = Pokemon("Fuego", "Charizard", "Es uno de los Pokémon más icónicos y populares", 85, 157)
    MapaPokemonElegibles[charizard.nombre] = charizard
    val squirtle = Pokemon("Agua", "Squirtle", "Es muy popular debido a su lindo aspecto y su habilidad para aprender poderosas técnicas de agua", 98, 173)
    MapaPokemonElegibles[squirtle.nombre] = squirtle
    val venusaur = Pokemon("Planta", "Venusaur", "Además de sus habilidades de lucha, es conocido por su capacidad para controlar el clima", 83, 164)
    MapaPokemonElegibles[squirtle.nombre] = squirtle

    for ((clave, valor) in MapaPokemonElegibles) {
        println(valor.toString())
    }
    println("Jugador 1, elija su Pokémon:")
    var pokemonJugador1 = readln()
    var Jugador1 :Pokemon
    while (true) {
        if (MapaPokemonElegibles.containsKey(pokemonJugador1)) {
            Jugador1 = MapaPokemonElegibles[pokemonJugador1]!!
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
    var Jugador2 :Pokemon
    while (true) {
        if (MapaPokemonElegibles.containsKey(pokemonJugador2)) {
            Jugador2 = MapaPokemonElegibles[pokemonJugador2]!!
            break
        }

        else{
            println("El pokemon que has elegido no esta en la lista")
            println("Vuelva a elegir pokemon:")
            pokemonJugador2 = readln()
        }

    }

    var turno = 1
        while (Jugador1.vida > 0 && Jugador2.vida > 0) {
            println("Ronda $turno")
            if(turno % 2 !=  0){
                println("Turno del jugador 1")
                var ataque1 = Jugador1.fuerza * Jugador1.comprobarEfectividad(Jugador2.tipo,Jugador1.tipo)
                Jugador2.vida = (Jugador2.vida - ataque1).toInt()
                println("la vida del jugador 2 esta en ${Jugador2.vida}")
            }
            else{
                println("Turno del jugador 2")
                var ataque2 = Jugador2.fuerza * Jugador2.comprobarEfectividad(Jugador1.tipo,Jugador2.tipo)
                Jugador1.vida = (Jugador1.vida - ataque2).toInt()
                println("la vida del jugador 1 esta en ${Jugador1.vida}")
            }
            turno++
    }
    if(Jugador1.vida>Jugador2.vida){
        println("El ganador a sido el jugador 1")
    }
    else   {
        println("El ganador a sido el jugador 2")
    }

}



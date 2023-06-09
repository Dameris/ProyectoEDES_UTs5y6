package clases

fun main() {
    val pokemonElegibles = mutableMapOf<String, Pokemon>()
    val pikachu = Pokemon("Electrico", "Pikachu", "Es el Pokémon más conocido y reconocible", 66, 120)
    pokemonElegibles[pikachu.nombre] = pikachu
    val charizard = Pokemon("Fuego", "Charizard", "Es uno de los Pokémon más icónicos y populares", 100, 231)
    pokemonElegibles[charizard.nombre] = charizard
    val squirtle = Pokemon("Agua", "Squirtle", "Es muy popular debido a su lindo aspecto y su habilidad para aprender poderosas técnicas de agua", 78, 150)
    pokemonElegibles[squirtle.nombre] = squirtle
    val venusaur = Pokemon("Planta", "Venusaur", "Además de sus habilidades de lucha, es conocido por su capacidad para controlar el clima", 93, 164)
    pokemonElegibles[venusaur.nombre] = venusaur

    for (valor in pokemonElegibles.values) { println(valor.toString()) }

    println("Jugador 1, elija su Pokémon:")
    var pokemonJugador1 = readln()
    val jugador1: Pokemon
    while (true) {
        if (pokemonElegibles.containsKey(pokemonJugador1)) {
            jugador1 = pokemonElegibles[pokemonJugador1]!!
            println("Has elegido a ${jugador1.nombre}")
            break
        }
        else {
            println("El pokemon que has elegido no esta en la lista")
            println("Vuelva a elegir pokemon:")
            pokemonJugador1 = readln()
        }
    }
    println()

    println("Jugador 2, elija su Pokémon:")
    var pokemonJugador2 = readln()
    val jugador2: Pokemon
    while (true) {
        if (pokemonElegibles.containsKey(pokemonJugador2)) {
            jugador2 = pokemonElegibles[pokemonJugador2]!!
            println("Has elegido a ${jugador2.nombre}")
            break
        }
        else {
            println("El pokemon que has elegido no esta en la lista")
            println("Vuelva a elegir pokemon:")
            pokemonJugador2 = readln()
        }
    }

    var turno = 1
    while (jugador1.vida > 0 && jugador2.vida > 0) {
        println()
        println("Ronda $turno")
        if (turno % 2 != 0) {
            println("Escribe el ataque a usar : ")
            val ataqueJugador1 = Ataque(readln(),jugador1.tipo, jugador1.fuerza)
            println("${jugador1.nombre} usa ${ataqueJugador1.nombre} sobre ${jugador2.nombre}")
            val ataque1 = jugador1.fuerza * jugador1.comprobarEfectividad(jugador2.tipo, jugador1.tipo)
            jugador2.vida = (jugador2.vida - ataque1).toInt()
            if (jugador2.vida <= 0) { println("${jugador2.nombre} ha sido derrotado") }
            else { println("la vida de ${jugador2.nombre} se ha reducido a ${jugador2.vida} pts") }
        }
        else {
            println("Escribe el ataque a usar : ")
            val ataqueJugador2 = Ataque(readln(), jugador2.tipo, jugador2.fuerza)
            println("${jugador2.nombre} usa ${ataqueJugador2.nombre} sobre ${jugador1.nombre}")
            val ataque2 = jugador2.fuerza * jugador2.comprobarEfectividad(jugador1.tipo, jugador2.tipo)
            jugador1.vida = (jugador1.vida - ataque2).toInt()
            if (jugador1.vida == 0) { println("${jugador1.nombre} ha sido derrotado") }
            else { println("la vida de ${jugador1.nombre} se ha reducido a ${jugador1.vida} pts") }
        }
        turno++
    }

    if (jugador1.vida > jugador2.vida) { println("${jugador1.nombre} ha ganado") }
    else { println("${jugador2.nombre} ha ganado") }
}
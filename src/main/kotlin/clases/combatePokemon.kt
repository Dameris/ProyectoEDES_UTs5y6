package clases

class combatePokemon {
}

fun main() {
    val MapaPokemonElegibles = mutableMapOf<String,Any>()

    val pikachu = Pokemon("Electrico", "Pikachu", "Es el Pokémon más conocido y reconocible",56, 76)
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
    val pokemonJugador1 = readln()
    if (pokemonJugador1 in MapaPokemonElegibles.keys) {
        var jugador1 = MapaPokemonElegibles[pokemonJugador1]
    }
    else{
        println("El pokemon que has elegido no esta en la lista")
    }
    println("Jugador 2, elija su Pokémon:")
    val pokemonJugador2 = readln()
    if (pokemonJugador2 in MapaPokemonElegibles.keys) {
        var jugador2 = MapaPokemonElegibles[pokemonJugador2]
    }
    else{
        println("El pokemon que has elegido no esta en la lista")
    }

   println(jugador1)



}
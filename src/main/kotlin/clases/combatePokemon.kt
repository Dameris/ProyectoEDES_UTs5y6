package clases

class combatePokemon {
}

fun main() {
    val listaPokemonElegibles = mutableListOf<Pokemon>()

    val pikachu = Pokemon("Electrico", "Pikachu", "Es el Pokémon más conocido y reconocible",56, 76)
    listaPokemonElegibles.add(pikachu)
    val charizard = Pokemon("Fuego", "Charizard", "Es uno de los Pokémon más icónicos y populares", 85, 157)
    listaPokemonElegibles.add(charizard)
    val squirtle = Pokemon("Agua", "Squirtle", "Es muy popular debido a su lindo aspecto y su habilidad para aprender poderosas técnicas de agua", 98, 173)
    listaPokemonElegibles.add(squirtle)
    val venusaur = Pokemon("Planta", "Venusaur", "Además de sus habilidades de lucha, es conocido por su capacidad para controlar el clima", 83, 164)
    listaPokemonElegibles.add(venusaur)

    for (elegirPokemon in 1 downTo 0) {
        println(listaPokemonElegibles.toString())
        println("Jugador 1, elija su Pokémon:")
        val pokemonJugador1 = readln()
        if (pokemonJugador1 in listaPokemonElegibles) {

        }
    }
}
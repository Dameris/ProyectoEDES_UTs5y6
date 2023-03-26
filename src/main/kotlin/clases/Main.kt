package clases

fun main() {
    println("Escribe el pokemon,nombre, lore , fuerza, vida y tipo en ese orden")
    println("Jugador 1")
    var jugador1 = Jugador(readln().toString(), readln().toString(), readln().toString(), readln().toInt(), readln().toInt(), readln().toInt())
    println("Jugador 2")
    var jugador2 = Jugador(readln().toString(), readln().toString(), readln().toString(), readln().toInt(), readln().toInt(), readln().toInt())
        /*
    var turno = 1
    while (jugador1.vida > 0 && jugador2.vida > 0) {
        println("Turno $turno:")
        if(turno % 2 !=  0){
            var ataque = jugador1.fuerza * jugador1.comprobarEfectividad()
        }
        turno++
        }
    }

         */
print("jugador1.comprobarEfectividad()")
}
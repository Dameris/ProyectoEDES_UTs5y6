package clases

/**
 * Clase para elegir el tipo del pokemon a escoger
 *
 * @property Tipo
 * @author Alejandro Diaz y Daniel Merino
 * @param tipo esta variable pide el tipo del pokemon y si está el string vacío saldrá una excepción del setter
 * @since 1.0
 */

open class Tipo(tipo: String) {
    companion object { var multiplicadorInicial = 0.0 }
    var tipo = ""
        set(value) {
            if (value.isEmpty()) { throw IllegalArgumentException("El tipo no puede estar vacío") }
            else { field = value }
        }

    /**
     * Se inicializa el constructor
     */
    init{ this.tipo = tipo }

    /**
     * Este método calcula la efectividad del ataque al pokemon que lo recibe, mediante una lista que calcula cuando es un x2, un x1, x0.5 y x0
     *
     * @return Devuelve un número sobre la efectividad del ataque
     */

    fun comprobarEfectividad(tipoPokemon: String, tipoAtaque: String): Double {
        var multiplicador = multiplicadorInicial

        when (tipoAtaque) {
            "Acero" -> {
                val listaX2 = listOf("Hada", "Hielo", "Roca")
                val listaX1 = listOf("Normal", "Lucha", "Volador", "Veneno", "Tierra", "Fantasma", "Planta", "Psíquico", "Dragón", "Siniestro")
                val listaX05 = listOf("Acero", "Agua", "Eléctrico", "Fuego")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Agua" -> {
                val listaX2 = listOf("Fuego", "Roca", "Tierra")
                val listaX1 = listOf("Acero", "Bicho", "Eléctrico", "Fantasma", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro", "Veneno", "Volador")
                val listaX05 = listOf("Agua", "Dragón", "Planta")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Bicho" -> {
                val listaX2 = listOf("Planta", "Psíquico", "Siniestro")
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Eléctrico", "Hielo", "Normal", "Roca", "Tierra")
                val listaX05 = listOf("Acero", "Fantasma", "Fuego", "Hada", "Lucha", "Veneno", "Volador")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Dragon" -> {
                val listaX2 = listOf("Dragón")
                val listaX1 = listOf("Agua", "Bicho", "Eléctrico", "Fantasma", "Fuego", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Acero")
                val listaX0 = listOf("Hada")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }

            }

            "Electrico" -> {
                val listaX2 = listOf("Agua", "Volador")
                val listaX1 = listOf("Acero", "Bicho", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Roca", "Siniestro", "Veneno")
                val listaX05 = listOf("Dragón", "Eléctrico", "Planta")
                val listaX0 = listOf("Tierra")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Fantasma" -> {
                val listaX2 = listOf("Fantasma", "Psíquico")
                val listaX1 = listOf("Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fuego", "Hada", "Hielo", "Lucha", "Planta", "Roca", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Siniestro")
                val listaX0 = listOf("Normal")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Fuego" -> {
                val listaX2 = listOf("Acero", "Bicho", "Hielo", "Planta")
                val listaX1 = listOf("Eléctrico", "Fantasma", "Hada", "Lucha", "Normal", "Psíquico", "Siniestro", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Agua", "Dragón", "Fuego", "Roca")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Hada" -> {
                val listaX2 = listOf("Dragón", "Lucha", "Siniestro")
                val listaX1 = listOf("Agua", "Bicho", "Eléctrico", "Fantasma", "Hada", "Hielo", "Normal", "Planta", "Psíquico", "Roca", "Tierra", "Volador")
                val listaX05 = listOf("Acero", "Fuego", "Veneno")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Hielo" -> {
                val listaX2 = listOf("Dragón", "Planta", "Tierra", "Volador")
                val listaX1 = listOf("Bicho", "Eléctrico", "Fantasma", "Hada", "Lucha", "Normal", "Psíquico", "Roca", "Siniestro", "Veneno")
                val listaX05 = listOf("Acero", "Agua", "Fuego", "Hielo")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Lucha" -> {
                val listaX2 = listOf("Acero", "Hielo", "Normal", "Roca", "Siniestro")
                val listaX1 = listOf("Agua", "Dragón", "Eléctrico", "Fuego", "Lucha", "Planta", "Tierra")
                val listaX05 = listOf("Bicho", "Hada", "Psíquico", "Veneno", "Volador")
                val listaX0 = listOf("Fantasma")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Normal" -> {
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Eléctrico", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Siniestro", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Acero", "Roca")
                val listaX0 = listOf("Fantasma")

                when (tipoPokemon) {
                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Planta" -> {
                val listaX2 = listOf("Agua", "Roca", "Tierra")
                val listaX1 = listOf("Eléctrico", "Fantasma", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro")
                val listaX05 = listOf("Acero", "Bicho", "Dragón", "Fuego", "Planta", "Veneno", "Volador")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Psiquico" -> {
                val listaX2 = listOf("Lucha", "Veneno")
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Normal", "Planta", "Roca", "Tierra", "Volador")
                val listaX05 = listOf("Acero", "Psíquico")
                val listaX0 = listOf("Siniestro")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Roca" -> {
                val listaX2 = listOf("Bicho", "Fuego", "Hielo", "Volador")
                val listaX1 = listOf("Agua", "Dragón", "Eléctrico", "Fantasma", "Hada", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Veneno")
                val listaX05 = listOf("Acero", "Lucha", "Tierra")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Siniestro" -> {
                val listaX2 = listOf("Fantasma", "Psíquico")
                val listaX1 = listOf("Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fuego", "Hielo", "Normal", "Planta", "Roca", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Hada", "Lucha", "Siniestro")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }

            "Tierra" -> {
                val listaX2 = listOf("Acero", "Eléctrico", "Fuego", "Roca", "Veneno")
                val listaX1 = listOf("Agua", "Dragón", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro", "Tierra", "Fantasma")
                val listaX05 = listOf("Bicho", "Planta")
                val listaX0 = listOf("Volador")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Veneno" -> {
                val listaX2 = listOf("Hada", "Planta")
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro", "Volador")
                val listaX05 = listOf("Fantasma", "Roca", "Tierra", "Veneno")
                val listaX0 = listOf("Acero")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }

                    in listaX0 -> {
                        multiplicador = 0.0
                        println("x0")
                    }
                }
            }

            "Volador" -> {
                val listaX2 = listOf("Bicho", "Lucha", "Planta")
                val listaX1 = listOf("Agua", "Dragón", "Fuego", "Hada", "Hielo", "Normal", "Psiquico", "Siniestro", "Tierra", "Veneno", "Volador", "Fantasma")
                val listaX05 = listOf("Acero", "Eléctrico", "Roca")

                when (tipoPokemon) {
                    in listaX2 -> {
                        multiplicador = 2.0
                        println("x2")
                    }

                    in listaX1 -> {
                        multiplicador = 1.0
                        println("x1")
                    }

                    in listaX05 -> {
                        multiplicador = 0.5
                        println("x0.5")
                    }
                }
            }
        }
        multiplicadorInicial = multiplicador
        return multiplicador
    }
}
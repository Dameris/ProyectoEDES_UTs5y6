package clases

open class Tipo(tipo: String) {
    private var tipo= ""

    init{ this.tipo = tipo }

    fun efectividad(tipoPokemon: String, tipoAtaque: String): Any {
        val multiplicador: Int
        val multiplicadorDouble: Double

        when (tipoAtaque) {
            "Acero" -> {
                val listaX2 = listOf("Hada", "Hielo", "Roca")
                val listaX1 = listOf("Normal", "Lucha", "Volador", "Veneno", "Tierra", "Fantasma", "Planta", "Psíquico", "Dragón", "Siniestro")
                val listaX05 = listOf("Acero", "Agua", "Eléctrico", "Fuego")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Agua" -> {
                val listaX2 = listOf("Fuego", "Roca", "Tierra")
                val listaX1 = listOf("Acero", "Bicho", "Eléctrico", "Fantasma", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro", "Veneno", "Volador")
                val listaX05 = listOf("Agua", "Dragón", "Planta")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Bicho" -> {
                val listaX2 = listOf("Planta", "Psíquico", "Siniestro")
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Eléctrico", "Hielo", "Normal", "Roca", "Tierra")
                val listaX05 = listOf("Acero", "Fantasma", "Fuego", "Hada", "Lucha", "Veneno", "Volador")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Dragon" -> {
                val listaX2 = listOf("Dragón")
                val listaX1 = listOf("Agua", "Bicho", "Eléctrico", "Fantasma", "Fuego", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Acero")
                val listaX0 = listOf("Hada")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Electrico" -> {
                val listaX2 = listOf("Agua", "Volador")
                val listaX1 = listOf("Acero", "Bicho", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Roca", "Siniestro", "Veneno")
                val listaX05 = listOf("Dragón", "Eléctrico", "Planta")
                val listaX0 = listOf("Tierra")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Fantasma" -> {
                val listaX2 = listOf("Fantasma", "Psíquico")
                val listaX1 = listOf("Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fuego", "Hada", "Hielo", "Lucha", "Planta", "Roca", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Siniestro")
                val listaX0 = listOf("Normal")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Fuego" -> {
                val listaX2 = listOf("Acero", "Bicho", "Hielo", "Planta")
                val listaX1 = listOf("Eléctrico", "Fantasma", "Hada", "Lucha", "Normal", "Psíquico", "Siniestro", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Agua", "Dragón", "Fuego", "Roca")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Hada" -> {
                val listaX2 = listOf("Dragón", "Lucha", "Siniestro")
                val listaX1 = listOf("Agua", "Bicho", "Eléctrico", "Fantasma", "Hada", "Hielo", "Normal", "Planta", "Psíquico", "Roca", "Tierra", "Volador")
                val listaX05 = listOf("Acero", "Fuego", "Veneno")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Hielo" -> {
                val listaX2 = listOf("Dragón", "Planta", "Tierra", "Volador")
                val listaX1 = listOf("Bicho", "Eléctrico", "Fantasma", "Hada", "Lucha", "Normal", "Psíquico", "Roca", "Siniestro", "Veneno")
                val listaX05 = listOf("Acero", "Agua", "Fuego", "Hielo")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Lucha" -> {
                val listaX2 = listOf("Acero", "Hielo", "Normal", "Roca", "Siniestro")
                val listaX1 = listOf("Agua", "Dragón", "Eléctrico", "Fuego", "Lucha", "Planta", "Tierra")
                val listaX05 = listOf("Bicho", "Hada", "Psíquico", "Veneno", "Volador")
                val listaX0 = listOf("Fantasma")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Normal" -> {
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Eléctrico", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Siniestro", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Acero", "Roca")
                val listaX0 = listOf("Fantasma")

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Planta" -> {
                val listaX2 = listOf("Agua", "Roca", "Tierra")
                val listaX1 = listOf("Eléctrico", "Fantasma", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro")
                val listaX05 = listOf("Acero", "Bicho", "Dragón", "Fuego", "Planta", "Veneno", "Volador")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Psiquico" -> {
                val listaX2 = listOf("Lucha", "Veneno")
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Normal", "Planta", "Roca", "Tierra", "Volador")
                val listaX05 = listOf("Acero", "Psíquico")
                val listaX0 = listOf("Siniestro")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Roca" -> {
                val listaX2 = listOf("Bicho", "Fuego", "Hielo", "Volador")
                val listaX1 = listOf("Agua", "Dragón", "Eléctrico", "Fantasma", "Hada", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Veneno")
                val listaX05 = listOf("Acero", "Lucha", "Tierra")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Siniestro" -> {
                val listaX2 = listOf("Fantasma", "Psíquico")
                val listaX1 = listOf("Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fuego", "Hielo", "Normal", "Planta", "Roca", "Tierra", "Veneno", "Volador")
                val listaX05 = listOf("Hada", "Lucha", "Siniestro")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }

            "Tierra" -> {
                val listaX2 = listOf("Acero", "Eléctrico", "Fuego", "Roca", "Veneno")
                val listaX1 = listOf("Agua", "Dragón", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro", "Tierra", "Fantasma")
                val listaX05 = listOf("Bicho", "Planta")
                val listaX0 = listOf("Volador")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Veneno" -> {
                val listaX2 = listOf("Hada", "Planta")
                val listaX1 = listOf("Agua", "Bicho", "Dragón", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Psíquico", "Siniestro", "Volador")
                val listaX05 = listOf("Fantasma", "Roca", "Tierra", "Veneno")
                val listaX0 = listOf("Acero")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }

                if (tipoPokemon in listaX0) { return "x0" }
            }

            "Volador" -> {
                val listaX2 = listOf("Bicho", "Lucha", "Planta")
                val listaX1 = listOf("Agua", "Dragón", "Fuego", "Hada", "Hielo", "Normal", "Psiquico", "Siniestro", "Tierra", "Veneno", "Volador", "Fantasma")
                val listaX05 = listOf("Acero", "Eléctrico", "Roca")

                if (tipoPokemon in listaX2) {
                    multiplicador = 2
                    return "x2"
                }

                if (tipoPokemon in listaX1) {
                    multiplicador = 1
                    return "x1"
                }

                if (tipoPokemon in listaX05) {
                    multiplicadorDouble = 0.5
                    return "x0.5"
                }
            }
        }
        return ("Daño total: " + ) // FALTA HACER EL RETURN FINAL
    }
}
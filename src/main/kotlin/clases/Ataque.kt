package clases

class Ataque(nombre: String, tipo: String, danyo: Int): Tipo(tipo) {
    private var nombre = ""
        set(value) {
            if (value.isEmpty()) { throw IllegalArgumentException("El nombre no puede estar vacío") }
            else { field = value }
        }
    internal var danyo = 0
        set(value) {
            if (value < 0){ throw IllegalArgumentException("El daño no puede ser negativo") }
            else { field = value }
        }

    init {
        this.nombre = nombre
        this.danyo = danyo
    }
}
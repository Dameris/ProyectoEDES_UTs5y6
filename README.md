## ProyectoEDES_UTs5y6

---
authors: - Daniel Merino / Alejandro Díaz
---
version: 1.0
---

<h3>CLASS [``Jugador``]<h3>
Clase ``Jugador`` que recibe por parámetros:
- *tipo*
- *nombre*
- *lore*
- *fuerza*
- *vida*

Todos sus variables las hereda de la clase *Pokemon*.

<h3>CLASS [``Pokemon``]<h3>
Clase ``Pokemon`` que recibe por parámetros:
- *tipo*
- *nombre*
- *lore*
- *fuerza*
- *vida*

Cuenta con una función ``recibirAtaque``, la cual se encarga de recibir por parámetros el ataque
y devolver la vida actualizada después de haber recibido dicho ataque.

También tiene una función ``toString`` que devuelve todos los datos del pokemon en forma de tabla.

<h3>CLASS [``Ataque``]<h3>
Clase ``Ataque`` que recibe por parámetros:
- *nombre*
- *tipo*
- *danyo*

La variable *tipo* la hereda de la clase ``Tipo``


<h3>CLASS [``Tipo``]<h3>
Clase ``Tipo`` que recibe por parámetros:
- *tipo*

Tiene una función ``comprobarEfectividad`` que recibe por parámetros el tipo del pokemon que va a recibir el
ataque y el tipo del ataque. Calcula si es ataque es x2, x1, x0.5 o x0 y  devuelve el multiplicador que ha obtenido.

<h3>MAIN [``combatePokemon``]<h3>
En el ``main`` se realizan varias cosas:
- Creación de un mapa para almacenar todos los Pokémon elegibles.
- Creación de dichos Pokémon.
- Bucle para que cada entrenador pueda elegir su Pokémon.
- Bucle que lleva a cabo el combate Pokémon.
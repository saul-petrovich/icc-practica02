# Representacion-binaria-algoritmos-clases
PRACTICA 02: Representacion binaria, diseño de algoritmos y clases

### Materia: Introduccion de Ciencias de la computacion (ICC) Facultad de ciencias, UNAM
### Alumno: Diego Saul Petrovich Tovar

##Contenido del proyecto
 ## Descripción

Este repositorio contiene la Práctica 02. Incluye una calculadora binaria de 8 bits, patrones con estructuras de control, manejo de cadenas y la clase `Civilizacion`.

Estado de cada parte:

- Parte I, calculadora binaria: terminada.
- Parte II, patrones: >>> RELLENAR (terminada o pendiente)
- Parte III, manejo de cadenas: >>> RELLENAR (terminada o pendiente)
- Ejercicio 3, clase `Civilizacion`: >>> RELLENAR (terminada o pendiente)

## Requisitos

- Java 15 o superior. El menú de `CalculadoraBinaria.java` usa un bloque de texto con `"""`.
- Para comprobar tu versión de Java: `java -version`
- No se usan bibliotecas externas, solo `java.util.Scanner`.

## Archivos del repositorio

- `CalculadoraBinaria.java`: menú principal, llama a la operación elegida.
- `Suma.java`: suma bit por bit con acarreo.
- `Resta.java`: resta como A + (-B) con complemento a dos.
- `Multiplicacion.java`: producto por sumas y desplazamientos.
- `Division.java`: división entera con cociente y residuo.
- `README.md`: este archivo.
- >>> RELLENAR: agrega aquí los archivos de patrones, cadenas y `Civilizacion` cuando los tengas.

## Cómo compilar

Desde la carpeta del proyecto:

```
javac *.java
```

## Cómo ejecutar

Calculadora completa, con menú:

```
java CalculadoraBinaria
```

Cada operación por separado:

```
java Suma
java Resta
java Multiplicacion
java Division
```

>>> RELLENAR: agrega aquí los comandos para ejecutar patrones, cadenas y la clase de prueba de `Civilizacion`.

## Parte I: Calculadora binaria

Trabaja con enteros con signo de 8 bits, en el intervalo de -128 a 127, representados en complemento a dos. El usuario escribe los operandos en decimal y el programa muestra su representación de 8 bits y el resultado.

### Cómo funciona cada operación

- **Suma:** se hace bit por bit con acarreo. Muestra el acarreo final y el desbordamiento por separado, porque un acarreo fuera del bit más significativo no implica que el resultado sea inválido.
- **Resta:** se calcula como A + (-B), obteniendo -B con el complemento a dos de B.
- **Multiplicación:** se construye con productos parciales y desplazamientos (duplicando el multiplicando), respetando el signo de los operandos.
- **División:** solo con enteros, muestra cociente y residuo. Aquí sí se usan `/` y `%`, como permite el enunciado. El residuo toma el signo del dividendo.
- **Desbordamiento:** se avisa cuando el resultado matemático queda fuera de [-128, 127]. Por ejemplo `127 + 1`, `64 * 2` o `-128 / -1`.

No se usan `Integer.toBinaryString` ni `Integer.parseInt(..., 2)`. Tampoco se resuelven suma, resta y multiplicación únicamente con `+`, `-` y `*`.

### Validaciones

- Operandos fuera de [-128, 127], incluso números muy grandes.
- Entradas que no son enteros (letras, decimales) o ausencia de datos: se muestra un mensaje de error en lugar de cerrar el programa con una excepción.
- Opciones inexistentes en el menú.
- División entre cero.
- Resultados que no caben en 8 bits.

### Ejemplos de ejecución

En cada ejemplo, las líneas que empiezan con `>` son lo que escribe el usuario. El menú completo se muestra solo en el primer ejemplo; en los demás se omite para abreviar.

**Ejemplo 1. Suma con signos distintos: 5 + (-3)**

```
Calculadora Binaria de 8 Bits
1.Suma
2.Resta
3.Multiplicacion
4.Division

Digita una opcion valida:

> 1
Digita el primer numero
> 5
Digita el segundo numero
> -3
Numero 1: 00000101
Numero 2: 11111101
Acarreo final: 1
Desbordamiento: No
Resultado:
00000010
```

Hay acarreo final y aun así el resultado es válido (2).

**Ejemplo 2. Resta con resultado negativo: 3 - 10**

```
> 2
Digita el primer numero
> 3
Digita el segundo numero
> 10
Numero 1: 00000011
Numero 2: 00001010
Desbordamiento: No
Resultado:
11111001
```

`11111001` es -7 en complemento a dos.

**Ejemplo 3. Multiplicación con signo: -5 x 3**

```
> 3
Digita el primer numero
> -5
Digita el segundo numero
> 3
Numero 1: 11111011
Numero 2: 00000011
Desbordamiento: No
Resultado:
11110001
```

`11110001` es -15 en complemento a dos.

**Ejemplo 4. Desbordamiento en la suma: 127 + 1**

```
> 1
Digita el primer numero
> 127
Digita el segundo numero
> 1
Numero 1: 01111111
Numero 2: 00000001
Acarreo final: 0
Desbordamiento: Si (el resultado no cabe en 8 bits con signo)
```

**Ejemplo 5. División con negativos: -13 / 5**

```
> 4
Digita el primer numero
> -13
Digita el segundo numero
> 5
Numero 1: 11110011
Numero 2: 00000101
Desbordamiento: No
Cociente: -2
Residuo: -3
```

**Ejemplo 6. División entre cero: 7 / 0**

```
> 4
Digita el primer numero
> 7
Digita el segundo numero
> 0
Error: no se puede dividir entre cero
```

**Ejemplo 7. Operando fuera de rango**

```
> 1
Digita el primer numero
> 200
Numero fuera de rango (de -128 a 127)
```

**Ejemplo 8. Opción inexistente en el menú**

```
> 9
Opcion no valida
```

## Parte II: Patrones

Programa que recibe un entero positivo `n` y dibuja cuatro patrones:
A (triángulo delimitado), B (pirámide de asteriscos),
C (rombo de asteriscos) y D (pirámide numérica simétrica).

### Compilar y ejecutar
```
cd patrones
javac Patrones.java
java Patrones
```

### Archivo
- `Patrones.java`: construye los cuatro patrones con ciclos `for`.

### Notas
- En los patrones A, B y D, `n` es el número de renglones.
- En el patrón C (rombo), `n` es el número de asteriscos de la fila central, así que el rombo tiene `2n - 1` renglones.
- El patrón D se alinea bien con `n` de 1 a 9. Con `n` de 10 o más, los números de dos dígitos desalinean la figura.

### Ejemplo de ejecución (n = 3)
```
Patron A
   1
 1 * 1
1 * * 1
Patron B
  * 
 * * 
* * * 
Patron C
  * 
 * * 
* * * 
 * * 
  * 
Patron D
    1 
  1 2 1 
1 2 3 2 1 

## Parte III: Manejo de cadenas

Programa que pide una palabra o cadena y muestra un menú con seis operaciones.

### Compilar y ejecutar
```
cd cadenas
javac Cadenas.java
java Cadenas
```

### Archivo
- `Cadenas.java`: menú de operaciones sobre una cadena, hecho con ciclos, condicionales y métodos de `String` (`length`, `charAt`, `indexOf`, `trim`, `toLowerCase`).

### Opciones del menú
1. Mostrar la longitud de la cadena.
2. Mostrar cada carácter en una línea distinta.
3. Mostrar la cadena invertida.
4. Contar cuántas veces aparece un carácter.
5. Buscar si una subcadena está contenida en la cadena.
6. Checar si dos cadenas son anagramas.

### Decisiones
- Los espacios cuentan como caracteres.
- La búsqueda de subcadena (opción 5) distingue mayúsculas de minúsculas.
- La comprobación de anagramas (opción 6) no distingue mayúsculas de minúsculas.
- En la opción 4 solo se acepta un carácter; si se escribe otra cosa, muestra un error.
- Si se elige una opción que no existe, muestra "Opcion no valida".

### Ejemplos de ejecución
Las líneas que empiezan con `>` son lo que escribe el usuario. En todos los ejemplos el programa muestra primero el menú de seis opciones; aquí se omite para ahorrar espacio.

**Ejemplo 1: longitud (opción 1)**
```
> hola
> 1
Longitud: 4
```

**Ejemplo 2: caracteres en líneas distintas (opción 2)**
```
> sol
> 2
s
o
l
```

**Ejemplo 3: cadena invertida (opción 3)**
```
> hola
> 3
Invertida: aloh
```

**Ejemplo 4: contar apariciones (opción 4)**
```
> banana
> 4
Digita un caracter:
> a
Aparece 3 veces
```

**Ejemplo 5: subcadena que sí está (opción 5)**
```
> computadora
> 5
Digita la subcadena:
> puta
Si esta contenida
```

**Ejemplo 6: subcadena que no está (opción 5)**
```
> computadora
> 5
Digita la subcadena:
> xyz
No esta contenida
```

**Ejemplo 7: anagrama (opción 6)**
```
> Roma
> 6
Digita la segunda cadena:
> amor
Si son anagramas
```

**Ejemplo 8: no es anagrama (opción 6)**
```
> hola
> 6
Digita la segunda cadena:
> holas
No son anagramas
```

**Ejemplo 9: opción inexistente**
```
> hola
> 9
Opcion no valida

## Ejercicio 3: Civilización

>>> RELLENAR cuando lo termines: una o dos líneas de qué hace la clase, cómo ejecutar la prueba y el estado de al menos dos civilizaciones antes y después de los cambios.

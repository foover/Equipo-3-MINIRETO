# 🎮 Mini Juegos Java - Equipo 3

Colección de juegos clásicos implementados en Java como proyecto educativo para practicar conceptos de Programación Orientada a Objetos.

## 📋 Descripción

Este proyecto es una colección de juegos clásicos desarrollados en Java bajo el contexto del mini reto de la primera evaluación. Cada juego ha sido implementado utilizando conceptos de POO, estructuras de datos y lógica de control, con el objetivo de afianzar conocimientos fundamentales de programación.

## 🎯 Juegos Disponibles

### 1. Ahorcado 🎯
El clásico juego del ahorcado donde debes adivinar la palabra oculta letra por letra antes de quedarte sin vidas.

**Características:**
- 6 vidas para adivinar la palabra
- Diccionario de más de 370 palabras en español
- Validación de entradas
- Sistema de puntuación por vidas restantes con la figura del ahorcado.

**Cómo jugar:**
1. El juego selecciona una palabra aleatoria del diccionario
2. Introduce letras para adivinar la palabra
3. Por cada letra incorrecta pierdes una vida
4. Ganas si completas la palabra antes de quedarte sin vidas

### 2. Cuatro en Raya 🔴
Juego estratégico de dos jugadores donde el objetivo es conectar cuatro fichas del mismo tipo (x/o) en línea.

**Características:**
- Tablero de 6 filas × 7 columnas (42 casillas)
- Detección automática de victoria en horizontal, vertical y diagonal
- Sistema de turnos alternados
- Validación de columnas llenas
- Detección de empate

**Cómo jugar:**
1. Los jugadores se turnan eligiendo una columna (0-6)
2. La ficha cae a la posición más baja disponible
3. Gana el primer jugador que conecte 4 fichas
4. Si se llena el tablero sin ganador, es empate

## 🚀 Instalación y Ejecución

### Requisitos Previos
- Java Development Kit (JDK) 11 o superior
- Maven (para gestión de dependencias)
- IDE recomendado: NetBeans

## 📁 Estructura del Proyecto

```
Equipo-3-MINIRETO/
├── src/
│   └── main/
│       └── java/
│           └── es/
│               └── equipo3/
│                   └── juegos/
│                       ├── Main.java                   # Clase principal con menú
│                       ├── Ahorcado.java               # Lógica del juego del ahorcado
│                       ├── Cuatro.java                 # Lógica del 4 en raya
│                       └── JugarCuatroEnRaya.java      # Controlador del 4 en raya
├── web/
│   ├── index.html                                      # Página principal web
│   ├── vercodigo.html                                  # Visualización de código
│   └── styles.css                                      # Estilos de la web
├── documentacion/
│   └── [documentos del proyecto]
├── README.md
└── .gitignore


(Generado por Calude 4.5 Sonnet)
```

## 🎮 Uso del Programa

Al ejecutar el programa, aparecerá un menú principal con las siguientes opciones:

```
================  MINI JUEGOS JAVA  ================
1 ----> JUGAR AL AHORCADO
2 ----> JUGAR AL 4 EN RAYA
3 ----> SALIR
```

Cada juego incluye:
- Pantalla de reglas antes de comenzar
- Confirmación de comprensión de las reglas
- Validación de entradas del usuario
- Mensajes claros de victoria/derrota

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java 11+
- **Gestor de dependencias:** Maven
- **Paradigma:** Programación Orientada a Objetos
- **Estructuras de datos:** Arrays, Arrays multidimensionales
- **Control de flujo:** Switch, While, For, Do-While
- **Frontend web:** HTML5, CSS3 (para documentación)

## ⚠️ Errores Conocidos

### Bug de Entrada Múltiple
**Descripción:** Al introducir una entrada seguida de un espacio y otra entrada (por ejemplo: "a b"), el programa toma ambas entradas como válidas y las aplica consecutivamente en dos turnos diferentes.

**Ejemplo:**
```
Introduce una letra: a b
# El programa procesará 'a' en el turno actual
# Y 'b' en el siguiente turno automáticamente
```

**Impacto:** Puede afectar la jugabilidad al permitir entradas no intencionadas.

**Solución temporal:** Asegúrate de introducir solo una letra/número por vez sin espacios adicionales.

**Estado:** Pendiente de corrección en futuras versiones (No hemos tenido tiempo).

## 📊 Características Técnicas

### Ahorcado
- **Clases:** `Ahorcado`
- **Métodos principales:**
  - `jugarAhorcado(Scanner)`: Lógica principal del juego
  - `mostrarPalabra(char[])`: Visualización de la palabra actual
  - `palabraCompleta(char[])`: Verificación de victoria
- **Validaciones:**
  - Solo letras permitidas
  - Primer carácter de la entrada
  - Control de vidas (0-6)

### Cuatro en Raya
- **Clases:** `Cuatro`, `JugarCuatroEnRaya`
- **Métodos principales:**
  - `insertarEn(int)`: Colocación de fichas
  - `fila()`: Detección de victoria horizontal
  - `columna()`: Detección de victoria vertical
  - `diagonal()`: Detección de victorias diagonales
  - `tablaLlena()`: Detección de empate
  - `finPartida()`: Control del estado del juego
- **Validaciones:**
  - Rango de columnas (0-6)
  - Columnas llenas
  - Tipos de datos correctos

## 👥 Equipo de Desarrollo

**Equipo 3**
- Paquete: `es.equipo3`
- Ubicación: Torrelavega, Cantabria, ES
- Contexto: Proyecto educativo - Primera evaluación
- Integrantes Iván Gómez, Daniel Zabala, Gleb Nesterov, Hugo Andrea

## 📝 Roadmap

### ✅ Completado
- [x] Implementación del Ahorcado
- [x] Implementación del Cuatro en Raya
- [x] Sistema de menú principal
- [x] Validación de entradas
- [x] Documentación web

## 🤝 Agradecimientos
- Agradecemos al equipo de Cristian Platero por contribuciones y pequeñas discusiones acerca del código y del flujo de trabajo.
- Agradecemos tambien a Ossel Santamaria por ayudarnos con la implementacion de la figura al ahorcado.
- Agradecemos a Sandra por ayudarnos a solucionar un problema que surgió por un conflicto con los Scanneres del Ahorcado y de la clase Main.

---

**Última actualización:** Diciembre 2025
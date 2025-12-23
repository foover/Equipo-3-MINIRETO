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
- Representación visual del ahorcado según vidas restantes

**Cómo jugar:**
1. El juego selecciona una palabra aleatoria del diccionario
2. Introduce letras para adivinar la palabra
3. Por cada letra incorrecta pierdes una vida y se dibuja una parte del ahorcado
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

## 🌐 Documentación Web

El proyecto incluye una interfaz web completa desarrollada en HTML5 y CSS3 con temática dark mode que proporciona:

**Características de la web:**
- **Página principal (index.html):** Presenta todos los juegos disponibles con descripciones detalladas, estadísticas del proyecto e información del equipo
- **Visualización de código:** Páginas dedicadas para cada juego (ahorcado.html, cuatro.html) que muestran el código fuente con syntax highlighting profesional para Java
- **Diseño responsive:** Adaptable a diferentes tamaños de pantalla
- **Navegación intuitiva:** Menú de navegación consistente en todas las páginas
- **Estética moderna:** Paleta de colores oscuros (#1a1a1a, #252525, #2c2c2c) con acentos en gris y blanco para óptima legibilidad
- **Tarjetas informativas:** Cada juego se presenta en una tarjeta con detalles sobre jugadores, dificultad, duración e implementación

**Estructura de estilos:**
- `styles.css`: Estilos globales y página principal
- `ahorcado.css`: Estilos específicos para visualización del código del Ahorcado
- `cuatrostyle.css`: Estilos específicos para visualización del código de Cuatro en Raya

La documentación web sirve como complemento visual al proyecto, permitiendo una navegación más amigable del código y proporcionando contexto sobre cada juego implementado.

## 🚀 Instalación y Ejecución

### Requisitos Previos
- Java Development Kit (JDK) 11 o superior
- Maven (para gestión de dependencias)
- IDE recomendado: NetBeans
- Navegador web moderno (para visualizar la documentación web)

### Compilación y Ejecución

1. **Clonar el repositorio:**
```bash
git clone [URL_DEL_REPOSITORIO]
cd Equipo-3-MINIRETO
```

2. **Compilar el proyecto con Maven:**
```bash
mvn clean compile
```

3. **Crear el archivo JAR ejecutable:**
```bash
mvn package
```

4. **Ejecutar el JAR generado:**
```bash
java -jar target/Juegos-1.0-SNAPSHOT.jar
```

O directamente desde Maven:
```bash
mvn exec:java
```

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
│                       └── Cuatro.java                 # Lógica del 4 en raya
├── web/
│   ├── index.html                                      # Página principal web
│   ├── ahorcado.html                                   # Visualización de código Ahorcado
│   ├── ahorcado.css                                    # Estilos para página Ahorcado
│   ├── cuatro.html                                     # Visualización de código 4 en raya
│   ├── cuatrostyle.css                                 # Estilos para página 4 en raya
│   └── styles.css                                      # Estilos generales de la web
├── documentacion/
│   └── [documentos del proyecto]
├── pom.xml                                             # Configuración Maven
├── README.md
└── .gitignore
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

- **Lenguaje:** Java 24
- **Gestor de dependencias:** Maven 4.0.0
- **Paradigma:** Programación Orientada a Objetos
- **Estructuras de datos:** Arrays, Arrays multidimensionales
- **Control de flujo:** Switch, While, For, Do-While
- **Frontend web:** HTML5, CSS3 (para documentación)

## ⚙️ Configuración Maven

El proyecto utiliza el plugin `maven-jar-plugin` para crear un JAR ejecutable con la clase principal configurada:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>3.1.0</version>
    <configuration>
        <archive>
            <manifest>
                <addClasspath>true</addClasspath>
                <classpathPrefix>lib/</classpathPrefix>
                <mainClass>es.equipo3.juegos.Main</mainClass>
            </manifest>
        </archive>
    </configuration>
</plugin>
```

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
  - Representación ASCII del ahorcado

### Cuatro en Raya
- **Clases:** `Cuatro`
- **Métodos principales:**
  - `insertarEn(int)`: Colocación de fichas
  - `fila()`: Detección de victoria horizontal
  - `columna()`: Detección de victoria vertical
  - `diagonal()`: Detección de victorias diagonales
  - `tablaLlena()`: Detección de empate
  - `finPartida()`: Control del estado del juego
  - `iniciarPartida(Scanner)`: Bucle principal del juego
- **Validaciones:**
  - Rango de columnas (0-6)
  - Columnas llenas
  - Tipos de datos correctos

## 👥 Equipo de Desarrollo

**Equipo 3**
- Paquete: `es.equipo3`
- Ubicación: Torrelavega, Cantabria, ES
- Contexto: Proyecto educativo - Primera evaluación
- Integrantes: Iván Gómez, Daniel Zabala, Gleb Nesterov, Hugo Andrea

## 📝 Roadmap

### ✅ Completado
- [x] Implementación del Ahorcado
- [x] Implementación del Cuatro en Raya
- [x] Sistema de menú principal
- [x] Validación de entradas
- [x] Documentación web
- [x] Configuración Maven para JAR ejecutable
- [x] Figura visual del ahorcado

### 🔄 En Proceso
- [ ] Corrección del bug de entrada múltiple
- [ ] Implementación de juegos adicionales

## 🤝 Agradecimientos
- Agradecemos al equipo de Cristian Platero por contribuciones y pequeñas discusiones acerca del código y del flujo de trabajo.
- Agradecemos también a Ossel Santamaria por ayudarnos con la implementación de la figura al ahorcado.
- Agradecemos a Sandra por ayudarnos a solucionar un problema que surgió por un conflicto con los Scanners del Ahorcado y de la clase Main.

---

**Última actualización:** Diciembre 2025
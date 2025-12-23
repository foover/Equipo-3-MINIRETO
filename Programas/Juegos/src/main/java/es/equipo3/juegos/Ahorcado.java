package es.equipo3.juegos;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

  private final String[] palabras = { // Cambiar este array a otra clase para mayor limpieza
      "casa", "perro", "gato", "mesa", "silla", "libro", "lapiz", "papel", "flor", "arbol",
      "coche", "rueda", "puerta", "ventana", "techo", "pared", "suelo", "camino", "rio", "mar",
      "playa", "arena", "ola", "nube", "cielo", "lluvia", "viento", "fuego", "tierra", "piedra",
      "montana", "valle", "bosque", "hoja", "rama", "tronco", "raiz", "semilla", "fruto", "campo",
      "ciudad", "pueblo", "barrio", "calle", "plaza", "puente", "torre", "castillo", "iglesia", "escuela",
      "clase", "alumno", "profesor", "examen", "nota", "libreta", "mochila", "ordenador", "teclado", "raton",
      "pantalla", "telefono", "mensaje", "correo", "internet", "codigo", "programa", "variable", "bucle", "condicion",
      "funcion", "clasejava", "metodo", "objeto", "array", "lista", "numero", "cadena", "booleano", "entero",
      "decimal", "suma", "resta", "producto", "division", "resultado", "error", "debug", "compilar", "ejecutar",
      "juego", "nivel", "puntos", "vidas", "tiempo", "record", "pantalla", "boton", "menu", "inicio",
      "final", "victoria", "derrota", "enemigo", "aliado", "arma", "escudo", "pocion", "magia", "energia",
      "fuerza", "velocidad", "salto", "correr", "caminar", "agachar", "disparar", "apuntar", "esquivar", "golpear",
      "musica", "sonido", "ritmo", "melodia", "guitarra", "piano", "bateria", "violin", "cancion", "artista",
      "pelicula", "actor", "directo", "escena", "guion", "camara", "imagen", "foto", "video", "edicion",
      "color", "rojo", "verde", "azul", "amarillo", "negro", "blanco", "gris", "morado", "naranja",
      "comida", "pan", "queso", "leche", "agua", "zumo", "carne", "pasta", "arroz", "pizza",
      "hamburguesa", "ensalada", "sopa", "postre", "chocolate", "galleta", "helado", "fruta", "manzana", "platano",
      "naranja", "pera", "melon", "sandia", "fresa", "cereza", "limon", "uva", "kiwi", "mango",
      "deporte", "futbol", "baloncesto", "tenis", "ciclismo", "natacion", "atletismo", "boxeo", "gimnasia", "rugby",
      "carrera", "entreno", "equipo", "partido", "liga", "torneo", "clasificacion", "victoria", "empate", "derrota",
      "salud", "medico", "hospital", "farmacia", "pastilla", "cura", "herida", "reposo", "energia", "fuerza",
      "familia", "padre", "madre", "hermano", "hermana", "abuelo", "abuela", "tio", "tia", "primo",
      "amigo", "amiga", "companero", "vecino", "persona", "grupo", "equipo", "lider", "miembro", "sociedad",
      "trabajo", "oficio", "empleo", "empresa", "negocio", "jefe", "cliente", "reunion", "horario", "salario",
      "dinero", "moneda", "precio", "oferta", "compra", "venta", "mercado", "tienda", "factura", "ahorro",
      "viaje", "hotel", "avion", "tren", "bus", "taxi", "maleta", "billete", "destino", "mapa",
      "pais", "ciudad", "capital", "frontera", "idioma", "cultura", "historia", "tradicion", "fiesta", "evento",
      "tiempo", "hora", "minuto", "segundo", "dia", "noche", "semana", "mes", "ano", "calendario",
      "clima", "frio", "calor", "niebla", "tormenta", "granizo", "nieve", "sol", "sombra", "temperatura",
      "animal", "caballo", "vaca", "oveja", "cerdo", "pollo", "pato", "conejo", "raton", "tigre",
      "leon", "elefante", "jirafa", "mono", "oso", "zorro", "lobo", "aguila", "halcon", "pez",
      "insecto", "hormiga", "abeja", "mosca", "mariposa", "arana", "grillo", "saltamontes", "escarabajo", "libelula",
      "vehiculo", "moto", "camion", "bicicleta", "patinete", "tractor", "barco", "submarino", "helicoptero", "avioneta",
      "energia", "solar", "eolica", "nuclear", "electrica", "bateria", "motor", "combustible", "gasolina", "diesel",
      "ciencia", "fisica", "quimica", "biologia", "matematicas", "geologia", "astronomia", "experimento", "teoria",
      "hipotesis",
      "espacio", "planeta", "estrella", "galaxia", "universo", "orbita", "cohete", "satelite", "astronauta", "gravedad",
      "emocion", "alegria", "tristeza", "miedo", "ira", "amor", "odio", "sorpresa", "calma", "nervios",
      "mente", "pensamiento", "idea", "memoria", "sueno", "atencion", "concentracion", "logica", "razon", "decision"
  };

  public void jugarAhorcado(Scanner in) { // Metodo principal del juego
    // Scanner in = new Scanner(System.in);
    Random rand = new Random();

    String palabraElegida = palabras[rand.nextInt(palabras.length)]; // Selecciona una palabra aleatoria del array
    char[] palabraActual = new char[palabraElegida.length()]; // Crea un array con la misma longitud que la palabra
                                                              // elegida anteriormente

    for (int i = 0; i < palabraActual.length; i++) {
      palabraActual[i] = '_'; // Rellena el array con guiones bajos para representar las letras no adivinadas
    }

    int vidas = 6; // Cambiar esta funcion a corazones o algun otro simbolo para mayor estetica y
                   // colocar por encima del todo

    System.out.println("JUEGO DEL AHORCADO");
    
    while (vidas >= 0) {
      switch (vidas) {
      case 6 -> {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      case 5 -> {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      case 4 -> {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      case 3 -> {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      case 2 -> {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
      }
      case 1 -> {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println(" /    |");
        System.out.println("      |");
        System.out.println("=========");
      }
      
    }

      System.out.println("\nPalabra: " + mostrarPalabra(palabraActual)); // Muestra la palabra actual con las letras
                                                                         // adivinadas y los guiones bajos usando el
                                                                         // metodo mostrarPalabra (linea 104).
      System.out.println("Vidas: " + vidas);
      System.out.print("Introduce una letra: ");

      char letra = in.next().toLowerCase().charAt(0); // Lee la letra introducida por el usuario, se lee como un String
                                                      // y se convierte a char, para la validacion se recoge el primer
                                                      // caracter de la cadena introducida.
      if (Character.isLetter(letra)) { // Validacion para asegurarse de que el usuario introduce una letra
        boolean acierto = false; // Inicializa la variable acierto como false
        for (int i = 0; i < palabraElegida.length(); i++) { // Recorre la palabra elegida
          if (palabraElegida.charAt(i) == letra) { // Comprueba si la letra introducida coincide con alguna letra de la
                                                   // palabra
            palabraActual[i] = letra;
            acierto = true;
          }
        }

        if (acierto) {
          System.out.println("Correcto!"); // Si la letra es correcta, no se resta vida
        } else {
          vidas--;
          System.out.println("Incorrecto!"); // Si la letra es incorrecta, se resta una vida
        }

        if (palabraCompleta(palabraActual)) { // Comprueba si la palabra ha sido completada usando el metodo
                                              // palabraCompleta (linea 112).
          System.out.println("\nHas ganado! La palabra era: " + palabraElegida);
          break; // Este break es muy importante para salir del bucle cuando se gana (while)
        }
        
       if(vidas == 0){
           System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println(" / \\  |");
        System.out.println("      |");
        System.out.println("=========");
           System.out.println("\nHas perdido! La palabra era: " + palabraElegida);
           break;
       }

        
      } else { // Mensaje de error si no se introduce una letra
        System.out.println("Por favor introduce una letra");
      }
    }

  }

  private String mostrarPalabra(char[] palabra) { // Metodo para mostrar la palabra actual con espacios entre letras
    String resultado = "";
    for (char guiones : palabra) { // Recorre cada caracter del array palabra
      resultado += guiones + " "; // Añade cada caracter seguido de un espacio al resultado
    }
    /*
     * Este trozo de codigo es equivalente al for each de arriba
     * for (int i = 0; i < palabra.length; i++) {
     * char guiones = palabra[i];
     * resultado += guiones + " ";
     * }
     */
    return resultado;
  }

  private boolean palabraCompleta(char[] palabra) { // Metodo para comprobar si la palabra ha sido completada
    for (char guiones : palabra) { // Recorre cada caracter del array palabra
      if (guiones == '_') { // Si encuentra un guion bajo, significa que la palabra no está completa
        return false;
      }
    }
    return true; // Si no encuentra guiones bajos, la palabra está completa
  }
}
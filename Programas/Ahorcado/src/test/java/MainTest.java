
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hugoa
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        private final String[] palabras = {
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
        "ciencia", "fisica", "quimica", "biologia", "matematicas", "geologia", "astronomia", "experimento", "teoria", "hipotesis",
        "espacio", "planeta", "estrella", "galaxia", "universo", "orbita", "cohete", "satelite", "astronauta", "gravedad",
        "emocion", "alegria", "tristeza", "miedo", "ira", "amor", "odio", "sorpresa", "calma", "nervios",
        "mente", "pensamiento", "idea", "memoria", "sueno", "atencion", "concentracion", "logica", "razon", "decision"
    };

    public void jugarAhorcado() {
        Random r = new Random();
        String palabraElegida = "";
        int y = r.nextInt(379) + 1;

        palabraElegida = palabras[y];
//        palabra = for(int i = 0; i < palabraElegida.length() - 1; i++){
//        
//            
//            
//        }
        String[] letras = new String[palabraElegida.length()];

        for (int i = 0; i < palabraElegida.length(); i++) {

            if (i == palabraElegida.length()) {
                letras[i] = palabraElegida.substring(i);
            }else{
                letras[i] = palabraElegida.substring(i, i + 1);
            }
        }
        for(int i = 0; i < palabraElegida.length(); i++){
            System.out.print("_ ");
            System.out.print(letras[i]);
        }
    }
    
}

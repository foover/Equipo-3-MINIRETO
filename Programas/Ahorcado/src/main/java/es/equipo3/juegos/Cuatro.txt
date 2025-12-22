/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.equipo3.juegos;


/**
 * Cuatro en raya: Se trata de un tablero vertical de 6 Filas (altura) por 7
 * Columna (ancho). En el estado inicial: Todas las casillas están vacías (valor
 * 0). El jugador no elige la fila, solo elige la Columna. Al desarrollar la
 * lógica, cuando un jugador selecciona una columna, debes hacer lo siguiente:  *
 * Revisar esa columna desde la fila más baja (el fondo) hacia arriba.  *
 * Buscar la primera casilla que esté vacía.  *
 * Colocar la ficha ahí.  *
 * Excepción: Si la casilla más alta de la columna ya está ocupada, la columna
 * está llena y el jugador no puede tirar ahí; debe elegir otra.  *
 * Se alternan entre dos valores distintos en la matriz (por ejemplo, "1" para
 * el Jugador Rojo y "2" para el Jugador Amarillo).  *
 * Comprobación de Victoria: Después de cada ficha colocada, el sistema debe
 * mirar alrededor de esa ficha para ver si se ha formado una línea de 4 fichas
 * iguales consecutivas. Debes verificar en cuatro direcciones:  *
 * Horizontal: ¿Hay fichas iguales a la izquierda o derecha?  *
 * Vertical: ¿Hay fichas iguales justo debajo? (No hace falta mirar arriba,
 * acabas de tirar).  *
 * Diagonal Ascendente (/): De abajo-izquierda a arriba-derecha.  *
 * Diagonal Descendente (): De arriba-izquierda a abajo-derecha.  *
 * Si en alguna de estas direcciones cuentas 4 fichas del mismo color seguidas,
 * el juego termina y gana el jugador actual.  *
 * Si se han llenado las 42 casillas (6x7) del tablero y nadie ha conseguido
 * conectar cuatro, se declara un empate técnico. El tablero está "lleno".
 *
 * @author daw121
 */
public class Cuatro {

    private char[][] tabla;
    
    private final char j1 = 'x';
    private final char j2 = 'o';
    private final char vacio = '.';
    private boolean turno;

    
    
    // SE CONSTRUYE UNA TABLA CON LOS PUNTOS
    public void tabla2() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = vacio;
            }
        }
    }
    
    
    
    // ES EL CONSTRUCTOR POR DEFECTO
    public Cuatro() {
        this.turno = true;
        this.tabla = new char[6][7];
        this.tabla2();
    }
    
    
    // MUESTRA LA TABLA/MATRIZ, MOSTRARIA ALGO ASI:
    //. . . . . . . 
    //. . . . . . . 
    //. . . . . . . 
    //. . . . . . . 
    //. . . . . . . 
    //. . . . . . . 
    public void mostrarTabla(){
        for (int i = 0; i < this.tabla.length; i++) {
            for (int j = 0; j < this.tabla[i].length; j++) {
                System.out.print(this.tabla[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
    
    public void mostrarTurno(){
        if(turno){
            System.out.println("Turno del jugador 1");
        }else{
            System.out.println("Turno del jugador 2");
        }
    }
    
    
    // CAMBIA DE TURNO, PUEDE CAMBIAR DE TURNO GRACIAS A UN BOOLEAN 
    // EL BOOLEAN PASA DE TRUE A FALSE Y ASI LOS TURNOS VAN ALTERNANDO. EN EL CONSTRUCTOR AL TURNO SE LE DA EL VALOR TRUE
    public void cambioTurno(){
        this.turno = !this.turno;
    }
    
    
    // SE INSERTA EL SIMBOLO EN LA TABLA "X u O"
    public void insertarEn(int columna){
        
        for(int i = tabla.length - 1; i >= 0 ; i--) {
            
            if(tabla[i][columna] == vacio){
                if (turno){
                tabla[i][columna] = j1;
                }else{
                tabla[i][columna] = j2;
                }  
                return;
            }
        }
    }

    // SE VALIDA LA POSICION 
    public boolean validarPos(int fila, int columna){
        if (fila >= 0 && fila < tabla.length && columna >= 0 && columna < tabla[0].length){
            return true;
        }else{
            return false;
        }
    }
    
    // indica si la tabla esta llena o no, esta llena si ya no aparece el simbolo que esta en la variable "vacio" ,osea '.'
    public boolean tablaLlena(){
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                // comprobacion de casilla actul. Aunque sea una sola casilla con un punto, osea vacia, el juego sigue
                if (tabla[i][j] == vacio){
                    return false;
                }
            }
        }
        // devuelve verdader si la condicion de if de arriba es falso. Devuelve verdadero solo en el caso de que la tabla esta llena
        return true;
    }
      
    // COMPROBACION DE GANADOR EN LA COLUMNA 
    private char columna(){
        // recorre cada columna y comprueba los simbolos 
        for (int j = 0; j < tabla.length; j++) {
                for (int i = 0; i <= 2; i++) {
                    char simbolo = tabla[i][j];
                    // devuelve el simbolo del jugador que ha ganado 
                    if(simbolo != vacio && simbolo == tabla[i+1][j] && simbolo == tabla[i+2][j] && simbolo == tabla[i+3][j]){
                        return simbolo;
                    }
                }
            }
        // en caso de que no hay ganador vuelve vacio
        return vacio;
    }
    
    
    // COMPROBACION DE GANADOR EN LA FILA
    private char fila(){
        char simbolo;
        // recorre la fila de 0 al 6, si no esta vacia
        for (int i = 0; i < 6; i++) {
            simbolo = tabla[i][0];
                for (int j = 0; j < 4; j++) {
                    simbolo = tabla[i][j];
                    // comprueba la fila 
                    if (simbolo != vacio && simbolo == tabla[i][j+1] && simbolo == tabla[i][j+2] && simbolo == tabla[i][j+3]){
                        // devuelve el simbolo del ganador
                        return simbolo;
                    }
                    
                }  
        }
        // en caso de que no hay ganador vuelve vacio
        return vacio;
    }

    
   
    // COMPROBACION DE GANADOR EN LA DIAGONAL
    private char diagonal(){
        char simbolo;
        //boolean coincide = true;
        
        //diagonal principal (izquierda a derecha)
        // Esta tomando el valor de la esquina izquierda de abajo a esquina derecha de arriba...
        // (\)
        for (int i = 0 ; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) { // 
                simbolo = tabla[i][j];
                // devuelve el simbolo del jugador que ha ganado 
                if(simbolo != vacio && simbolo == tabla[i + 1][j + 1] && simbolo == tabla[i + 2][j + 2] && simbolo == tabla[i + 3][j + 3]){
                    return simbolo;
                }
            }
        }
                // devuelve el simbolo del ganador si no se mete en el if de arriba   
        
        //diagonal inversa (derecha a izquierda)
        // Esta tomando el valor de la esquina derecha de abajo a esquina izquierda de arriba...
        // (/)
        for (int i = 3 ; i <= 5; i++) {
            for (int j = 0; j <= 3; j++) {
                simbolo = tabla[i][j];
                // devuelve el simbolo del jugador que ha ganado 
                if(simbolo != vacio && simbolo == tabla[i - 1][j + 1] && simbolo == tabla[i - 2][j + 2] && simbolo == tabla[i - 3][j + 3]){
                    return simbolo;
                }
            }
        }
        
        // en caso de que no hay ganador vuelve vacio
        return vacio;
    }
    
    public boolean finPartida(){
        // si el tablero esta lleno o fila, columna o diagonal, no estan vacias termina el juego
        if (tablaLlena() || fila() != vacio || columna() != vacio || diagonal() != vacio){
            return true;
        }
        // si la condicion del if da falso el juego sigue 
        return false;
    }
    
    public void ganador(){
        char simboloGanador = vacio;
        // si el metodo fila no es vacio, a la variable simbolo ganador le da el valor del simbolo del jugador que ha ganado x/o
        if (fila() != vacio){
            simboloGanador = fila();
        }else if (columna() != vacio){
            simboloGanador = columna();
        }else if (diagonal() != vacio){
            simboloGanador = diagonal();
        }
        
        if (simboloGanador == j1){
            // devuelve un mensaje que diga que el jugador 1 ha ganado 
            System.out.println("Ha ganado el jugador 1: " + j1);
        }else if (simboloGanador == j2){
            // devuelve mensaje que ha ganado el jugador 2
            System.out.println("Ha ganado el jugador 2: " + j2);
            // devuelve el mensaje que la tabla esta llena
        }else{
            System.out.println("Empate, el tablero esta lleno");
        }
        
    }   
}

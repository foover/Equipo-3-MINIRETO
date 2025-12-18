/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import java.util.Scanner;

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
public class cuatro {
//    private int[] filas= new int [6];
//    private int[] columnas= new int [7];

    private char[][] tabla;
    
    private final char j1 = 'x';
    private final char j2 = 'o';
    private final char vacio = '.';
    private boolean turno;

    public void tabla2() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = vacio;
            }
        }
    }
    
    public cuatro() {
        this.turno = true;
        this.tabla = new char[6][7];
        this.tabla2();
    }
    
    
    
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
    
    
    
    public void cambioTurno(){
        this.turno = !this.turno;
    }
    
    
//    public void insertarEn(int columna){
//        if (turno){
//            tabla[columna] = j1;
//        }else{
//            tabla[columna] = j2;
//        }
//    }

    
    public void buscar(int tabla[][]){
        boolean econtrado = false;
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(" 0");
                if (econtrado = true) {
                    System.out.print(" 1");
                }else{
                    System.out.println("La casilla esta ocupada");
                }
            }
            System.out.println("  ");
        }
        
        
    }
    
//    public void jugadores(Scanner entrada){
//        boolean win = false;
//        boolean draw = false;
//        
//        
//        // comprobar si la fila esta vacia
//        for (int i = 0; i < tabla.length; i++) {
//            for (int j = 0; j < tabla.length; j++) {
//                if ()
//            }
//        }
//        
//        
//        while (!win || !draw){
//            
//        }
//    }

//    public int[] buscarElemento(int[][] matriz, int elementoBuscado) {
//        // Recorre cada fila
//        for (int fila = 0; fila < matriz.length; fila++) {
//            // Recorre cada columna dentro de la fila actual
//            for (int col = 0; col < matriz[fila].length; col++) {
//                // Compara el elemento de la matriz con el buscado
//                if (matriz[fila][col] == elementoBuscado) {
//                    // Si lo encuentra, devuelve sus coordenadas (fila, columna)
//                    return new int[]{fila, col};
//                }
//            }
//        }
//        // Si no se encuentra después de revisar todo, devuelve {-1, -1}
//        return new int[]{-1, -1};
//    }
//    
//    
}

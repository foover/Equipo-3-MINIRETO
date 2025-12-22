/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.equipo3.juegos;

import java.util.Scanner;

/**
 *
 * @author DAW121
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int opcion = 0;
    boolean entradaValida = false;

    do {
      Main.menu();
      System.out.println("Introduce una opción (1-3): ");

      do {
        if (teclado.hasNextInt()) {
          opcion = teclado.nextInt();
          if (opcion >= 1 && opcion <= 3) {
            entradaValida = true;
            switch (opcion) {
              case 1 -> {
                String entendido = "";
                System.out.println("================ AHORCADO ================\n");
                System.out.println("Reglas del juego:\n"
                    + "1. El objetivo del juego es adivinar la palabra oculta letra por letra.\n"
                    + "2. Tienes un numero limitado de vidas (6) para adivinar la palabra.\n"
                    + "3. Cada vez que adivines una letra correctamente, se revelara en la palabra oculta.\n"
                    + "4. Si adivinas una letra incorrectamente, perderás una vida.\n"
                    + "5. El juego termina cuando adivinas la palabra completa o te quedas sin vidas.\n"
                    + "6. IMPOTRANTE si introduces mas de una letra el programa tomara unicamente la primera.\n"
                    + "Buena suerte!\n");
                System.out.println("-------> Has entendido las reglas? (Si/No)\n");

                entendido = teclado.next().toLowerCase();
                if (entendido.equals("si")) {
                  
                  Ahorcado ahorcado = new Ahorcado();
                  ahorcado.jugarAhorcado(teclado);

                } else if (entendido.equals("no")) {
                  
                  System.out.println("Por favor, lee las reglas antes de jugar.");
                  break;
                  
                } else {
                  System.out.println("Respuesta no valida. Por favor, responde con 'Si' o 'No'.");
                  break;
                }
              }
              case 2 -> {

                String entendido = "";
                System.out.println("================ CUATRO EN RAYA ================\n");
                System.out.println("Reglas del juego:\n"
                    + "1. El objetivo del juego es ser el primer jugador en conectar cuatro de sus fichas en una fila, ya sea horizontal, vertical o diagonalmente.\n"
                    + "2. El juego se juega en un tablero de 7 columnas y 6 filas.\n"
                    + "3. Los jugadores se turnan para colocar una ficha en una columna de su eleccion.\n"
                    + "4. La ficha caera hasta la posición mas baja disponible en esa columna.\n"
                    + "5. El juego termina cuando un jugador conecta cuatro fichas o cuando el tablero esta lleno, resultando en un empate.\n"
                    + "6. IMPOTRANTE Introduce solo numeros del 0 al 6 para seleccionar la columna.\n"
                    + "Buena suerte!\n");
                System.out.println("-------> Has entendido las reglas? (Si/No)\n");

                entendido = teclado.next().toLowerCase();
                if (entendido.equals("si")) {
                  
                  Cuatro cuatroEnRaya = new Cuatro();
                  cuatroEnRaya.iniciarPartida(teclado);

                } else if (entendido.equals("no")) {
                  
                  System.out.println("Por favor, lee las reglas antes de jugar.");
                  break;
                  
                } else {
                  System.out.println("Respuesta no valida. Por favor, responde con 'Si' o 'No'.");
                  break;
                }
                JugarCuatroEnRaya principal = new JugarCuatroEnRaya();
                principal.jugarCuatroEnRaya(teclado);

              }
              case 3 -> {
                System.out.println("Saliendo...");
              }

            }
          } else {
            System.out.println("La entrada es un entero entre 1 y 3");
          }
        } else {
          System.out.println("Error en el tipo de dato. debe ser numero entre 1 y 3");
          teclado.next();
        }
      } while (!entradaValida);

    } while (opcion != 3);
    teclado.close();
  }

  public static void menu() {
    System.out.println("================  MINI JUEGOS JAVA  ================");
    System.out.println("1 ----> JUGAR AL AHORCADO");
    System.out.println("2 ----> JUGAR AL 4 EN RAYA");
    System.out.println("3 ----> SALIR");

  }

}
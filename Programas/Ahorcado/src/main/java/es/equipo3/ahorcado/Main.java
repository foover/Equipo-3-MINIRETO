/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.equipo3.ahorcado;

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
                                Ahorcado ahorcado = new Ahorcado();
                                ahorcado.jugarAhorcado(teclado);
                                
                            }
                            case 2 -> {
                                System.out.println("Este es elige la fila");
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.equipo3.juegos;

import java.util.Scanner;

/**
 *
 * @author daw121
 */
public class JugarCuatroEnRaya {

    public void jugarCuatroEnRaya(Scanner in) {
        Cuatro cer = new Cuatro();
        Scanner entrada = new Scanner(System.in);
        // metodos
        // mostrar Turno
        // insertar En
        // validar Posicion 
        //buscar

        
        System.out.println("----CUATRO EN RAYA----");
        
        System.out.println("jugador 1 = x");
        System.out.println("jugador 2 = O");
        
        //boolean juegoTerminado = false;
        
        
        while(!cer.finPartida()){
            // empieza el juego 
            System.out.println("---jugada---");
            // mostrar tablero 
            cer.mostrarTabla();
            System.out.println("");
            
            // mostrar turno
            cer.mostrarTurno();
            
            boolean entradaValida = false;
            
            // validacion de la entrada
            while(!entradaValida){
                
            
                System.out.println("Introduce la columna de 0-6: ");
                // COMBALIDACION DE LA ENTRADA
                if (!entrada.hasNextInt()){
                    System.out.println("Error, Tiene que ser un numero");
                    entrada.next();    
                }else{
                    int columna = entrada.nextInt();

                    // validacion de la columna, si la entrada seria 67 cualquier otro numero que no esta en entre 0 y 6, te sale el mensaje de abajo 
                    if (columna < 0 || columna > 6 ){
                        System.out.println("Columna invalida");
                        entradaValida = false;
                    }else{
                        cer.insertarEn(columna);
                        entradaValida = true;
                        //cer.cambioTurno();
                    }
                }
            }
            // para salir del bucle
            if (cer.finPartida()){
                break;
            }
            // cambia de turno
            cer.cambioTurno();
        }
        cer.mostrarTabla();
        System.out.println("");
        cer.ganador();
         
        entrada.close();
        
    } 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Paquete;

import java.util.Scanner;

/**
 *
 * @author daw121
 */
public class Principal {

    public static void main(String[] args) {
        cuatro cer = new cuatro();
        Scanner entrada = new Scanner(System.in);
        // metodos
        // mostrar Turno
        // insertar En
        // validar Posicion 
        //buscar
        System.out.println("----CUATRO EN RAYA----");
        
        System.out.println("jugador 1 = x");
        System.out.println("jugador 2 = O");
        
        boolean juegoTerminado = false;
        
        
        while(!juegoTerminado){
            // empieza el juego 
            System.out.println("---jugada---");
            cer.mostrarTabla();
            System.out.println("");
            
            // mostrar turno
            cer.mostrarTurno();
            
            boolean entradaValida = false;
            
            // validacion de la entrada
            System.out.println("Introduce la columna de 0-6: ");
            if (!entrada.hasNextInt()){
                System.out.println("Error, Tiene que ser un numero");
                entrada.next();    
            }else{
                int columna = entrada.nextInt();
                
                // validacion de la columna 
                if (columna < 0 || columna > 6 ){
                    System.out.println("Columna invalida");
                    entradaValida = false;
                }else{
                    cer.insertarEn(columna);
                    entradaValida = true;
                }
            }
            //
            if (entradaValida){
                cer.cambioTurno();
                System.out.println("");
            }
        }
    }    
}

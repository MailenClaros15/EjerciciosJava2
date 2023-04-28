/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**Crea una clase "Juego" que tenga un método "iniciar_juego" 
 * que permita a dos jugadores jugar un juego de adivinanza de números.
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo.
 * El segundo jugador tiene un número limitado de intentos y recibe una pista 
 * de "más alto" o "más bajo" después de cada intento. El juego termina cuando 
 * el segundo jugador adivina el número o se queda sin intentos. Registra el 
 * número de intentos necesarios para adivinar el número y el número de veces 
 * que cada jugador ha ganado.
 *
 * 
 */
public class Juego {
    public int numero;
    public int numero2;
    
    public Juego(){
        
    }
   
   
    public void encontrarNumero(){
       
        Scanner lp = new Scanner(System.in);
        numero2 = 5;
        int cont = 0;
        int contVidas = 0;
        int contGanador = 0;
        do {
            contVidas++;

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese un numero del 1 al 10 hasta encontrar el correcto!");
                numero = lp.nextInt();
               
                if (numero < numero2) {
                    System.out.println("elige un número más alto  ");
                    System.out.println("Te quedan: " + (4 - i) + " intentos");
                } else if (numero > numero2) {
                    System.out.println("elige un número más bajo  ");
                    System.out.println("Te quedan: " + (4 - i) + " intentos");

                } else if (numero == numero2) {
                    System.out.println("Encontraste el número!! ");
                    System.out.println("Lo encontraste en el intento: " + (i+1));
                    contGanador++;
                    break;

                }
                if(i==4){
                    System.out.println( "Perdiste");
                                    
                }
            } 
       
        } while (contVidas < 4);
        System.out.println("Jugador 2 ganó: " + contGanador);
        System.out.println("Jugador 1 ganó: " + (3 - contGanador));

    }
}

        
    



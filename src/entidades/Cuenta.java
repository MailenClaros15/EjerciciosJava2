/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Edgardo
 */

    

/*** Crea una clase "Cuenta" que tenga atributos como 
 * "saldo" y "titular". Luego, crea un método 
 * "retirar_dinero" que permita retirar una cantidad de 
 * dinero del saldo de la cuenta. Asegúrate de que el saldo 
 * nunca sea negativo después de realizar una transacción de retiro.*/

public class Cuenta {
    public double saldo;
    public String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }
    
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuánto queres retirar?" );
        double retiro= leer.nextDouble();
        
        if (retiro>saldo ){ 
            System.out.println("Su saldo es insuficiente! Pruebe con menos");
        }else {
        saldo -=retiro;
            System.out.println("Su saldo es "+saldo+" despues del retiro de "+retiro);
        
        }
        
    }

}


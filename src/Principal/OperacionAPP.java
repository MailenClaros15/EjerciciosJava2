/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.Operacion;

/**
 *
 * @author Edgardo
 */
public class OperacionAPP {
   public static void main(String[] args) {
       Operacion m1 = new Operacion();
       m1.crearOperacion();
      System.out.println("la suma es: "+m1.suma()+" la resta es: "+m1.resta()+" la multiplicacion es: "+m1.multiplicar()+" la division es de : "+m1.dividir());
      
   } 
}

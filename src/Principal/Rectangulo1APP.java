/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.Rectangulo1;

/**Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con 
 * lados de 4 y 6 y imprime el área del rectángulo.
 *
 * @author Edgardo
 */
public class Rectangulo1APP {
     public static void main(String[] args){
         Rectangulo1 rec1= new Rectangulo1(4,6);
         int area= rec1.calcular_area();
         System.out.print("el area del rectangulo es: "+area);
         rec1.toString();
     }
     
}

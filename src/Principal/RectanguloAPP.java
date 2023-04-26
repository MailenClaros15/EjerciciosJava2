/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.Rectangulo;

/**
 *
 * @author Edgardo
 */
public class RectanguloAPP {
    public static void main(String[] args){
        Rectangulo m2 = new Rectangulo ();
       m2.crearRectangulo();
       int suma=m2.perimetro();
       int resta=m2.superficie();
       
       
      System.out.println("el perimetro: "+m2.perimetro()+" la superficie : "+m2.superficie()+" el rectangulo ");
         m2.construirRectangulo();
         
}
}

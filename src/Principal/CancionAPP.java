/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.CancionExtras;

/**
 *
 * @author Edgardo
 */
public class CancionAPP {
     public static void main(String[] args){
   CancionExtras cancion1 = new CancionExtras();
       cancion1.setTitulo("OME");
       cancion1.setAutor("LAO");
       System.out.println("Título: " + cancion1.getTitulo());
       System.out.println("Autor: " + cancion1.getAutor()); 
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import Principal.Libro;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class Usuario {
    public static void main(String[] args) {
          Scanner leer= new Scanner(System.in);
           
            
            
               System.out.println("ingrese el ISBN del libro");
                System.out.println("ingrese el titulo del libro");
               System.out.println("ingrese el autor del libro");
                System.out.println("ingrese la cantidad de número de páginas que tiene el libro");
          Libro l1=new Libro (leer.next(), leer.next(), leer.next(), leer.nextInt());
           System.out.println(l1);
    }
}

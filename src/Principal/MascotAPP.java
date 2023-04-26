/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.Mascota;
import java.util.Scanner;


public class MascotAPP {

   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in); 
        // TODO code application logic here
        
       Mascota m1= new Mascota("Fernando","chiquito", "Perro"); 
       
       //Si apretamos dentro del parentesis del constructos y apretamos controlo esoacio sugiere 
       //los argumentos que podemos seleccionar,en este caso teniamos 3 uno vacio, uno con 3 argumentos, y uno con todos
       //hacemos nacer un objeto con la derecha del objeto y con la izquierda lo asigno 
          m1.pasear(100);
       m1.setNombre("Pepe chiquito");
        System.out.println(m1);
       m1.pasear(100);
                
                
    ///si los valores no estan especificados en este caso edad y color se va a imprimir
    //un valor determinado edad(0) y color (null)
//    public String nombre;
//    public String apodo;
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
//        
        
    }
    
}

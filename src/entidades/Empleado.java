/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
 * empleado en función de su edad y salario actual. El aumento salarial debe ser del
 * 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 *
 * 
 */
public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    
    public void Empleado(){
}

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public void calcular_aumento(){
        
  Scanner leer=new Scanner(System.in);
        System.out.println("ingresar edad");
        edad=leer.nextInt();
         System.out.println("ingresar nombre");
         nombre=leer.next();
          System.out.println("ingresar salario");
          salario=leer.nextDouble();
          
          if(edad>30){
             System.out.println("El aumento de su sueldo es: "+ (salario*0.10));
          
          }
          else{
               System.out.println("el aumento de su sueldo es: "+(salario*0.05));
          }
    }      
}

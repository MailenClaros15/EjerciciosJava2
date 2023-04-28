/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;


public class Rectangulo {

    private int base, altura;

    public Rectangulo() {
    }

    public void crearRectangulo() {
       Scanner lp = new Scanner(System.in);
        System.out.println("Ingrese la base y altura");
        base = lp.nextInt();
        altura = lp.nextInt();
        
         
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
public int superficie(){
int superficie = base*altura;
     return superficie;
}
public int perimetro(){
    int perimetro = (base*altura)*2;
    return perimetro;
}
public void construirRectangulo(){
 
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < base; j++) {
            if((i==0)||(i==altura-1)||(j==0)||(j==base-1)){
                System.out.print(" *");} 
            else{System.out.print("  ");
            }
                
        }System.out.println(" ");
    }
    
    
}
}

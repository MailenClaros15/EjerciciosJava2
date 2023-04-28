/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y
 * un método "calcular_area" que calcule y devuelva el área del rectángulo.
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con 
 * lados de 4 y 6 y imprime el área del rectángulo.
 *
 * @author Edgardo
 */
public class Rectangulo1 {
    public int lado1;
    public int lado2;

    public Rectangulo1() {
    }

    public Rectangulo1(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public int calcular_area(){
        int area;
        area=lado1*lado2;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo1{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
}

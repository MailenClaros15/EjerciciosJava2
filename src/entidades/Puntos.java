/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

public class Puntos {

    public int x1, y1, x2, y2;

    public void crearPuntos() {
        Scanner lp = new Scanner(System.in);
        System.out.println("Insertar los puntos...(x1,y1),(x2;y2) en orden");
        x1 = lp.nextInt();
        y1 = lp.nextInt();
        x2 = lp.nextInt();
        y2 = lp.nextInt();
    }

    public double calcularDistancia() {
        double distancia;

       distancia= Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        return distancia;
    }

    @Override
    public String toString() {
        return "pountos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }

}

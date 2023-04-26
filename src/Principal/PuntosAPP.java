/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.Puntos;

/**
 *
 * @author Edgardo
 */
public class PuntosAPP {
    public static void main(String[] args) {
        Puntos p1 = new Puntos ();
        p1.crearPuntos();
        p1.calcularDistancia();
        System.out.println("la distancia entre los puntos es: "+p1.calcularDistancia());
    }
}

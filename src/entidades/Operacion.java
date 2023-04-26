/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Edgardo
 */
import java.util.Scanner;

public class Operacion {

    private int numero1, numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner lp = new Scanner(System.in);
        System.out.println("Ingrese dos numeros ");
        numero1 = lp.nextInt();
        numero2 = lp.nextInt();
    }

    public int suma() {
        int sumas = numero1 + numero2;

        return sumas;
    }

    public int resta() {
        int resta = numero1 - numero2;

        return resta;

    }

    public int multiplicar() {
        int multiplicar = 0;
        
        if (numero1 == 0) {
           System.out.println("Error por multiplicar por 0");
        } else if (numero2 == 0) {
            System.out.println("Error por multiplicar por 0");
        } else {
            multiplicar = numero1 * numero2;
        }
        return multiplicar;
    }
    public double dividir() {
        double divir = 0;
        
        if (numero1 == 0) {
           System.out.println("Error por dividir por 0");
        } else if (numero2 == 0) {
            System.out.println("Error por dividir por 0");
        } else {
            divir =(double)numero1/numero2;
        }
        return divir;
    }
    
}

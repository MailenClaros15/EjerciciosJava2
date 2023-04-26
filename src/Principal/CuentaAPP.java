/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import entidades.Cuenta;

/**
 *
 * @author Edgardo
 */
public class CuentaAPP{
    public static void main(String[] args) {
      Cuenta lp = new Cuenta(2000,"Walter");

       
      lp.retirar_dinero();
      
        
    }
    
 

}

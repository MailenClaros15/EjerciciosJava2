/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 *
 */
public class Mascota {

    private String nombre;
    public String apodo;
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    private int energia;

    public Mascota() {
        //tenemos creado nuestro constructor
this.energia= 1000 ;
    }
     
     
    public Mascota(String nombre, String apodo, String tipo) {
        //parametros del constructor,definimos lo que recibe el constructor para poder funcionar 
        //desingar o asignar ?como hacemos esto?
        this.nombre = nombre;
        //this. nombre hace referencia al atributo ingresado, a lo que llega 
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia= 1000 ;
//podemos agregar logica en los constructores
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho"));
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia= 1000 ;
    }
    
public void setNombre(String Nombre){
    
    //creamos un set para cuando tenemos privado el argumento nombre 
    //tambien se le puede agregar condicionales 
    if (nombre.length()>0){
       this.nombre= nombre; 
        this.energia= 1000 ;
    }
}
    public String getNombre(){
      return nombre  ;
       
    }

    
    public int pasear(int energiaRestar){
        //cada que sea pasea va adescontar energia 
        energia= energia-energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
    
   
    

}


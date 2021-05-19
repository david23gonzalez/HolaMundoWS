/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubu.holamundows;

import com.ubu.beans.Circulo;
import com.ubu.beans.Empleado;
import com.ubu.beans.Figura;
import com.ubu.beans.Persona;
import com.ubu.beans.Triangulo;

/**
 *
 * @author david
 */
public class HolaMundo {
    
 
    
    public static void main(String[] args) {
        System.out.println("Pedro PICAPIERDRA----");
        
        Persona p1 = new Persona("Juan","Castillo");
        Persona p2 = new Persona("Juan","Castillo");
        Empleado empleado = new Empleado("David", "Gonzalez", "CocaCola");
        System.out.println(empleado);
        System.out.println(p1.equals(p2));
        
        Figura f1 = new Triangulo(3,5,"rojo");
        Figura f2 = new Circulo("rojo",5);
        
        System.out.println(f1.area());
        System.out.println(f2.area());
        
        System.out.println(f1.equals(f2));
    }
    
    
}

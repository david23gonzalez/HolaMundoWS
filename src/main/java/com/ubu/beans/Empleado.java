/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubu.beans;

/**
 *
 * @author david
 */
public class Empleado extends Persona{
    
    private String empresa;

    public Empleado(String nombre, String apellido, String empresa) {
        super(nombre,apellido);
        this.empresa=empresa;
    }
    
    public String toString(){
        return "La persona "+super.getNombre()+" "+super.getApellido()+" trabaja para: "+empresa;
    }
    
      
}

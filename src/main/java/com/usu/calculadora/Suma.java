/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usu.calculadora;

/**
 *
 * @author david
 */
public class Suma implements OperacionI{

    public Suma() {
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    
    
    String nombre = "SUMA";

    @Override
    public int operacion(int a, int b) {
        return a+b;
    }
    
}

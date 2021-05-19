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
public class Circulo extends Figura{
    
    public double radio;

   
    public Circulo(String color, double radio) {
        super(color);
        this.radio=radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
    
    

}
    
    

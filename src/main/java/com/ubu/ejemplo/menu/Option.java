/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubu.ejemplo.menu;

import com.ubu.beans.Circulo;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Option implements Descriptible{
    
    public Option(){
        
    }
    
    @Override
    public String description(){
        return "Alta";
    }

//    @Override
//    public Calculable action() {
//        return new Circulo(getRadio(),"red");
//    }

    public double getRadio() {
       System.out.println("Introduce el radio:");
       return new Scanner(System.in).nextDouble();
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

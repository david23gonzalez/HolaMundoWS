/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usu.calculadora;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Operacion {
    
    private OperacionI operacion;
    
    private int a , b;

    public Operacion(OperacionI operacion) {
        this.operacion = operacion;
    }
    
    public String getNombre(){
        return operacion.getNombre();
    }
    
    public void introducirDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor a:");
        a=teclado.nextInt();
        System.out.println("Introduce el valor b:");
        b=teclado.nextInt();
    }
    
    public int operar(){
        return operacion.operacion(a, b);
    }
    
    
      
}

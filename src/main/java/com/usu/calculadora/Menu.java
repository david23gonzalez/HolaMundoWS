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
public class Menu {
    
    public static void main(String[] args) {
        Operacion[] operaciones = new Operacion[2];
        operaciones[0] = new Operacion(new Suma());
        operaciones[1] = new Operacion(new Resta());
        
        boolean exit = false;
        int opcion;
        
        while(!exit){
            for (int i = 0; i < operaciones.length; i++) {
                System.out.println(i+1+" - "+operaciones[i].getNombre());                
            }
            System.out.println(" Salir ");
            System.out.println("Introduce num:");
            Scanner teclado = new Scanner(System.in);
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    operaciones[opcion-1].introducirDatos();
                    System.out.println("El resultado es: "+operaciones[opcion-1].operar());
                    break;
                case 2:
                    operaciones[opcion-1].introducirDatos();
                    System.out.println("El resultado es: "+operaciones[opcion-1].operar());
                    break;
                case 3:
                    System.out.println("Adios!");
                    exit=true;
                    break;
            }
        }
        
        
    }
    
}

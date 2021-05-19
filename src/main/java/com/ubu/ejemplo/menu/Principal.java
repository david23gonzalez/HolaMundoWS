/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubu.ejemplo.menu;

import com.ubu.beans.Circulo;
import com.ubu.beans.Figura;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Principal {
    
   
    
    public static void main(String[] args) {
        
        int opcion = 0;
        Circulo[] circulos = new Circulo[5];
        int indice = 0;
        
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("1 - Alta"); 
            System.out.println("2 - Listar");   
            System.out.println("3 - Salir");  
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    indice = altaFiguras(teclado, circulos, indice);
                    break;
                case 2:
                    listarFiguras(circulos);
                    break;
                case 3:
                    System.out.println("Fin del programa");
            }
        }while(opcion!=3);
    
    }
    
    public static void main2(String[] args) {
        Option[] option = new Option[3];
        
    }
    
    
    private static void listarFiguras(Figura[] figuras){
        
        for(Figura figura : figuras){
            if(figura!=null){
                System.out.println("el area es: "+figura.area());
            }
        }
    }
    
    private static int  altaFiguras(Scanner teclado, Figura[] figuras, int indice){
        System.out.println("Dame el radio del circulo");
        figuras[indice]=new Circulo("RED", teclado.nextDouble());
        return indice++;
        
    }
    
}

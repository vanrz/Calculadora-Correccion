/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micalculadora;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Principal {
    public static void main(String[] args){ 
        
        MiCalculadora miCalculadora;
        miCalculadora=new MiCalculadora();
                
        
        Trigonometrica trigo;
        trigo=new Trigonometrica();
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1) suma");
        System.out.println("2) resta");
        System.out.println("3) seno");
        System.out.println("4) coseno");
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        switch (myScanner.nextInt()) {     
            case 1:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.sumar();
                System.out.println(miCalculadora.getR());
                break;
                
            case 2:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.restar();
                System.out.println(miCalculadora.getR());
                break;
                
            case 3:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.seno();
                System.out.println(trigo.getR());
                break;
                
            case 4:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.coseno();
                System.out.println(trigo.getR());
                break;   
            default:
                break;
        }      
       
        System.out.println("¿Desea realizar otra operación?");
        System.out.println("1) si");
        System.out.println("2) no");
                
        
                
    }
    
}
           
    
        
                
    




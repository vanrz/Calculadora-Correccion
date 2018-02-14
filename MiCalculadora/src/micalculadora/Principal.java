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
        System.out.println("Seleccione el tipo de operación:");
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
            case 2:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.restar();
                System.out.println(miCalculadora.getR());
            case 3:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.seno();
                System.out.println(trigo.getR());
            case 4:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.coseno();
                System.out.println(trigo.getR());
        }      
    }
}
           
    
        
                
    




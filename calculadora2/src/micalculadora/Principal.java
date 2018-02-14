
package micalculadora;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args){ 
        
        MiCalculadora miCalculadora;//definir
        miCalculadora=new MiCalculadora();//construir un objeto
                
        
        Trigonometrica trigo;//definir
        trigo=new Trigonometrica();//construir un objeto
        
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1) suma.");
        System.out.println("2) resta.");
        System.out.println("3) seno.");
        System.out.println("4) coseno.");
        
        
        Scanner myScanner;//definir
        myScanner = new Scanner(System.in);
        
        switch (myScanner.nextInt()) {   
            
            case 1:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.sumar();
                System.out.println("El resultado de la suma es:");
                System.out.println(miCalculadora.getR());
                break;
                
            case 2:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.restar();
                System.out.println("El resultado de la resta es:");
                System.out.println(miCalculadora.getR());
                break;
                
            case 3:
                
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.seno();
                System.out.println("El seno de "+miCalculadora.getX()+" es:");
                        
                System.out.println(trigo.getR());
                break;
                
                        
                      
            case 4:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.coseno();
                System.out.println("El coseno de "+miCalculadora.getX()+" es:");
                System.out.println(trigo.getR());
                break;   
                
            default:
                System.out.println("Esta no es una opcion. Por favor escoja nuevamente.");
                System.out.println("Seleccione la operación que desea realizar:");
                System.out.println("1) suma.");
                System.out.println("2) resta.");
                System.out.println("3) seno.");
                System.out.println("4) coseno.");
        
        
       
        
                switch (myScanner.nextInt()) {   
            
                case 1:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.sumar();
                System.out.println("El resultado de la suma es:");
                System.out.println(miCalculadora.getR());
                break;
                
            case 2:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                System.out.println("Ingrese Y:");
                miCalculadora.setY(myScanner.nextDouble());
                miCalculadora.restar();
                System.out.println("El resultado de la resta es:");
                System.out.println(miCalculadora.getR());
                break;
                
            case 3:
                
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.seno();
                System.out.println("El seno de "+miCalculadora.getX()+" es:");
                        
                System.out.println(trigo.getR());
                break;
                
                        
                      
            case 4:
                System.out.println("Ingrese X:");
                miCalculadora.setX(myScanner.nextDouble());
                trigo.coseno();
                System.out.println("El coseno de "+miCalculadora.getX()+" es:");
                System.out.println(trigo.getR());
                break;   
        
               
        }      
       break; 
               
    }
    
    }}

           
    
        
                
    




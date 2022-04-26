/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        int a,b;
        
           System.out.println("digite los dos numeros A : ");
           a=lector.nextInt();
           System.out.println("digite los dos numeros B: ");
           b=lector.nextInt();
           
           if(a>b){
               System.out.println(" «A ES MAYOR QUE B» ");
           }
           else if(a==b){
               
              System.out.println("  «A ES IGUAL A B» ");
              
           }
           else{
                System.out.println(" «A ES MENOR QUE B» ");
           }
               
           
           
    }
    
}

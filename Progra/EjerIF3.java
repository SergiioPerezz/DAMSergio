/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IF;

/**
 *
 * @author developer
 */
import java.util.Scanner;

public class EjerIF3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
               
        System.out.println("Introduce la nota: " );
        int nota = teclado.nextInt();
        
        if (nota < 5 && nota>=0) {
            System.out.println("Suspenso");
            
        }
        
        if (nota>=5 && nota<7) {
            System.out.println("Aprobado");
            
        }
              
        if (nota>=7 && nota<9) {
            System.out.println("Notable");
            
        }
        
          if (nota>=9 && nota<10) {
            System.out.println("Sobresaliente");
            
        }
        
          if (nota==10) {
            System.out.println("Matricula");
            
        }
          
          if (nota<0 && nota>10) {
            System.out.println("Fuera de rango");
            
        }
    }
    
}

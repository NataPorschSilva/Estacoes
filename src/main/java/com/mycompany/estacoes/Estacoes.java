
package com.mycompany.estacoes;

import java.util.Scanner;

public class Estacoes {

    public static void main(String[] args) {
        
        Scanner estacoes = new Scanner (System.in);
        
        int x;
        
        System.out.println("Qual estação você busca?");
         x = estacoes.nextInt();
        
        switch (x) {
            
            case 1:
                System.out.println("Verão");
            break;
            
            case 2:
                System.out.println("Inverno");
            break;
            
            case 3:
                System.out.println("Primavera");
            break;
            
            case 4:
                System.out.println("Outono");
            break;
            
            default:
                System.out.println("Estação não encontrada");
                break;
                
            
                
              
                    
                
                     
        }
        
        
       
    }
}

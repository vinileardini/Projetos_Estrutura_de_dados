/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes_aula2;

import java.util.Scanner;
/**
 *
 * @author 00106452
 */
public class Testes_aula2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i, pares=0, impares=0;
        
        int v [] = new int [10];
        
        for (i=0; i<10; i++)
        {
            Scanner ler = new Scanner (System.in);
            
            v[i] = ler.nextInt();
            
            if (v[i] % 2 == 0)
            {
                pares = pares + v[i];
            }
            
            else 
            {
                impares = impares + v[i];
            }
         
        }
        
        System.out.println("A soma dos números pares é: " + pares);
        
        System.out.println("A soma dos números ímpares é: " + impares);
        
        
        
        
        
    }
    
}

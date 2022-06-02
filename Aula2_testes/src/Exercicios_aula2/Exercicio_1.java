/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_aula2;

import java.util.Scanner;
/**
 *
 * @author 00106452
 */
public class Exercicio_1 
{
     public static void main(String[] args)
     {
         String mesas [] = new String [10];
         
         int m;
  
 
         Scanner ler = new Scanner (System.in);
         
         for (m = 1; m <= 10; m++)
         {
         System.out.printf("\n Insira o nome do grupo da %d° mesa: ", m );
         
         mesas [m] = ler.next();
       
         
            if (m % 2 == 0)
            {
               System.out.printf("A mesa %d deve receber sobremesa ", m);
            }
            else
            {
                System.out.printf("A mesa %d não deve receber sobremesa ", m);
            }
        
               
         }
  
         
     }
}

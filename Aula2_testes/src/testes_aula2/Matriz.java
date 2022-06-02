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


public class Matriz 
{
    public static void main(String[] args)
    {
        int m [][] = new int [4][3];
    
        int i,j, pares = 0, impares = 0;
        
        
        int count = 1;
        
        for (i=0;i<4 ;i++)
        {
            for (j=0 ;j<3 ;j++)
            {   
                m[i][j] = count;
                
                if(i % 2 == 0 && j % 2 == 0)
                {
                    pares +=  m[i][j];
                }
                else if (i % 2 != 0 && j % 2 != 0)
                {
                    impares += m[i][j];
                }
                count ++;
            }
        }
        
        System.out.println("A soma dos números pares é: " + pares);
        System.out.println("A soma dos números impares é: " + impares);
          
    }
}
    
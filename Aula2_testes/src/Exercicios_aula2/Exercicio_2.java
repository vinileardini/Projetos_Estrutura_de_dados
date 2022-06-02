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
public class Exercicio_2 
{
    public static void main(String[] args)
    {
        int x,y=1;
        
        int pontos [] = new int [25];
        
         Scanner ler = new Scanner (System.in);
        
        while (y<5)
        {
            for (x=1; x<6; x++)
            {
            
                System.out.printf("\n \n Insira a pontuação do %d° piloto: ",x);
            
                pontos [x] = ler.nextInt();
            
                if (pontos[x] % 2 != 0)
                {
                    System.out.printf(" O %d° piloto deve receber 100 créditos",x);
                }
                else
                {
                    System.out.printf(" O %d° não deve receber 100 créditos",x);
                }
            
            
            }
        ++y;
        }
            
        
        
        
        
    }
}

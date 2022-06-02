/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula1;

import java.util.Scanner;

public class Exercicio_3 
{
    public static void main(String[] args)
    {
        
        double IR; 
        
        Scanner ler = new Scanner(System.in);
    
        double SalBase  = ler.nextDouble();
    
        Scanner ler2 = new Scanner(System.in);
  
        double Gratif = ler2.nextDouble();
    
        double SalBruto =  SalBase + Gratif;
    
        if (SalBruto < 1000)
        {
            IR = SalBruto * 0.2;
        }
        else
        {
            IR = SalBruto * 0.15;
        }
    
    double SalLiq = SalBruto - IR ;
    
    System.out.println("O salário líquido é: R$ " + SalLiq);
    }
    
    
 
    
    
    
    
}

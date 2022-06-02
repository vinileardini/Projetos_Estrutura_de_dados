/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_aula1;

import java.util.Scanner;
/**
 *
 * @author DESKTOP
 */
public class Exercicio_7 
{
    public static void main(String[] args)
    {
        double Ac1=0, Ac2=0, Ag=0, Af=0, MediaFinal=0;
        System.out.println("Insira o valor da AC1: ");
        
        Scanner ler = new Scanner (System.in);
        if (Ac1 <= 10)
        {
            Ac1 = ler.nextDouble();
        }
        else 
        {
            Ac1 = 0;
        }
        
        
        System.out.println("Insira o valor da AC2: ");
        
        Scanner ler2 = new Scanner (System.in);
        
        if(Ac2 <= 10)
        {
            Ac2 = ler2.nextDouble();
        }
        else 
        {
            Ac2 = 0;
        }
        
        System.out.println("Insira o valor de AG: ");
        
        Scanner ler3 = new Scanner (System.in);
        
        if (Ag <= 10)
        {
            Ag = ler3.nextDouble();
        }
        else 
        {
            Ag = 0;
        }
        
        System.out.println("Insira o valor de AF: ");
        
        Scanner ler4 = new Scanner (System.in);
        
        if (Af <= 10)
        {
            Af = ler4.nextDouble();
        }
        else 
        {
            Af = 0;
        }
        
        if (Ac1 != 0 || Ac2 != 0 || Ag != 0 || Af != 0)
        {
        MediaFinal = (Ac1 * 0.15) + (Ac2 * 0.3) + (Ag * 0.1) + (Af * 0.45);
        
        System.out.println("A média final é de:" + MediaFinal);
        }
        else 
        {
        System.out.println("Impossível calcular a média final");
        }
        
        
    }
}

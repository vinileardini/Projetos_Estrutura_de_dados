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
public class Exercicio_6 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner (System.in);
        
        double graus_fahrenheit = ler.nextDouble();
        
        double graus_celsius = (graus_fahrenheit - 32) * 5 / 9;
        
        System.out.println(graus_celsius);
        
        
        
        
    }
    
           
    
}

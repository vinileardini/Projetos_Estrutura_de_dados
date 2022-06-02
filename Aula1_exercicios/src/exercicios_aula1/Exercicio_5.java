/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula1;

import java.util.Scanner;
/**
 *
 * @author 00106452
 */
public class Exercicio_5 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        
        double velocidade = ler.nextDouble();
        
        Scanner ler2 = new Scanner(System.in);
        
        double tempo = ler.nextDouble();
        
        double distancia = velocidade * tempo;
        
        double litros_usados = distancia / 12;
        
        System.out.println("A quantidade de litros de combustivel utilizada foi de: " + litros_usados);
        
        
        
        
    }
    
}

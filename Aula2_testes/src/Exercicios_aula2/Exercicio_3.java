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
public class Exercicio_3 
{
    public static void main(String[] args)
    {
        int modelo = 0, continuar = 0;
        
        int camisetas [][] = new int [5][6];
        
        while (continuar != 1)
        {
        
        System.out.printf("Menu de opções: \n 1 - Inserir venda (PP) \n 2 - Inserir venda (P) \n 3 - Inserir venda (M) \n 4 - Inserir venda (G) \n 5 - Inserir venda (GG) \n 6 - Total de vendas por tamanho x modelo \n \n");
        System.out.println("Insira a opção desejada: ");
        
        Scanner ler = new Scanner (System.in);
        
        int escolha = ler.nextInt();
        
        for(modelo = 0; modelo < 5; modelo++)
        
        switch (escolha)
        {
            case 1:
                System.out.printf("Insira o número de vendas do modelo %d do tamanho PP:", modelo+1);
                
                camisetas[modelo][0]=ler.nextInt();
                
                camisetas[modelo][5] +=  camisetas[modelo][0];
                
                break;
            
            case 2:
                System.out.printf("Insira o número de vendas do modelo %d do tamanho P:", modelo+1);
                
                camisetas[modelo][1] = ler.nextInt();
                
                camisetas[modelo][5] += camisetas[modelo][1];
                
                break;
            
            case 3:
                System.out.printf("Insira o número de vendas do modelo %d do tamanho M:", modelo+1);
                
                camisetas[modelo][2] = ler.nextInt();
                
                camisetas[modelo][5] = camisetas[modelo][2];
                
                break;
                
            case 4:
                System.out.printf("Insira o número de vendas do modelo %d do tamanho G:", modelo+1);
                
                camisetas[modelo][3] = ler.nextInt();
                
                camisetas[modelo][5] = camisetas[modelo][3];
                
                break;
                
            case 5:
                System.out.printf("Insira o número de vendas do modelo %d do tamanho GG:", modelo+1);
                
                camisetas[modelo][4] = ler.nextInt();
                
                camisetas[modelo][5] = camisetas[modelo][4];
                
                break;
                
            case 6:
                
                System.out.printf("\n \n O total de camisas vendidas do modelo %d  no tamamho PP totalizam: %d", modelo+1, camisetas[modelo][1]);
                
                
                break;
            
        }
       
            System.out.printf ("\n \n Caso queira sair, digite 1, caso queira retornar ao menu, digite qualquer outro número");
        
            continuar = ler.nextInt();
            
        }
                   
        
        
        
                 
                 
         
        
        
    }
            
           
}

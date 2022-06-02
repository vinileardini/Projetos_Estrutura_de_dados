/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios_aula_3;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DESKTOP
 */
public class Cadastro_aluno 
{

    public static void main(String[] args)
    {
        Lista lista = new Lista ();
        
        Scanner ler = new Scanner (System.in);
        
        int continuar = 1;
        
        while(continuar != 4)
        {
            System.out.printf("\n Menu de opções: \n 1 - Cadastrar aluno \n 2 - Listar alunos \n 3 - Pesquisar aluno \n 4 - Sair \n");
        
            int escolha = ler.nextInt();
            
            switch (escolha)
            {   
            case 1:
                
                Aluno aluno = new Aluno ();
               
                System.out.println("Insira o RA do aluno: ");
                String ra = ler.next();
                System.out.println("Insira o nome do aluno: ");
                String nome = ler.next();
                System.out.println("Insira a 1° nota: ");
                int nota1 = ler.nextInt();
                System.out.println("Insira a 2° nota: ");
                int nota2 = ler.nextInt();
                
                aluno.setRa(ra);
                aluno.setNome(nome);
                aluno.setNota1(nota1);
                aluno.setNota2(nota2);
                
                
                
                lista.adicionarNoFinal(aluno);
              
                
                break;
                
            case 2:
                
                Nodo inicio = lista.getPrimeiroNodo();
                
                for (int i = 1; i <= lista.getQuantidadeNodo(); i++ )
                {
                   System.out.println(inicio.getDado().imprimir());
                    inicio = inicio.getProximo();
                }
                
                break;
                
            case 3:
                
               Nodo inicial = lista.getPrimeiroNodo();
                       
                System.out.println("Insira o RA que deseja buscar: ");
                String opcao = ler.next();
                
                for (int i = 1; i <= lista.getQuantidadeNodo(); i++)
                {   
                    if (inicial.getDado().getRa().equals(opcao))
                    {
                        System.out.println("Os dados do aluno são: " + inicial.getDado().imprimir());
                    }
                    else
                    {
                        inicial = inicial.getProximo(); 
                    }
                    
                        
                }
            
                
         
                break;
                
                
            default:
        
            System.out.printf("\n Comando inválido, tente novamente");
                break;
        
        
        
        
        }
        
            System.out.printf("\n Para sair do programa, digite 4, para continuar, digite qualquer outro número: ");
            continuar = ler.nextInt();
        }
    }


    
}    

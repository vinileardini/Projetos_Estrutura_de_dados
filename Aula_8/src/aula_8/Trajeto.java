
package aula_8;

import java.util.Scanner;

import java.util.Stack;

public class Trajeto 
{
   
    public static void main(String[] args) 
    {
        int a = 0, retornaMenu = 5;
        
        Stack pilha = new Stack ();
      
        Scanner ler = new Scanner (System.in);
        
        do
        {
            System.out.printf("\n Menu de opções: \n 1 - Inserir trajeto \n 2 - Listar trajeto \n 3 - Excluir trajeto específico \n 4 - Excluir todos os trajetos \n 5 - Sair");

            System.out.printf("\n \n Escolha uma das opções: ");

            int escolhaMenu = ler.nextInt();

        
        
            switch (escolhaMenu)
            {
        
                case 1:

                    System.out.printf("\n Insira o %d° local do trajeto: ", a+1);

                    String trajeto = ler.next();

                    pilha.push(trajeto);
                    
                    break;

                case 2:
                    
                    if(pilha.empty() == true)
                    {
                        System.out.println("A pilha está vazia");
                    }
                   
                    else
                    {
                        for (Object x : pilha)
                        {
                            System.out.println(x);
                        }
                    }
                    
                    
                    
                    break;

                case 3:

                    System.out.printf("\n Insira o nome do trajeto que será removido : ");

                    String trajetoRemovido = ler.next();

                    
                    if(pilha.search(trajetoRemovido) != -1)
                    {
                            do
                            {
                                pilha.pop();
                                
                            }while(pilha.contains(trajetoRemovido));
                            
                    }
                    
                    else
                    {
                        System.out.println("Trajeto não encontrado");
                    }
                    
                    
                    
                    break;

                case 4:

                    while (pilha.empty() != true)
                    {
                        pilha.pop();
                    }
                    
                    break;
                    
                case 5:
                    
                    System.out.printf("Encerrando o programa");
                    
                default:
                    
                    System.out.printf("Comando inválido");

                    

            }
            
            System.out.printf("\n Deseja retornar ao menu ? \n (Digite um número diferente de 5 para retornar)");
            
            retornaMenu = ler.nextInt();
            
            a++;
            
        }while (retornaMenu != 5);
        
    }
    
}

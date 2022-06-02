
package Exercicios_aula_4;

import java.util.Scanner;


public class Simulador_trem 
{
    private static Scanner leia = new Scanner(System.in);
    private static Trem lista;
    
    public static void main(String[] args) 
    {
        lista = new Trem();

        int escolha = 0;
        do {
            System.out.print("\n \n Menu \n 1 - Inserir novo vagão \n 2 - Mostrar todos os vagões \n 3 - Deletar um vagão da lista \n 4 - Sair \n");
            
            System.out.printf("\n Insira a opção desejada: ");
            
            escolha = leia.nextInt();

            switch (escolha) 
            {
                case 1:
                    criarVagao();
                    break;

                case 2:
                    printar();
                    break;

                case 3:
                    excluir();
                    break;
                    
                
            }

        } while (escolha != 4);
    }

    public static void criarVagao() 
    {
        String Nome;
        System.out.printf("\n \n Digite o nome do vagão: ");
        Nome = leia.next();
        lista.adicionarNaFrente(Nome);
    }

    public static void excluir() 
    {
        String Nome;
        System.out.printf("\n \n Digite o nome do vagão que será excluido: ");
        Nome = leia.next();
        lista.remover(Nome);
    }

    public static void printar() 
    {
       lista.printar();
    }
    
  }  
    
    



package exercicio6_fila;

import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;


public class Exercicio6_fila {

    
    public static void main(String[] args) 
    {
        Queue<Aluno> fila = new LinkedList<>();
        
        Scanner ler = new Scanner(System.in);
        
        int retornaMenu = 1;
        
        while(retornaMenu == 1)
        {
            System.out.printf("\n Menu de opções: \n 1 - Inserir aluno na fila \n 2 - Chamar o aluno para ser atendido \n 3 - Verificar se a fila está cheia ou vazia \n 4 - Verificar o próximo aluno que será atendido \n 5 - Informam quantos alunos existem na lista \n 6 - Sair ");

            System.out.printf("\n \n Qual a opção desejada ? \n ");

            int escolhaMenu = ler.nextInt();

                switch (escolhaMenu)
                {
                    case 1:

                        Aluno aluno = new Aluno ();

                        System.out.printf("Insira o nome do aluno: ");

                        String nomeAluno = ler.next();

                        System.out.printf("Insira o RA do aluno: ");

                        int raAluno = ler.nextInt();

                        aluno.setNome(nomeAluno);
                        aluno.setRA(raAluno);

                        fila.add(aluno);

                        break;

                    case 2:

                        if (fila.peek() != null)
                            {
                                System.out.printf("É a vez do aluno %s de RA %d ser atendido ", fila.peek().getNome(), fila.peek().getRA());
                            }

                        else
                            {
                                System.out.printf("A fila está vazia");
                            }


                            fila.remove();

                        break;

                    case 3:

                        if(fila.isEmpty() == true)
                        {
                            System.out.printf(" A fila está vazia ");
                        }
                        else
                        {
                            System.out.printf(" Existem alunos na fila ");
                        }


                        break;

                    case 4:

                        System.out.printf("O próximo aluno que será atendido é %s de RA %d ", fila.peek().getNome(), fila.peek().getRA());

                        break;

                    case 5:

                        System.out.printf("Existem %d alunos na fila esperando o atendimento", fila.size());


                        break;

                }

                    System.out.printf("\n \n Deseja retornar ao menu  ? \n (1 - sim /2 - não) ");

                    retornaMenu = ler.nextInt();
                 
        }
    }
}

package aula_8;

import java.util.Scanner;

import java.util.Stack;

public class Container {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int escolhaMenu = 0;

        Stack pilha1 = new Stack();

        Stack pilha2 = new Stack();

        Stack pilha3 = new Stack();

        do {
            System.out.printf("\n Menu de opções: \n 1 - Empilhar container \n 2 - Desempilhar container \n 3 - Sair \n ");

            System.out.println("Insira a opção desejada: ");

            escolhaMenu = ler.nextInt();

            switch (escolhaMenu) {
                case 1:

                    System.out.printf("Insira o código do container que será adicionado: ");

                    String codigoContainer = ler.next();

                    if (pilha1.contains(codigoContainer) == true || pilha2.contains(codigoContainer) == true || pilha3.contains(codigoContainer) == true) {
                        System.out.printf("Código invalido");
                    } else {
                        if (pilha1.empty() == true) 
                        {
                            pilha1.push(codigoContainer);
                        } else {
                            if (pilha1.size() == 3 && pilha2.size() == 3 && pilha3.size() == 3) 
                            {
                                System.out.printf("Impossível empilhar");
                                return;
                            }

                            if (pilha1.size() <= pilha2.size() && pilha1.size() <= pilha3.size()) 
                            {
                                pilha1.push(codigoContainer);
                                System.out.printf("Pilha 1");
                            } else if (pilha2.size() < pilha1.size() && pilha2.size() <= pilha3.size()) 
                            {
                                pilha2.push(codigoContainer);
                                System.out.printf("Pilha 2");
                            } else {
                                pilha3.push(codigoContainer);
                                System.out.printf("Pilha 3");
                            }

                        }

                    }

                    break;

                case 2:

                    System.out.printf("Insira o código do container que deve ser removido: ");

                    String containerRemovido = ler.next();

                    if (pilha1.contains(containerRemovido) == true || pilha2.contains(containerRemovido) == true || pilha3.contains(containerRemovido) == true) {
                        
                        if (pilha1.peek().equals(containerRemovido)) 
                        {
                            pilha1.pop();
                        } 
                        else if (pilha2.peek().equals(containerRemovido)) 
                        {
                            pilha2.pop();
                        } 
                        
                        else if (pilha3.peek().equals(containerRemovido)) 
                        {
                            pilha3.pop();
                        } 
                        else 
                        {
                            System.out.printf("\n \n Impossível desempilhar");
                        }

                    } else {
                        System.out.printf("Código inválido");
                    }

            }

            System.out.printf("\n Deseja retornar ao menu ? \n (Digite 3 para sair ou qualquer outro número para continuar)");

            escolhaMenu = ler.nextInt();

        } while (escolhaMenu != 3);

    }
}

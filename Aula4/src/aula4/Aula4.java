/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;


public class Aula4 
{

    
    public static void main(String[] args) 
    {
        Lista_2_encadeada lista = new Lista_2_encadeada();
        
        
        lista.adicionarInicio(1);
        lista.adicionarInicio(2);
        lista.adicionarFinal(3);
        
        Nodo nodoReferencia = lista.obterNodo(2);
                
        lista.adicionarMeio(nodoReferencia, 4);
       
        for (int i = 0; i <= lista.quantidadeNodo; i++)
        {
            System.out.println(lista.obterNodo(i));
        }
    
    }
    
}

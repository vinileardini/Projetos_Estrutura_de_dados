/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author 00106452
 */
public class Aula3 
{

    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        //lista.adiconarNoInicio(1);
        //lista.adiconarNoInicio(2);
        //lista.adiconarNoInicio(3);
        
        lista.adicionarNoFinal(1);
        lista.adicionarNoFinal(2);
        lista.adicionarNoFinal(3);
        
        lista.removerPrimeiroNodo(1);
        
        Nodo nodo = lista.getPrimeiroNodo();
        
        for (int i = 1; i <= lista.getQuantidadeNodo(); i++)
        {
            System.out.println(nodo.getDado());
            nodo = nodo.getProximo();
        }
        
       
    }
    
}

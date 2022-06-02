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
public class Lista 
{
    private Nodo primeiroNodo;
    
    private int quantidadeNodo = 0;
    
    public void adiconarNoInicio(float Dado)
    {
        Nodo novoNodo = new Nodo ();
        
        novoNodo.setDado(Dado);
        novoNodo.setProximo(getPrimeiroNodo());
        setPrimeiroNodo(novoNodo);
        quantidadeNodo++;
               
    }
    
    public void adicionarNoFinal (float Dado)
    {
        Nodo novoNodo = new Nodo();
        
        novoNodo.setDado(Dado);
        
        if(getPrimeiroNodo() == null)
        {
            setPrimeiroNodo(novoNodo);
        }
        else
        {
            Nodo nodoFinal = getPrimeiroNodo();
            
            while (nodoFinal.getProximo() != null)
            {
                nodoFinal = nodoFinal.getProximo();
            }
            nodoFinal.setProximo(novoNodo);
        }
        quantidadeNodo++;
        
    }
    
    public void removerPrimeiroNodo (float Dado)
    {
        if (getPrimeiroNodo() != null)
        {
            Nodo nodo = getPrimeiroNodo();
            setPrimeiroNodo(nodo.getProximo());
            quantidadeNodo--;
        }
    }

    public Nodo getPrimeiroNodo() 
    {
        return primeiroNodo;
    }

    public void setPrimeiroNodo(Nodo primeiroNodo) 
    {
        this.primeiroNodo = primeiroNodo;
    }

    public int getQuantidadeNodo() 
    {
        return quantidadeNodo;
    }
    
    

    
    
}

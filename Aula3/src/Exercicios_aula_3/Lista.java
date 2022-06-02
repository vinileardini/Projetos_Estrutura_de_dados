/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios_aula_3;

public class Lista 
{
    
    private Exercicios_aula_3.Nodo primeiroNodo;
    
    private int quantidadeNodo;
    
    public void adicionarNoInicio(Aluno Dado)
    {
        Exercicios_aula_3.Nodo novoNodo = new Exercicios_aula_3.Nodo ();
        
        novoNodo.setDado(Dado);
        novoNodo.setProximo(getPrimeiroNodo());
        setPrimeiroNodo(novoNodo);
        quantidadeNodo++;
               
    }
    
    public void adicionarNoFinal (Aluno Dado)
    {
        Exercicios_aula_3.Nodo novoNodo = new Exercicios_aula_3.Nodo();
        
        novoNodo.setDado(Dado);
        
        if(getPrimeiroNodo() == null)
        {
            setPrimeiroNodo(novoNodo);
        }
        else
        {
            Exercicios_aula_3.Nodo nodoFinal = getPrimeiroNodo();
            
            while (nodoFinal.getProximo() != null)
            {
                nodoFinal = nodoFinal.getProximo();
            }
            nodoFinal.setProximo(novoNodo);
        }
        quantidadeNodo++;
        
    }
    
    
    public void removerPrimeiroNodo (Aluno dado)
    {
        if (getPrimeiroNodo() != null)
        {
            Exercicios_aula_3.Nodo nodo = getPrimeiroNodo();
            setPrimeiroNodo(nodo.getProximo());
            quantidadeNodo--;
        }
    }
    
    public Nodo buscarNodo (Aluno valor)
    {
        Nodo nodo = new Nodo();
        
        for(int i = 1; i < quantidadeNodo; i++)
        {
            if(nodo.getDado() == valor)
            {
                return nodo;
            }
            else
            {
                nodo = nodo.getProximo();
            }
        }
         return null;
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

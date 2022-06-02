/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author 00106452
 */
public class Lista_2_encadeada 
{
    private Nodo primeiro;
    
    public int quantidadeNodo=0;
    
    public boolean ListaVazia()
    {
        return quantidadeNodo == 0; // true indica que está vazia, false indica que existem nodos
    }
    
    public void adicionarInicio(float valor)
    {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        
        if (ListaVazia())
        {
            primeiro = novoNodo;
        }
        else
        {
            novoNodo.setProximo(primeiro);
            
            primeiro.setAnterior(novoNodo);
            
            primeiro = novoNodo;
        }
        quantidadeNodo++;
    }
    
    public void adicionarFinal(float valor)
    {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        
        if(ListaVazia())
        {
           primeiro = novoNodo;
        }
        else
        {
            Nodo finalNodo = primeiro;
            
            while(finalNodo.getProximo() != null)
            {
                finalNodo = finalNodo.getProximo();
     
            }
            
            novoNodo.setAnterior(finalNodo);
            finalNodo.setProximo(novoNodo);
        }
        
        quantidadeNodo++;
        
    }
    
    public void adicionarMeio(Nodo nodoReferencia, float valor)
    {
        Nodo nodoPosterior = nodoReferencia.getProximo();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        
        nodoReferencia.setProximo(novoNodo);
        
        novoNodo.setAnterior(nodoReferencia);
        novoNodo.setProximo(nodoPosterior);
        
        nodoReferencia.setProximo(novoNodo);
        
        if(nodoPosterior != null)
        {
            nodoPosterior.setAnterior(novoNodo);
        }
    }
    
    public void removerNodo (Nodo nodo)
    {
        if (primeiro == nodo)
        {
            primeiro = nodo.getProximo();
        }
        else
        {
            Nodo anterior = nodo.getAnterior();
            Nodo proximo = nodo.getProximo();
            
            anterior.setProximo(proximo);
            
            if (proximo != null)
            {
                proximo.setAnterior(anterior);
            }
        }
        
        
    }
    
    public Nodo obterNodo(float valor)
    {
       Nodo no = primeiro;
       
       for (int i = 0; i <= quantidadeNodo; i++)
       {
           if(no.getDado() == valor)
           {
               return no;
           }
           else
           {
               no = no.getProximo();
           }
       }
       return null;
    }
    
    
}

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
public class Nodo 
{
    private float dado;
    
    private Nodo anterior;
    
    private Nodo proximo;

    public float getDado() 
    {
        return dado;
    }

    public void setDado(float dado) 
    {
        this.dado = dado;
    }

    public Nodo getAnterior() 
    {
        return anterior;
    }

    public void setAnterior(Nodo anterior) 
    {
        this.anterior = anterior;
    }

    public Nodo getProximo() 
    {
        return proximo;
    }

    public void setProximo(Nodo proximo) 
    {
        this.proximo = proximo;
    }
    
    
}

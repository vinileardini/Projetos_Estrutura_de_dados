
package Exercicios;

public class Nodo 
{
    private float dado;
    
    private Nodo proximo;
    
    private String nome;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public float getDado() 
    {
        return dado;
    }

    public void setDado(float dado) 
    {
        this.dado = dado;
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

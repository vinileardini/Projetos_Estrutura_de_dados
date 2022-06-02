

package Exercicios;

import java.util.Scanner;

public class Lista 
{
    Scanner leitura = new Scanner (System.in);
            
    private Nodo cursor;
    
    public int quantidadeNodo;
    
    public void proximo()
    {
        cursor = cursor.getProximo();
    }
    
    public void adicionar (float dado)
    {
        Nodo novoNodo = new Nodo();
        
        novoNodo.setDado(dado);
        
        if (cursor == null)
        {
            cursor = novoNodo;
            
            cursor.setProximo(novoNodo);
            
            
        }
        
        else
        {
            Nodo proximo = cursor.getProximo();
            
            cursor.setProximo(novoNodo);
            
            novoNodo.setProximo(proximo);
            
            proximo();
        }
        
        quantidadeNodo++;
        
    }
    
    public void excluir ()
    {
        if (cursor == null)
        {
            return;
        }
        
        else if (cursor == cursor.getProximo())
        {
            cursor = null;
           quantidadeNodo--;
        }
        
        else
        {
            Nodo nodoExcluir = cursor.getProximo();
            
            cursor.setProximo(nodoExcluir.getProximo());
            quantidadeNodo--;
        }
    }
    
    public void buscar ()
    {   
        
        System.out.printf("\n Insira o nome do soldado sorteado para iniciar a contagem: ");
        
        String nomePesquisa = leitura.next();
        
        while(!cursor.getNome().equals(nomePesquisa))
        {
            cursor = cursor.getProximo();
            
            System.out.printf("\n O cursor agora é: %s", cursor.getNome());
        }
    }
    
    public void remocao()
    {
        
    }

    public Nodo getCursor() 
    {
        return cursor;
    }

    public void setCursor(Nodo cursor) 
    {
        this.cursor = cursor;
    }
}

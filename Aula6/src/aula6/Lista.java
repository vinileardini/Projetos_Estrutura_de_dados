
package aula6;


public class Lista 
{
    private Nodo cursor;
    
    private int quantidadeNodo;
    
    public void proximo()
    {
        cursor = cursor.getProximo();
    }
    
    public void adicionar (float dado)
    {
        Nodo novoNodo = new Nodo();
       
        novoNodo.setDado(dado);
        
        if(cursor == null)
        {
            cursor = novoNodo;
            cursor.setProximo(cursor);
           
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

    public Nodo getCursor() 
    {
        return cursor;
    }

    public void setCursor(Nodo cursor) 
    {
        this.cursor = cursor;
    }
    
    public void excluir()
    {
        if (cursor == null)
        {
            return;
        }
        else if (cursor == cursor.getProximo())
        {
            cursor = null;
        }
        else
        {
            Nodo nodoExcluir = cursor.getProximo();
            
            cursor.setProximo(nodoExcluir.getProximo());
        }
    }
}

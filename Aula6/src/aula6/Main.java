
package aula6;


public class Main {

    
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        lista.adicionar(5);
        lista.adicionar(10);
        lista.adicionar(15);
        
       Nodo cursorOriginal = lista.getCursor();
       
       do
       {
           lista.proximo();
           System.out.println(lista.getCursor().getDado()+"");
       
       } while(cursorOriginal != lista.getCursor());
       
       
    }

   
    
}

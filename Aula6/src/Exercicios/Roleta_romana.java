
package Exercicios;


import java.util.Scanner;


public class Roleta_romana 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        Scanner ler = new Scanner(System.in);
        
        Nodo soldadoRemovido, soldadoIniciaContagem = null;
        
        int i = 1,continuarAdicao, numeroDeNodo=1;
        
        do
        {
            lista.adicionar(i);
            
            System.out.printf("\n Digite o nome do %d° soldado: ", i);
            String soldado = ler.next();
            
            lista.getCursor().setNome(soldado);
            
        
            System.out.printf("\n Digite 1 para parar de adicionar soldados, digite qualquer outro número para continuar adicionando soldados: ");
            continuarAdicao = ler.nextInt();
        
            ++i;
        
        } while(continuarAdicao != 1);
       
        
        lista.buscar();
       
        System.out.printf("\n Insira o número sorteado: ");
        
        int numeroSorteado = ler.nextInt();
           
        
        do
        {
            soldadoRemovido = lista.getCursor();
            
            for(int sequenciaExclusao = 0; sequenciaExclusao < numeroSorteado-1; sequenciaExclusao++)
            {
                lista.proximo();
            }
            
            System.out.printf("\n O soldado removido foi: %s", lista.getCursor().getProximo().getNome());
            
            
            lista.excluir();
            
            
            
        }while (lista.quantidadeNodo > 1);
        
        
        System.out.printf("\n O soldado que escapará será o: %s", lista.getCursor().getNome());
        
        
        
        
    }
}

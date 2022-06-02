
package aula_8.exercicios;

import java.util.Stack;

public class Main 
{
 
 public static void main(String[] args) 
 {
       Stack pilha1 = new Stack ();
       
       pilha1.push("Entrada 1");
       
       pilha1.push("Entrada 2");
       
       pilha1.push("Entrada 3");
       
       System.out.println(pilha1.pop());
       
       System.out.println(pilha1.peek());
       
       System.out.println(pilha1.empty());
       
       System.out.println(pilha1.size());
       
       System.out.println(pilha1.search("Entrada 2"));
       
       for (Object x : pilha1)
       {
           System.out.println(x);             
       }
       
       
 }
 
}

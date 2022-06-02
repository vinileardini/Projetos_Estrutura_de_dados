/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_aula_3;

/**
 *
 * @author 00106452
 */
public class Aluno 
{
    private String ra;
    private String nome;
    private double nota1;
    private double nota2;
    
    public double calcularMedia()
    {
        return (nota1 + nota2)/2;
    }
    
    public String imprimir ()
    {
        return "\n \n Ra: " + ra + "\nNome: " + nome + "\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + calcularMedia();
    }

    public String getRa() 
    {
        return ra;
    }

    public void setRa(String ra) 
    {
        this.ra = ra;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) 
    {
        this.nota1 = nota1;
    }

    public double getNota2() 
    {
        return nota2;
    }

    public void setNota2(double nota2) 
    {
        this.nota2 = nota2;
    }
    
    
}

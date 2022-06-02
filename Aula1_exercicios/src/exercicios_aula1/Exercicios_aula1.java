/*
 Neste projeto, você criará um programa que calcula a que distância, em pés, um ouvinte está da queda de um relâmpago. 
O som viaja a aproximadamente 1.100 pês por segundo pelo ar. Logo, conhecer o intervalo entre o momento em que você̂ viu 
um relâmpago e o momento em que o som o alcançou lhe permitirá calcular a distância do relâmpago.
 */
package exercicios_aula1;

import java.util.Scanner;
/**
 *
 * @author 00106452
 */
public class Exercicios_aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double tempo = 7.2;
        
        int distanciaouvinte = 1100;
        
        double distanciareal = tempo * distanciaouvinte;
        
        System.out.println(distanciareal);
        
    }
    
}

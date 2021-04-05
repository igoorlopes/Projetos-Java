// projeto simples de soma de numeros
// utilizando a entrada de dados via teclado (Scanner)

package projetoexemplo1;

import java.util.Scanner;
// importar a biblioteca de utilidades Scanner

public class Projeto2 {
    
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);        
        float x=0, y=0, r=0;           
        
        // criar novo Scanner
        // variavel numero recebendo os dados
        
        System.out.println ("Digite o primeiro numero: ");
        x=numero.nextFloat();
        
        // variavel x recebe o valor digitado
        
        System.out.println("Digite o segundo numero: ");
        y=numero.nextFloat();
        
        // variavel y recebe o valor digitado
        
        System.out.println("A soma dos numeros é: " + (x+y));
    }
    
}

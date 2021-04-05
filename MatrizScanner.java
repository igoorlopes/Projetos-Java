package estruturadedados;

import java.util.Scanner;

public class MatrizScanner {
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        System.out.println("Digite 9 valores para a matriz: ");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
            matriz[i][j] = entrada.nextInt();
        }
    }
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
            System.out.print(matriz[i][j] + " ");
        }        
        System.out.println();        
    }
    
}

package Atividade6;

import java.util.Scanner;


public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Cria e pede para inserir os valores na matriz
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[i].length;j++){
                System.out.printf("Digite o valor da posição [%d] [%d] da matriz: ",i,j);
                matriz[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        
        // Exibe a matriz no console
        for(int[] linha : matriz){
            for(int valores : linha){
                System.out.print(valores+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
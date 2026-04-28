package Atividade5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int[] randomArray(){
        Random random = new Random();

        int n = random.nextInt(10)+1;
        int[] numeros = new int[n];
        for(int i = 0; i<n;i++){
            int n2 = random.nextInt(1000);
            numeros[i] = n2;
        }
        return numeros;
    }

    public static int[] escolherArray(int n, Scanner sc){
        int[] numeros = new int[n];

        for(int i = 0; i<n;i++){
            System.out.printf("\nDigite o %d numero\n", i+1);
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }
        return numeros;
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - 1 -i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void exibirMenu(int menu){
        switch (menu){
            case 1:
                System.out.println("""
                
                Bubble Sort
                
                1 - Escolher a quantidade de numeros
                2 - Totalmente aleatorio
                0 - Voltar ao menu
                """);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println("""
                Digite qual exercicio vc quer acessar
                
                1 - Sort de arrays
                2 - Edição de valores no array
                3 - Inverter o nome
                0 - Sair
                """);
                break;
        }

    }

    public static void exercicio1(Scanner sc) {
        int op = 1;
        while(op!=0) {
            exibirMenu(1);
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Quantos numeros vc quer?");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.println("""
                            Vetor organizado!
                            \n
                            """+Arrays.toString(bubbleSort(escolherArray(n,sc))));
                    System.out.println("Aperte enter para continuar");
                    sc.nextLine();
                    break;
                case 2:
                    int[] temp = randomArray();
                    System.out.printf("""
                            Vetor
                            
                            %s
                            
                            Vetor organizado!
                           
                            %s
                            """,Arrays.toString(temp),Arrays.toString(bubbleSort(temp)));
                    System.out.println("Aperte enter para continuar");
                    sc.nextLine();
                    break;
                case 0:
                    System.out.println("\nVoltando ao menu!");
                    break;
                default:
                    System.out.println("Digite uma op valida");
            }
        }
    }

    public static int[] modificarArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            if (arr[i]%2==0) {
                arr[i] = arr[i]*2;
            }else {
                arr[i] = (int) Math.pow(arr[i],2);
            }
        }
        return arr;
    }

    public static void exercicio2(Scanner sc){
        System.out.println("Digite o tamanho do array");
        int n = sc.nextInt();
        int[] temp = escolherArray(n,sc);
        System.out.printf("""
                Vetor original
                
                %s
                
                Vetor modificado
                
                %s
                """,Arrays.toString(temp),Arrays.toString(modificarArray(temp)));
        System.out.println("Aperte enter para continuar");
        sc.nextLine();
    }

    public static void exercicio3(Scanner sc){
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        String resultado ="";
        for(int i = nome.length()-1; i >= 0;i--){
            resultado += nome.charAt(i);
        }
        System.out.println(resultado);
        System.out.println("Aperte enter para continuar");
        sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 1;
        while (op!=0){
            exibirMenu(4);
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    exercicio1(sc);
                    break;
                case 2:
                    exercicio2(sc);
                    break;
                case 3:
                    exercicio3(sc);
                    break;
                case 0:
                    System.out.println("Encerrando!");
                    break;
                default:
                    System.out.println("Digite uma op valida!");
                    break;
            }
        }
    }
}
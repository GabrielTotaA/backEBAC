import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void crescente(int n){
        System.out.println("\nCrescente\n");
        for(int i = 0; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void decrescente(int n){
        System.out.println("\nDecrescente\n");
        for(int i = n; i>=0; i--){
            System.out.println(i);
        }
    }

    public static void exibirNome(String nome,int n){
        System.out.println("\nNome:\n");
        if(nome.length() > 6){
            for(int i=0;i<=n;i++){
                System.out.println(i+" "+nome);
            }
        }
        else {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo! Digite seu nome!\n");
        String nome = sc.nextLine();
        System.out.println("\nDigite um numero!\n");
        int n = sc.nextInt();

        crescente(n);
        decrescente(n);
        exibirNome(nome,n);

    }
}
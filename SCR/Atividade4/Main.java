import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void taboada(int n) {
        for(int i = 0; i<=10;i++){
            System.out.println(n +" * "+i+" = "+ n*i);
        }
    }

    public static void exibirMenu(){
        System.out.println("""
                \n
                1 - Continuar
                0 - Sair
                """);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Digite um numero\n");
        int numero = sc.nextInt();
        sc.nextLine();

        taboada(numero);

        do {
            exibirMenu();
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("\nDigite uma frase");
                    String a = sc.nextLine();
                    System.out.println(a);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                    break;
                default:
                    System.out.println("\nDigite uma opcao valida");
                    break;
            }
        }while(op!=0);
    }
}
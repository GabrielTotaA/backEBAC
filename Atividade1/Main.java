import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo! Digite seu nome!");
        String nome = sc.nextLine();

        System.out.println("Digite seu CPF");
        String CPF = sc.nextLine();

        System.out.println("Digite sua idade");
        Integer idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu peso");
        Float peso = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite seu altura");
        Float altura = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite seu estado civil");
        String estadoCivil = sc.nextLine();

        System.out.println("Bem vindo: "+nome+" | CPF: "+CPF+" | Idade: "+idade+" | Peso: "+peso+" | Altura: "+altura+" | Estado Civil: "+estadoCivil);
    }
}
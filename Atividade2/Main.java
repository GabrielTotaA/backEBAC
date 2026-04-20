import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo! Digite dois numeros!");
        int n = sc.nextInt();
        int n2 = sc.nextInt();

        if(n == n2){
            System.out.println(n+" é igual a "+n2);
        } else if (n > n2) {
            System.out.println(n+" é maior que "+n2);
        }
        else{
            System.out.println(n2+" é maior que "+n);
        }
    }
}
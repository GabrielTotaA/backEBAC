package Atividade7;
import Atividade7.models.Carro;
import java.util.Scanner;

public class Main {

    public static int lerNumero(Scanner sc, String mensagem) {
        while(true) {
            try {
                System.out.println(mensagem);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
    }

    public static void main(String[] args) {
        int qtdCarros = 0;
        int precoTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo! Digite a quantidade de carros que quer criar! (limite de 50)");
        int qtd = Integer.parseInt(sc.nextLine());
        if (qtd < 1 || qtd > 50) {
            System.out.println("Quantidade inválida. Por favor, digite um número entre 1 e 50.");
            return;
        }
        Carro[] carros = new Carro[qtd];

        for(int i = 0; i < qtd; i++) {
            System.out.println("Digite o modelo do carro:");
            String modelo = sc.nextLine();
            System.out.println("Digite a montadora do carro:");
            String montadora = sc.nextLine();

            int ano = lerNumero(sc, "Digite o ano do carro:");
            int valor = lerNumero(sc, "Digite o valor do carro:");

            Carro carro = new Carro(modelo, montadora, ano, valor);
            carros[i] = carro;
            System.out.println("------------------------------");
        }
            
        for(Carro carro : carros) {
            System.out.println(carro.getNome());
            qtdCarros++;
            precoTotal += carro.getValor();
        }
        System.out.println("Quantidade de carros: " + qtdCarros);
        System.out.println("Valor total dos carros: R$" + precoTotal);
    }
}
package projetohotel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import projetohotel.models.*;

public class Main {

    public static Integer verificarInteiro(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!\n");
            }
        }
    }

    public static Double verificaDouble(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                Double n = Double.parseDouble(sc.nextLine());
                if (n > 0) {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!\n");
            }
        }
    }

    public static void main(String[] args) {
        Reserva[] reservas = new Reserva[100];
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        int op = 9999;

        while (op != 0) {
            System.out.println("""
                \nBem vindo ao sistema de Hotelagem!

                1- Nova reserva
                2- Listar reservas
                3- Buscar reserva por nome 
                4- Ordernar reservas
                0- Sair
                """);
            op = verificarInteiro(sc, "\nDigite a opção desejada");
            switch (op) {
                case 1 -> {
                    // Nova reserva
                    System.out.println("""
                        \nDigite os dados da nova reserva:
                    Nome do Hospede:
                    """);
                    String nome = sc.nextLine();
                    System.out.println("\nDigite o tipo do quarto: ");
                    String tipo = sc.nextLine();
                    int dias = verificarInteiro(sc, "\nDigite a quantidade de Dias");
                    Double valor = verificaDouble(sc, "\nDigite o valor da diaria");
                    if (cont <= 100) {
                        try {
                            reservas[cont] = new Reserva(nome, tipo, dias, valor);
                            cont++;
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro ao cadastrar reserva: " + e.getMessage());
                        }
                    }
                    System.out.println("Número maximo de reservas atingido!");
                }
                case 2 -> {
                    // Listar reservas
                    for (Reserva reserva : reservas) {
                        if (reserva != null) {
                            System.out.println(reserva);
                        }
                    }
                }
                case 3 -> {
                    System.err.println("\nDigite o nome do hospede");
                    String nome = sc.nextLine();
                    for (Reserva reserva : reservas) {
                        if (reserva != null && reserva.getNome().equals(nome)) {
                            System.out.println(reserva);
                        }
                    }
                }
                case 4 -> {
                    // Ordernar reservas
                    Reserva[] reservasOrdenadas = Arrays.copyOf(reservas, reservas.length);
                    Arrays.sort(reservasOrdenadas, 0, cont, Comparator.comparingInt(Reserva::getDias).reversed());

                    for (Reserva reserva : reservasOrdenadas) {
                        if (reserva != null) {
                            System.out.println(reserva);
                        }
                    }
                }
                case 0 -> {
                    // Sair
                    System.out.println("Encerrando programa!");
                }
                default -> {

                }
            }
        }
    }
}

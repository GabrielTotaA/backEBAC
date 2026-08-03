package atividade8;
import atividade8.alunos.*;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void pause() {
        try {
            Thread.sleep(1000); // Pausa por 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static Double cadastrarNota(Scanner sc, String mensagem){ 
        while (true) {
            try {
                System.out.println(mensagem);
                Double nota = Double.parseDouble(sc.nextLine());
                if( nota >=0 && nota <= 10){
                    return nota;
                }
                else{
                    System.out.println("A nota deve estar entre 0 e 10.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.\n");
            }
        }  
    }

    public static Integer lerInteiro(Scanner sc, String mensagem) {
    while (true) {
        try {
            System.out.println(mensagem);
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite um número inteiro válido.");
        }
    }
}

    public static void main(String[] args) {
        int op = 0;
        Alunos[] alunos = new Alunos[50]; // Array para armazenar até 50 alunos
        Scanner sc = new Scanner(System.in);
        int contador = 0; // Contador para rastrear o número de alunos cadastrados
        while(op != 3) {
             // Ler a opção do usuário
            System.out.println("""
                \nBem vindo! Digite a opção desejada:
                1 - Cadastrar aluno
                2 - Exibir notas
                3 - Sair
                    """);
            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.\n");
                continue; // Volta para o início do loop para ler a opção novamente
            }
            switch (op) {
                case 1 -> {
                    System.out.println("Digite o nome do aluno:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o curso do aluno:");
                    String curso = sc.nextLine();
                    int idade = lerInteiro(sc, "Digite a idade do aluno:");
                    double nota1 = cadastrarNota(sc, "Digite a primeira nota do Aluno");
                    double nota2 = cadastrarNota(sc, "Digite a segunda nota do Aluno");
                    double nota3 = cadastrarNota(sc, "Digite a terceira nota do Aluno");
                    
                    Alunos aluno = new Alunos(nome, curso, idade);
                    aluno.setNotas(new double[]{nota1, nota2, nota3});
                    alunos[contador] = aluno;
                    contador++;

                    System.out.println("Aluno cadastrado com sucesso!");
                    pause();
                }
                case 2 -> {
                    // Lógica para exibir notas
                    for (int i = 0; i < contador; i++) {
                        System.out.println("\nAluno: " + alunos[i].getNome());
                        System.out.println("Curso: " + alunos[i].getCurso());
                        System.out.println("Idade: " + alunos[i].getIdade());
                        System.out.println("Notas: " + Arrays.toString(alunos[i].getNotas()));
                        System.out.printf("Média: %.2f%n", alunos[i].calcularMedia());
                        System.out.println("-----------------------------");
                    }
                    pause();
                }
                case 3 -> {
                    System.out.println("Saindo...");
                    pause();
                }
                default -> {
                    System.out.println("Opção inválida!");
                    pause();
                    throw new AssertionError();
                }
            }
        }
    }
}

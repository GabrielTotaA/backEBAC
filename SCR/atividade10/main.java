package atividade10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Integer> memo = new HashMap<>();

    public static int calcularDegraus(int degraus) {
        if (degraus == 1 || degraus == 2) {
            return degraus;
        }

        if (memo.containsKey(degraus)) {
            System.out.println("Encontrado na memoria");;
            return memo.get(degraus);
        }

        int n = calcularDegraus(degraus - 1) + calcularDegraus(degraus - 2);
        memo.put(degraus, n);
        return n;
    }

    public static void main(String[] args) {
        int op = 100;
        while (op != 0) {
            System.out.println("Digite o numero de Degraus");
            int degraus = Integer.parseInt(sc.nextLine());
            System.out.println(calcularDegraus(degraus));
        }
    }
}

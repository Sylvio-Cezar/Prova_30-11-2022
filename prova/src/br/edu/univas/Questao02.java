package br.edu.univas;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nInsira um número entre 50 e 100 para imprimir o somatório total de 1 até o valor inserido.\nDigite: ");
        long max = scan.nextLong();

        if (max >= 50 && max <= 100) {
            System.out.println("\nSomatório = " + getTotal(max));
        } else {
            System.out.println("\nO número digitado deve estar entre 50 e 100!");
        }
    }

    public static long getTotal(long max) {
        if (max == 1) {
            return 1;
        }

        return max + getTotal(max - 1);
    }
}

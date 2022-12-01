package br.edu.univas;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nInsira um número entre 50 e 100 para imprimir os pares ou ímpares até chegar nele.");
        System.out.println("OBS: Os valores imprimidos serão pares quando o número inserido for par e ímpares caso contrário.");
        System.out.print("Digite: ");
        int number = scan.nextInt();

        if (number >= 50 && number <= 100) {
            System.out.println(printValues(number));
        } else {
            System.out.println("\nO número digitado deve estar entre 50 e 100!");
        }

    }

    public static int printValues(int number) {
        // tirei o 0 da impressão porque no exemplo não mostrava 0
        if (number > 2) {
            System.out.println(printValues(number - 2));
        }

        return number;
    }
}

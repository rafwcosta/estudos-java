package Revisoes.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/* Programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D */
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        System.out.print("D: ");
        int d = sc.nextInt();

        int diferenca = (a * b) - (c * d);
        System.out.println("Diferença: " + diferenca);

        sc.close();
    }
}
package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

/* Programa para ler um número inteiro e dizer se este número é par ou ímpar */
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }

        sc.close();
    }
}
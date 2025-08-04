package Revisoes.Estrutura_Repetitiva.Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de valores a serem repetidos: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i=0; i<n; i++) {
            System.out.print("Digite o valor de X: ");
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}

/* A estrutura For é para se fazer uma repetição baseada em uma contagem. */
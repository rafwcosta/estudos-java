package Revisoes.Estrutura_Repetitiva.For;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor de 1 a 100: ");
        int valor = sc.nextInt();

        if (valor < 1 || valor > 1000) {
            System.out.println("Intervalo inválido.");
        } else {
            for (int i=1; i<=valor; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
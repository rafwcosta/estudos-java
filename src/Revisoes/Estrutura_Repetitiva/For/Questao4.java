package Revisoes.Estrutura_Repetitiva.For;

import java.util.Locale;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível.");
            } else {
                double resultado = (double) x / y;
                System.out.printf("%.1f%n", resultado);
            }
        }

        sc.close();
    }
}
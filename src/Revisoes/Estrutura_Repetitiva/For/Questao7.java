package Revisoes.Estrutura_Repetitiva.For;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
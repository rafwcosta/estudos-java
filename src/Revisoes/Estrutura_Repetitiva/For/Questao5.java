package Revisoes.Estrutura_Repetitiva.For;

import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        int fatorial = 1;
        for (int i=1; i<=n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
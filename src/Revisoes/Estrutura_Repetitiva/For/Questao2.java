package Revisoes.Estrutura_Repetitiva.For;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de valores a serem lidos: ");
        int n = sc.nextInt();

        int in = 0, out = 0;
        for (int i=0; i<n; i++) {
            System.out.print("Digite o valor de X: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println(in + " in");
		System.out.println(out + " out");

        sc.close();
    }
}
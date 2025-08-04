package Revisoes.Estrutura_Repetitiva.Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Para finalizar o cálculo, digite '0'");
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            System.out.print("Digite o valor de X: ");
            x = sc.nextInt();
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
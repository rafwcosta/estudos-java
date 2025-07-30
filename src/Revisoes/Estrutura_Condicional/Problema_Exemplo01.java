package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Problema_Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Minutos: ");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", conta);

        sc.close();
    }
}

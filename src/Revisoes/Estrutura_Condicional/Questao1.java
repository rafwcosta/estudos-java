package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Positivo.");
        }

        sc.close();
    }
}
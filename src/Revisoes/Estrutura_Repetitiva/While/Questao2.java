package Revisoes.Estrutura_Repetitiva.While;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valo de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valo de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y >  0) {
                System.out.println("1° quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("2° quadrante");
            }
            else if (x < 0 && y < 0) {
                System.out.println("3° quadrante");
            } else {
                System.out.println("4° quadrante");
            }

            System.out.print("Digite o valo de X: ");
            x = sc.nextInt();
            System.out.print("Digite o valo de Y: ");
            y = sc.nextInt();
        }

        System.out.println("Nulo!");

        sc.close();
    }
}
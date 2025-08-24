package Revisoes.Estrutura_Repetitiva.While;

import java.util.Locale;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        System.out.print("Tipo de combustível: ");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            } else {
                diesel += 1;
            }

            System.out.print("Tipo de combustível: ");
            tipo = sc.nextInt();
        }

        System.out.println("Fim!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
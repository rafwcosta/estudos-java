package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;


public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Valor de 0 a 100: ");
        double x = sc.nextDouble();

        if (x < 0 || x > 100) {
            System.out.println("Valor inválido.");
        } else if (x > 0 && x < 25) {
            System.out.println("[0,25]");
        } else if (x > 25 && x < 50) {
            System.out.println("[25,50]");
        } else if (x > 50 && x < 75) {
            System.out.println("[50,75]");
        } else {
            System.out.println("[75,100]");
        }

        sc.close();
    }
}
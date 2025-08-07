package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Código do item: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double total = 0;
        if (codigo < 1 || codigo > 5) {
            System.out.println("Código inválido.");
        } else if (codigo == 1) {
            total = quantidade * 4.0;           
        } else if (codigo == 2) {
            total = quantidade * 4.5;           
        } else if (codigo == 3) {
            total = quantidade * 5.0;           
        } else if (codigo == 4) {
            total = quantidade * 2.0;           
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
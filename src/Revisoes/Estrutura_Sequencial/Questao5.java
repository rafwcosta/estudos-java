package Revisoes.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Código da peça 1: ");
        int codigoPecaUm = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidadePecasUm = sc.nextInt();
        System.out.print("Valor de cada peça: ");
        double valorPecaUm = sc.nextDouble();
        System.out.print("Código da peça 2: ");
        int codigoPecaDois = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidadePecasDois = sc.nextInt();
        System.out.print("Valor de cada peça: ");
        double valorPecaDois = sc.nextDouble();

        double total = (quantidadePecasUm * valorPecaUm) + (quantidadePecasDois * valorPecaDois);

        System.out.printf("Total a ser pago: R$ %.2f%n", total);

        sc.close();
    }
}
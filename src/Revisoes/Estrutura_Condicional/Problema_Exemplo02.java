package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Problema_Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor de 1 a 7: ");
        int valor = sc.nextInt();

        String dia;
        switch (valor) {
            case 1:
                dia = "Domingo.";
                break;
            case 2:
                dia = "Segunda.";
                break;
            case 3:
                dia = "Terça.";
                break;
            case 4:
                dia = "Quarta.";
                break;
            case 5:
                dia = "Quinta.";
                break;
            case 6:
                dia = "Sexta.";
                break;
            case 7:
                dia = "Sábado.";
                break;
            default:
                dia = "Inválido";
                break;
        }

        System.out.println(dia);

        sc.close();
    }
}
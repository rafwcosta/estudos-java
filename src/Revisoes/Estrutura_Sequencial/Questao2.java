package Revisoes.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/* Programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais */
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor do raio: ");
        int raio = sc.nextInt();
        double area = 3.14159 * (raio * raio);
        System.out.printf("Área do círculo: %.4f%n", area);

        sc.close();
    }
}
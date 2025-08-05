package Revisoes.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/* Programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa */
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
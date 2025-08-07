package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente */
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("São Múltiplos.");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
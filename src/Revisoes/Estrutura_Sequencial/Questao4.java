package Revisoes.Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/* Programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais */
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entradas
        System.out.print("N° do funcionário: ");
        int numeroDoFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas (mensal): ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.print("Valor que recebe por hora: ");
        double valorQueRecebePorHora = sc.nextDouble();

        // Cálculo
        double salario = horasTrabalhadas * valorQueRecebePorHora;

        // Saídas
        System.out.println("N°: " + numeroDoFuncionario);
        System.out.printf("Salário do funcionário: R$ %.2f%n", salario);

        sc.close();
    }
}
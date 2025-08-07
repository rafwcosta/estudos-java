package Revisoes.Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Hora inicial: ");
        double horaInicial = sc.nextDouble();
        System.out.print("Hora final: ");
        double horaFinal = sc.nextDouble();

        double duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("Duração: " + duracao + " hora(s).");

        sc.close();
    }
}
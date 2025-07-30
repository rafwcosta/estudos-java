package Revisoes.Estrutura_Condicional;

import java.util.Locale;

public class Expressao_Condicional_Ternaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
    }
}

/*
 → (condição) ? se_for_verdadeiro : se_for_falso
*/
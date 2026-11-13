package br.com.unisenai.Vetores;

import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        //Exercício 5: Pesquisa de satisfação
        //10 clientes deram nota de 0 a 10. Mostre quantas vezes cada nota
        //apareceu e a mais votada.
        Scanner sc = new Scanner(System.in);

        int[] nota = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] quantidade = new int[11];
        for (int i = 0; i < 10; i++) {
            System.out.println("Qual a sua nota para o atendimento: ");
            int notas = sc.nextInt();
            if (notas > 10 || notas < 0) {
                System.out.println("Nota inválida");
            } else {
                quantidade[notas] += 1;
            for (i = 0; i < quantidade.length; i++) {
                    System.out.println("Nota " + i + ": " + quantidade[i] + " votos");
                }


            }
        }
    }
}









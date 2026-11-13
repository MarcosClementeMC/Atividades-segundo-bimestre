package br.com.unisenai.Vetores;

public class Exercicio02 {
    // Exercício 2: Estoque crítico
    //Leia o estoque de 10 produtos. Mostre quantos têm menos de 5
    //unidades e suas posições
    static void main() {
        String[] produtos = {"mouses", "teclados", "monitores", "mousepads",
                "processadores", "memória RAM", "gabinetes","impressoras", "fontes", "placa mãe"};
        int[] estoque = {598, 678, 3, 700, 1043, 5032, 487, 4, 760, 1};
        int menos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(estoque[i] + " " + produtos[i] + " disponíveis no estoque\n");
            if (estoque[i] < 5) {
                menos++;
                System.out.println("Produto: "+ produtos[i] + "\nEstoque: " + estoque[i] + "\nPosição: " + (i +1));
            }
        }
            System.out.println(menos + " produtos com menos de 5 unidades no estoque");


            }


        }












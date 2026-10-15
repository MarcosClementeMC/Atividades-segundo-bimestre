package br.com.vetores;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exercício 3: Consulta de preço
        //Um vetor guarda os códigos e outro os preços, na mesma ordem.
        //Leia um código e mostre o preço ou "Produto não cadastrado".
        int[] codigo = new int[] {55, 43, 36, 24, 34, 23, 13, 41, 42, 60};
        double[] preco = new double[] {108.90, 123.90, 156.90, 99.90, 59.90, 109.90, 299.90, 399.90, 999.90, 599.90};
        System.out.println("Digite o codigo do produto:");
        int codigoDigitado = sc.nextInt();
        boolean erro = true;
        for (int i = 0; i < codigo.length; i++) {
            if (codigoDigitado == codigo[i]) {
                System.out.println("O preço é: " + preco[i]);
                erro = false;
            }
        }
        if (erro) {
            System.out.println("Produto não encontrado");
        }




            }
        }






package br.com.unisenai.Vetores;

public class Exercicio04 {
    static void main() {
        //Exercício 4: Reajuste com teto
        //Aplique 10% de reajuste aos salários de 8 funcionários, com limite
        //de R$ 5.000,00. Mostre os salários antes e depois e o aumento
        //total da folha.

        double[] salario = {3000, 2500, 3400, 1900, 4000, 3200, 2900, 4600};
        String[] funcionario = {"Joao", "Marcio", "Pedro", "Mario", "Fabricio", "Rafael", "José","Evergistro"};
        double aumentoTotal = 0;
        for (int i = 0; i < 8; i++) {
            double ajuste = (salario[i] * 1.10);
            double teto = 5000;
            System.out.println("10% de reajuste aplicado ao funcionario: " + funcionario[i]);
            System.out.printf("Salário atual sem reajuste: R$" + "%.2f%n", salario[i]);
            if (ajuste < teto) {
                System.out.printf("Novo valor do salário com reajuste: R$" + "%.2f%n", ajuste);
                System.out.println(" ");
                aumentoTotal += (ajuste - salario[i]);
            } else {
                System.out.println("Novo valor do salário com teto de reajuste: R$" + teto);
                aumentoTotal += 5000 - salario[i];
                System.out.println(" ");
            }
        }
            System.out.printf("Aumento total da folha de pagamento: R$" + "%.2f%n", aumentoTotal);




        }
    }


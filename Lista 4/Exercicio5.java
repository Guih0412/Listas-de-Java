/*
-- Exercício 5 --
- Leia um vetor de 8 posições e troque os 4 primeiros valores pelos 4 últimos e vice e versa. Escreva ao final o vetor obtido.
*/

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de Vaetor
        int n = 8;
        int vetor[] = new int[n];
        int i;

        // Entrada de Dados
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor: ", (i + 1));
            vetor[i] = ler.nextInt();
        }

        // Saída do vetor
        System.out.print("\nVetor: ");
        for (i = 4; i < 8; i++) {
            System.out.print(vetor[i] + " ");
        }
        for (i = 0; i < 4; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}

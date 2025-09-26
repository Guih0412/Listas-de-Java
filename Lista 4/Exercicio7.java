/* 
-- Exercício 7 --
- Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em C que imprima todos os elementos comuns aos dois vetores.
 */

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de Vetor A
        int nA = 5;
        int vetorA[] = new int[nA];
        int a;

        // Entrada de Dados do Vetor A
        System.out.println("-- Vetor A --");
        for (a = 0; a < nA; a++) {
            System.out.printf("Informe o %dº valor: ", (a + 1));
            vetorA[a] = ler.nextInt();
        }

        // Saída do Vetor A
        System.out.print("\nVetor A: ");
        for (a = 0; a < nA; a++) {
            System.out.print(vetorA[a] + " ");
        }

        // Criação de Vetor B
        int nB = 8;
        int vetorB[] = new int[nB];
        int b;

        // Entrada de Dados do Vetor B
        System.out.println("\n\n-- Vetor B --");
        for (b = 0; b < nB; b++) {
            System.out.printf("Informe o %dº valor: ", (b + 1));
            vetorB[b] = ler.nextInt();
        }

        // Saída do Vetor B
        System.out.print("\nVetor B: ");
        for (b = 0; b < nB; b++) {
            System.out.print(vetorB[b] + " ");
        }

        // Saída de números comuns entre vetores
        System.out.print("\nNúmeros comuns entre Vetor A e Vetor B: ");
        for (a = 0; a < nA; a++) {
            for (b = 0; b < nB; b++) {
                if (vetorA[a] == vetorB[b]) {
                    System.out.print(vetorA[a] + " ");
                    break; // evita imprimir o mesmo número mais de uma vez
                }
            }
        }

    }
}

/* 
-- Exercício 8 --
- Suponha um vetor N com 10 elementos e outro vetor M com 10 elementos. Faça um programa em C que calcule o produto escalar P de A por B.
- P =A[1]*B[1] + A[2]*B[2] + ... A[N]+B[N]).
 */

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de Vetor A
        int nA = 10;
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
        int nB = 10;
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

        // Saída do Produto Escalar P
        int P = 0;
        System.out.println("\nProduto Escalar P: ");
        for (int i = 0; i < nA; i++) {
            P += vetorA[i] * vetorB[i];
        }
        System.out.println(P);
    }
}

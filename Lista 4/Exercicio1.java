/* 
-- Exercício 1 --
- Leia 10 números (vetor inteiros) a partir de valores digitados pelo usuário. 
- Imprima na tela os 10 números.
 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de vetor
        int n = 5; // Tamanho do Vetor
        int vetor[] = new int[n]; // Declaração do Vetor
        int i; // Índice ou Posição

        // Entrada de Dados com números
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor: ", (i + 1));
            vetor[i] = ler.nextInt();
        }

        // Saída do vetor
        System.out.print("\nVetor: ");
        for (i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

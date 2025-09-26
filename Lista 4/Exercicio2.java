/* 
-- Exercício 2 --
- Leia 10 números (vetor inteiros) a partir de valores digitados pelo usuário.
- Imprima na tela apenas os valores maiores e igual a 20.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de vetor
        int n = 10;
        int vetor[] = new int[n];
        int i;

        // Entrada de Dados
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor: ", (i + 1));
            vetor[i] = ler.nextInt();
        }

        // Saída do vetor com números maiores que 20
        System.out.print("\nVetor: ");
        for (i = 0; i < n; i++) {
            if (vetor[i] >= 20) {
                System.out.print(vetor[i] + " ");
            }

        }
    }
}

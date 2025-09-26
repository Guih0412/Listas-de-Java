/*
-- Exercício 3 --
- Leia 10 números a partir de valores digitados pelo usuário, e armazene apenas os números pares em posições consecutivas no vetor.
- Imprima na tela a quantidade de valores armazenados no vetor, o maior valor e a média desses valores. 
*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de vetor
        int n = 10; 
        int vetor[] = new int[n]; 
        int i; 
        int pares = 0; // Quantidade inicial de pares
        int soma = 0; // Soma inicial

        // Entrada de Dados e Armazenamento de Pares
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor: ", (i + 1));
            int valorPar = ler.nextInt();

            if (valorPar % 2 == 0) {
                vetor[pares] = valorPar;
                soma += valorPar;
                pares++;
            }
        }

        // Saída do vetor
        System.out.println("\nVetor: ");
        for (i = 0; i < pares; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Saída da Quantidade de pares
        System.out.println("\nQuantidade de pares: " + pares);

        // Saída da Média 
        float media = soma / pares;
        System.out.println("\nMédia entre números pares: " + media);

        // Saída do Maior par
        int maior = 0;
        for (i = 0; i < pares; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }
        System.out.println("\nMaior número: " + maior);
    }

}

/* 
-- Exercício 6 --
- Inicialize um vetor de 10 posições e em seguida leia um valor X qualquer.
- Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado. 
 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Criação de Vaetor
        int n = 10;
        int vetor[] = new int[n];
        int i;

        // Entrada de Dados
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor: ", (i + 1));
            vetor[i] = ler.nextInt();
        }

        // Saída dos números
        System.out.print("\nVetor: ");
        for (i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Busca do número pelo usuário
        System.out.print("\n\nDigite o número que deseja buscar ");
        int numeroBuscado = ler.nextInt();
        int posicao = -1;

        for (i = 0; i < n; i++) {
            if (vetor[i] == numeroBuscado) {
                posicao = i;
                break;
            }
        }

        // Saída da posição do número
        if (posicao != -1) {
            System.out.printf("\nNúmero %d encontrado na posição [%d]", numeroBuscado, posicao);
        } else {
            System.out.printf("\nNúmero %d não encontrado no vetor", numeroBuscado);
        }
    }
}

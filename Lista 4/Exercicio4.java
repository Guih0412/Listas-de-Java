/*
-- Exercício 4 --
- Dada uma sequência de n números, imprimi-la na ordem inversa a da leitura. 
*/ 

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de dados da quantidade de números
        System.out.print("Informe a quantidade de números: ");
        int n = ler.nextInt(); 
        System.out.print("\n");

        // Criação de vetor
        int vetor[] = new int[n]; 
        int i; 

        // Entrada de Dados
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor: ", (i + 1));
            vetor[i] = ler.nextInt();
        }

        // Saída do vetor invertido
        System.out.print("\nVetor inverso: ");
        for (i = n - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}

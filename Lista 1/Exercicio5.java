// Fazer um programa que imprime na tela o somatório dos números entre 0 e 10.

public class Exercicio5 {

    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        while (i <= 10) {
            soma = soma + i;
            i = i + 1;
        }
        System.out.printf("A soma é de %d.\n", soma);
    }
}

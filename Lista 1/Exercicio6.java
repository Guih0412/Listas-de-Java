// Fazer um programa que imprime na tela a média dos números ímpares que estão no intervalo entre 0 e 100.

public class Exercicio6 {

    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        while (i <= 100) {
                soma = soma + i;
                i = i + 2;
        }
        int media = soma / 50;
        System.out.printf("Há %d numeros impares e a soma é %d, então a média será %d.\n", 50, soma, media);

        System.out.printf("Média: "+ media);
    }

}

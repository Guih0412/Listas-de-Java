// Fazer um programa que imprime os números pares que existem no intervalo entre 1 e 15.

public class Exercicio4 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 15) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}

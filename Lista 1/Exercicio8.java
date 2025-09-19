// Fazer um programa que exibe uma janela de diálogo para o usuário entrar com um número inteiro e após isso o programa imprime na tela a mensagem dizendo que o número é par ou ímpar.

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(entrada);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par!");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar!");
        }

    }
}

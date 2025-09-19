// Fazer um programa que exibe uma janela de diálogo para o usuário entrar com um nome e após isso o programa imprime este nome na tela de saída, mas somente se o usuário fornecer um nome. 

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é seu nome?");
        if (nome != null && !nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Bom dia " + nome + "!");
        } else {
            String novoNome = JOptionPane.showInputDialog("Digite novamente!");
        }
    }
}

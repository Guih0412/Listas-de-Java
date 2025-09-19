
public class Teste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123456, "Guilherme Henrique Cassula", 'M', "123456", "123456");

        System.out.println("RA: " + aluno1.getRa());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Sexo: " + aluno1.getSexo());
        System.out.println("RG: " + aluno1.getRg());
        System.out.println("CPF: " + aluno1.getCpf());
    }
}

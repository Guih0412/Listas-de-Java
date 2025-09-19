
public class Teste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1234567890, "Guilherme Henrique Cassula", 'M', "12.345.678-9", "123.456.789-10", new Data(04, 12, 2005));

        System.out.println("RA: " + aluno1.getRa());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Sexo: " + aluno1.getSexo());
        System.out.println("RG: " + aluno1.getRg());
        System.out.println("CPF: " + aluno1.getCpf());
        System.out.println("Data de Nascimento: " + aluno1.getDataNasc().formatarData());

    }
}

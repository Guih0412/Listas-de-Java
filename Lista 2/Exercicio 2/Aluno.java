
public class Aluno {

    // Atributos Private
    private long ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;

    // Constructor
    public Aluno(long ra, String nome, char sexo, String rg, String cpf) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
    }

    // Metódos Getters
    public long getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos Setters
    public void setRa(long ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}

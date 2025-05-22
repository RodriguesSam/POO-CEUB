import java.util.Date;

public class Pessoa {
    private String nomePessoa;
    private String emailPessoa;
    private int matriculaPessoa;
    private int cpfPessoa;
    private Date dataNascimento;

    public Pessoa(String nomePessoa, String emailPessoa, int matriculaPessoa, int cpfPessoa, Date dataNascimento) {
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.dataNascimento = dataNascimento;
        this.emailPessoa = emailPessoa;
        this.matriculaPessoa = matriculaPessoa;
    }

}

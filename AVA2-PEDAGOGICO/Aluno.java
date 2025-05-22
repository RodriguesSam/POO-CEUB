import java.util.Date;

public class Aluno extends Pessoa {

    private String turma;

     public Aluno(String nomePessoa, String emailPessoa, int matriculaPessoa, int cpfPessoa, Date dataNascimento, String turma)  {
        super(nomePessoa, emailPessoa, matriculaPessoa, cpfPessoa, dataNascimento);
        this.turma = turma;

    }

    public void manterAluno(){ }
}

import java.util.Date;

    private GrauFormacao grauFormacao;

    public class Professor extends Pessoa {
        public Professor(String nomePessoa, String emailPessoa, int matriculaPessoa, int cpfPessoa, Date dataNascimento, GrauFormacao grauFormacao) {
            super(nomePessoa, emailPessoa, matriculaPessoa, cpfPessoa, dataNascimento);
            this.grauFormacao = grauFormacao;
        }

        public void cadastrarAluno(Aluno aluno) { }
        public void gerenciarAtividade(Atividade atividade) { }
}

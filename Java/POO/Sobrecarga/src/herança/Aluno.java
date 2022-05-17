package herança;

public class Aluno extends Pessoa {

    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String rg, String cpf, int registroAluno, float notaVestibular, String curso, String dataMatricula) {
        super();

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.registroAluno = registroAluno;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }
    
    @Override
    public String retornaDados() {
        String dados;

        dados = super.retornaDados();

        dados += "RA: " + registroAluno + "\n";
        dados += "Nota do vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        dados += "Data de matricula: " + dataMatricula + "\n";

        return dados;
    }
}

package herança;

public class Aluno extends Pessoa {

    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;
    
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

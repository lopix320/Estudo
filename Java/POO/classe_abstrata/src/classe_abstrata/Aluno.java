package classe_abstrata;

class Aluno extends Pessoa {
    
    String registroAluno;
    String dataMatricula;
    float notaVestibular;
    String curso;
    
    public Aluno(){
        
    }

    @Override
    public String retornaDados() {
        String dados = "";
        
        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        dados += "RA do aluno: " + registroAluno + "\n";
        dados += "Data de matricula: " + dataMatricula + "\n";
        dados += "Nota do vestibular: " + notaVestibular + "\n";
        dados += "Curso do aluno: " + curso + "\n";
        
        return dados;
    }
    
}

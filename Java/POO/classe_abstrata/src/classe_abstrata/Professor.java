package classe_abstrata;

public class Professor extends Pessoa {
    
    String matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    public Professor(){
    }
    
    @Override
    public String retornaDados() {
        String dados = "";
        
        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        dados += "Matricula do professor: " + matriculaProfessor + "\n";
        dados += "Data de admissao: " + dataAdmissao + "\n";
        dados += "Salario por hora: " + salarioHorista + "\n";
        
        
        return dados;
    }
    
}

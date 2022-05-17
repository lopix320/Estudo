
package herança;


public class Professor extends Pessoa{
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    
    public String retornaDadosProfessor(){
       String dados;

       dados = super.retornaDados();

       dados += "Matricula do professor: " + matriculaProfessor + "\n";
       dados += "Data de admissao: " + dataAdmissao + "\n";
       dados += "Salario por hora: " + salarioHorista + "\n";
   


       return dados;
    }
}

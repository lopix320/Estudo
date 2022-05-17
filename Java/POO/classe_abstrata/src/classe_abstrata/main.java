
package classe_abstrata;

public class main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        
        a1.nome = "Petrucio das Oliveiras";
        a1.rg = "36.456.785-X";
        a1.cpf = "456.123.789-89";
        a1.registroAluno = "3516544";
        a1.dataMatricula = "25/02/2019";
        a1.notaVestibular = 10;
        a1.curso = "Bacharelado de sistemas de informação";
        
        p1.nome = "Roberto Carlos";
        p1.rg = "45.212.484-X";
        p1.cpf = "879.176.156-46";
        p1.matriculaProfessor = "9634653";
        p1.dataAdmissao = "30/03/2015";
        p1.salarioHorista = 60;
        
        System.out.println("\t - Dados do Aluno: " + a1.nome + " -\n");
        System.out.println(a1.retornaDados());
        System.out.println("\t - Dados do Professor: " + p1.nome + " -\n");
        System.out.println(p1.retornaDados());
    }
    
}

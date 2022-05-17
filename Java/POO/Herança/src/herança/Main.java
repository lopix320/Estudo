package herança;


public class Main {

    public static void main(String[] args) {
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();
        
        a1.nome = "Gabriel Lopes";
        a1.cpf = "1231312313131";
        a1.rg = "6545646465464";
        a1.registroAluno = 545644564;
        a1.notaVestibular = 10;
        a1.curso = "Bacharelado de sistemas de informacao";
        a1.dataMatricula = "02/02/21";
        
        p1.nome = "Jailson Mendes";
        p1.rg = "545465465645";
        p1.cpf = "5546654654";
        p1.dataAdmissao = "03/01/99";
        p1.matriculaProfessor = 564564;
        p1.salarioHorista = 50.33;
        
        System.out.println("\t - Dados do Aluno RA n°: " + a1.registroAluno + " -\n");
        System.out.println(a1.retornaDadosAluno() + "\nDados do professor:\n\n" + p1.retornaDadosProfessor());
    }
    
}

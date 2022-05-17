package herança;


public class Main {

    public static void main(String[] args) {
        Professor p1 = new Professor("Jailson Mendes", "545465465645", "5546654654", 564564, "03/01/99", 50.33);
        Aluno a1 = new Aluno("Gabriel Lopes", "1231312313131", "6545646465464", 545644564, 10, "Bacharelado de sistemas de informacao", "02/02/21");
        
        
        System.out.println("\t - Dados do Aluno RA n°: " + a1.registroAluno + " -\n");
        System.out.println(a1.retornaDados());
        System.out.println("\t - Dados do Professor Matricula n°: " + p1.matriculaProfessor + " -\n");
        System.out.println(p1.retornaDados());
    }
    
}

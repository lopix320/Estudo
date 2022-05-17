
package exemplo_interface;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nomeAux;
        double salarioAux;
        int diaAux;
        
        System.out.println("Informe o nome do funcionario mensalista: ");
        nomeAux = leitor.nextLine();
        System.out.println("Entre com salario bruto do mensalista: ");
        salarioAux = leitor.nextDouble();
        
        FuncionarioMensalista fm1 = new FuncionarioMensalista(nomeAux, salarioAux);
        
        leitor.nextLine();
        
        System.out.println("Informe o nome do funcionario diarista: ");
        nomeAux = leitor.nextLine();
        System.out.println("Entre com salario bruto do diarista: ");
        salarioAux = leitor.nextDouble();
        System.out.println("Quantos dias ele trabalhou? ");
        diaAux = leitor.nextInt();
        
        FuncionarioDiarista fd1 = new FuncionarioDiarista(nomeAux, salarioAux, diaAux);
        
        System.out.println("\n\t\t - Dados e salario do funcionario Mensalista - ");
        System.out.println("\tNome..: " + fm1.getNome());
        System.out.println("\tSalario Bruto.: " + fm1.calcularSalarioLiquido());
        
        System.out.println("\n\t\t - Dados e salario do funcionario Diarista - ");
        System.out.println("\tNome..: " + fd1.getNome());
        System.out.println("\tSalario Bruto.: " + fd1.calcularSalarioLiquido());
    }
    
}

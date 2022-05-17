package pessoa;

import salario.calcBonus;
import salario.calcDesconto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op = -1, po = -1, horas = 0, id;
        String nome = "", rg, cpf;
        double salario = 0, bonus = 0;
        char aux;
        float INSS, IRPF, VT, VA, VR, CVN;
        calcDesconto calc = new calcDesconto();
        Funcionario func = new Funcionario();
        calcBonus calc1;

        while (op != 3) {
            System.out.println("[0] - Inserir dados do funcionario\n"
                    + "[1] - Calcular salario\n"
                    + "[2] - Exibir dados e holerite\n"
                    + "[3] - Sair");
            op = leitor.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Digite o nome do funcionario:");
                    nome = leitor.next();
                    System.out.println("Digite o RG do funcionario:");
                    rg = leitor.next();
                    System.out.println("Digite o CPF do funcionario:");
                    cpf = leitor.next();
                    System.out.println("Digite o ID do funcionario:");
                    id = leitor.nextInt();
                    System.out.println("Digite o salario do funcionario:");
                    salario = leitor.nextDouble();
                    System.out.println("Digite as horas trabalhadas do funcionario:");
                    horas = leitor.nextInt();
                    System.out.println("O funcionario possui algum bonus?\nY - Sim\nN - Nao");
                    aux = leitor.next().charAt(0);
                    if (aux == 'Y' || aux == 'y') {
                        System.out.println("Digite o valor do bonus do funcionario:");
                        bonus = leitor.nextDouble();
                    }
                    

                    break;
                case 1:
                    func.setSalario(salario);
                    func.calcularHoras(horas);
                    calc.setSalario(func.getSalario());
                    calc1 = new calcBonus(calc.retornaSalario(), bonus);
                    break;
                case 2:
                    System.out.printf("Salario bruto: " + func.getSalario()
                            + "\n\t\t-" + calc.INSS() + "(INSS)"
                            + "\n\t\t-" + calc.IRPF() + "(IRPF)"
                            + "\n\t\t-" + calc.VT() + "(VT)"
                            + "\n\t\t-" + calc.VA() + "(VA)"
                            + "\n\t\t-" + calc.VR() + "(VR)"
                            + "\n\t\t-" + calc.CVN() + "(CVN)"
                            + "\nSalario liquido: %.2f\n", calc.retornaSalario());
                    break;
            }
        }
    }

}

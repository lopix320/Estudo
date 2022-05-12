package pessoa;

import salario.calcBonus;
import salario.calcDesconto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op = -1;
        while(op != 2){
            System.out.println("Ola\n");
            System.out.println("[0] - Inserir dados do funcionario\n"
                             + "[1] - Calcular salario\n"
                             + "[2] - Sair");
            op = leitor.nextInt();
        }
    }

}

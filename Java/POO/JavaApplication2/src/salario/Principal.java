package salario;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = leitor.nextDouble();
        System.out.println("Digite o valor dos descontos: ");
        double desconto = leitor.nextDouble();

        CalculoSalarial cl = new CalculoSalarial(salario, desconto);

        System.out.println("Salario bruto: " + salario + "\nSalario liquido: " + cl.Calculo());

    }

}

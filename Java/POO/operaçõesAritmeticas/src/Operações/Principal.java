package Operações;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double num1 = leitor.nextDouble();
        System.out.println("Digite o secundo numero: ");
        double num2 = leitor.nextDouble();
        
        Operação op = new Operação(num1, num2);
        
        System.out.println("Soma: " + op.Soma() + "\nSubtração: " + op.Sub() + "\nDivisão: " + op.Div() + "\nMultiplicaçao: " + op.Multi());
        
        
    }

}

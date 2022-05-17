package Ex1;

import dobro.*;
import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int x;
        int d;
        System.out.println("Informe um número: ");  
        x = tc.nextInt();
        
        System.out.println("Informe um número: ");  
        d = tc.nextInt();

        Calculo calc = new Calculo();
        
        calc.setA(x);
        calc.setB(d);
        System.out.println("A soma de " + calc.getA() + " e " + calc.getB() + " é: " + calc.Soma());
        System.out.println("A subtração de " + calc.getA() + " e " + calc.getB() + " é: " + calc.Subtracao());
        System.out.println("A divisão de " + calc.getA() + " e " + calc.getB() + " é: " + calc.Divsao());
        System.out.println("A multiplicação de " + calc.getA() + " e " + calc.getB() + " é: " + calc.Multi());

    }

}

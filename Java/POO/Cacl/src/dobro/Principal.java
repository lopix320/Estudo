package dobro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int x;

        System.out.println("Informe um número: ");  
        x = tc.nextInt();

        CalculoDobro cd = new CalculoDobro();
        
        cd.setD(x);
        
        System.out.println("O dobro de " + cd.getD() + " é: " + cd.Dobro() + "\nO triplo de " + cd.getD() + " é: " + cd.Triplo());

    }

}

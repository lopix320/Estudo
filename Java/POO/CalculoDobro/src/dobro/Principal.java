package dobro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int x;

        System.out.println("Informe um número: ");
        x = tc.nextInt();

        CalculoDobro cd = new CalculoDobro(x);

        System.out.println("O dobro do número digitado é: " + cd.Dobro());
        System.out.println("O triplo do número digitado é: " + cd.Triplo());

    }

}

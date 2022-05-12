package ado2;

import java.util.Scanner;

public class Main {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int op = -1;
        Pilha pilha = new Pilha();

        while (op != 0) {

            System.out.println("0 - Sair\n"
                    + "1 - Inserir\n"
                    + "2 - Remover\n"
                    + "3 - Tamanho\n"
                    + "4 - Topo\n"
                    + "5 - Pilha Vazia");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite numero que quer inserir:");
                    int num = leitor.nextInt();
                    pilha.inserir(num);
                    op = -1;
                    break;
                case 2:
                    pilha.remover();
                    pilha.exibir();
                    op = -1;
                    break;
                case 3:
                    pilha.tamanho();
                    op = -1;
                    break;
                case 4:
                    pilha.topo();
                    op = -1;
                    break;
                case 5:
                    pilha.pilhaVazia();
                    op = -1;
                    break;
            }
        }

    }

}

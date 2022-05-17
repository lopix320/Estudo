package Biblioteca;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro[] lista = new Livro[5];
        
        
        Livro Livro1 = new Livro(Metodo.numerandoId(), "Gabriel", "Louco", 5.40);
        Livro Livro2 = new Livro(Metodo.numerandoId(), "Lucas", "Loucos3", 6.90);
        Livro Livro3 = new Livro(Metodo.numerandoId(), "Gustavo", "Loucos2", 9.70);
        Livro Livro4 = new Livro(Metodo.numerandoId(), "Henrique", "Loucos5", 8.90);
        Livro Livro5 = new Livro(Metodo.numerandoId(), "Pedro", "Loucos4", 7.90);
        Livro Livro6 = new Livro(Metodo.numerandoId(), "Rafael", "Loucos10", 9.90);
        Livro Livro7 = new Livro(Metodo.numerandoId(), "Caio", "Loucos8", 2.45);
        Livro Livro8 = new Livro(Metodo.numerandoId(), "Barbara", "Loucos9", 6.79);
        Livro Livro9 = new Livro(Metodo.numerandoId(), "Jose", "Loucos6", 19.52);
        Livro Livro10 = new Livro(Metodo.numerandoId(), "Julia", "Loucos", 26.90);
        
        
        Metodo.inserir(Livro1);
        Metodo.inserir(Livro2);
        Metodo.inserir(Livro3);
        Metodo.inserir(Livro4);
        Metodo.inserir(Livro5);
        Metodo.inserir(Livro6);
        Metodo.inserir(Livro7);
        Metodo.inserir(Livro8);
        Metodo.inserir(Livro9);
        Metodo.inserir(Livro10);
        
        Metodo.exibir();
        
        System.out.println("Digite o titulo do livro que quer pesquisar: ");
        String titulo = leitor.nextLine();
        
        Livro livro = Metodo.pesquisaBinaria(titulo);
        if (livro != null) {
            System.out.println(livro);
        } else {
//            Metodo.exibir();
            System.out.println("Não existe!");
        }
        System.out.println("Digite o id do livro que quer remover: ");
        int id = leitor.nextInt();
        Livro livro2 = Metodo.remoçãoId(id);
        System.out.println(livro2); 
    }
}

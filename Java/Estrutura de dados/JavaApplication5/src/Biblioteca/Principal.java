package Biblioteca;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Livro livro1 = new Livro(Metodo.numerandoId(), "Gabriel", "Louco", 5.40);
        Livro livro2 = new Livro(Metodo.numerandoId(), "Lucas", "Loucos3", 6.90);
        Livro livro3 = new Livro(Metodo.numerandoId(), "Gustavo", "Loucos2", 9.70);
        Livro livro4 = new Livro(Metodo.numerandoId(), "Henrique", "Loucos5", 8.90);
        Livro livro5 = new Livro(Metodo.numerandoId(), "Pedro", "Loucos4", 7.90);
        Livro livro6 = new Livro(Metodo.numerandoId(), "Rafael", "Loucos10", 9.90);
        Livro livro7 = new Livro(Metodo.numerandoId(), "Caio", "Loucos8", 2.45);
        Livro livro8 = new Livro(Metodo.numerandoId(), "Barbara", "Loucos9", 6.79);
        Livro livro9 = new Livro(Metodo.numerandoId(), "Jose", "Loucos6", 19.52);
        Livro livro10 = new Livro(Metodo.numerandoId(), "Julia", "Loucos", 26.90);
        
        
        Metodo.inserir(livro1);
        Metodo.inserir(livro2);
        Metodo.inserir(livro3);
        Metodo.inserir(livro4);
        Metodo.inserir(livro5);
        Metodo.inserir(livro6);
        Metodo.inserir(livro7);
        Metodo.inserir(livro8);
        Metodo.inserir(livro9);
        Metodo.inserir(livro10);
        
        Metodo.exibir();
        
        System.out.println("Digite o titulo do livro que quer pesquisar: ");
        String titulo = leitor.nextLine();
        
        Livro livro = Metodo.pesquisaBinaria(titulo);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Não existe!");
        }
        
        System.out.println("Digite o id do livro que quer remover: ");
        int id = leitor.nextInt();
        Livro livr = Metodo.remocaoId(id);
        System.out.println(livr); 

    }

}

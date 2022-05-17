package Biblioteca;

import java.util.Scanner;

public class Metodo {

    private static Livro[] lista = new Livro[15];
    private static Scanner leitor = new Scanner(System.in);
    private static int indice = 0;
    private static int i = 0;
    private static int n = 0;

    public static int numerandoId() {
        int id = i++;
        return id;
    }

    public static boolean inserir(Livro livro) {
        if (indice == lista.length) {
            lista = arrayRedimensionado();
            
        }
        if (indice < lista.length) {
            lista[indice] = livro;
            indice++;
            
            return true;
        }
        return false;
    }

    public static Livro[] arrayRedimensionado() {
        Livro[] newList = new Livro[indice + 20];
        for (int k = 0; k < indice; k++) {
            newList[k] = lista[k];
        }
        return newList;
    }

    public static void mergeSort(int inicio, int tamanho, Livro[] v) {
        if (inicio < tamanho) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
            
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, Livro[] v) {
        exibir();
        int i, j, k;
        Livro[] auxiliar = new Livro[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;
        while (i < meio && j < tamanho) {
            if (v[i].getTitulo().compareTo(v[j].getTitulo()) < 0) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }
        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }
        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
        
    }

    public static Livro pesquisaBinaria(String titulo) {
        mergeSort(0, n, lista);
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (titulo.equalsIgnoreCase(lista[meio].getTitulo())) {
                return lista[meio];
            } else if (titulo.compareToIgnoreCase(lista[meio].getTitulo()) > 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }

    public static void exibir() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(lista[i]);
            }
        }
    }

    public static void removerLivro(Livro livro) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == livro) {
                for (int j = i; j < lista.length; j++) {
                    if (j != lista.length - 1) {
                        lista[j] = lista[j + 1];
                    } else {
                        lista[lista.length - 1] = null;
                    }
                }
                exibir();
                System.out.println("Livro removido:");
            }
        }
    }

    public static Livro remoçãoId(int id) {
//        mergeSort(0, n, lista);
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == lista[meio].getId()) {  
                
                Livro livro = lista[meio];
                removerLivro(lista[meio]);
                
                return livro;
                
            } else if ((id == lista[meio].getId()) == true) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }
}

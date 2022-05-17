package Biblioteca;

public class Metodo {

    private static Livro[] lista = new Livro[10];
    private static int n = 0;
    private static int i = 0;
    private static int p = 0;

    public static int numerandoId() {
        int id = i++;
        return id;
    }

    public static boolean inserir(Livro livro) {
        if (n == lista.length) {
            lista = arrayRedimensionado();

        }
        if (n < lista.length) {
            lista[n] = livro;
            n++;
            return true;
        }
        return false;
    }

    public static Livro[] arrayRedimensionado() {
        Livro[] newList = new Livro[n + 5];
        for (int k = 0; k < n; k++) {
            newList[k] = lista[k];
        }
        return newList;
    }

    public static void exibir() {
        for (int i = 0; i < n; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void mergeSort(int inicio, int tamanho, Livro[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, Livro[] v) {
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
        int inicio = 0, fim = n - 1, meio;
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

    public static Livro remocaoId(int id) {
        for (p = lista.length - 1; lista[p].id != id; p--) {
        }
        if (lista[p].id == id) {
            Livro livro = lista[p];
            removerLivro(lista[p]);
            return livro;
        }
        return null;
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
}

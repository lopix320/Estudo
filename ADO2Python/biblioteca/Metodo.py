lista = []
n = 0
indice = 0
p = 0


def numerandoId():
    global indice
    indice += 1
    return indice


def inserir(livro):
    global n
    lista.insert(n, livro)
    n += 1
    return True


def exibir():
    i = 0
    for x in lista:
        print(lista[i])
        i += 1


def remocaoId(id):
    global p
    for x in lista:
        if (lista[p].id == id):
            livro = lista[p]
            removerLivro(lista[p])
            return livro
        p += 1
    return None


def removerLivro(livro):
    ind1 = 0
    for x in lista:
        if (lista[ind1] == livro):
            lista.remove(lista[ind1])
            exibir()
            break
        ind1 += 1

# def teste():
#     lista2 = [1, 2, 3, 4, 5]
#     print(lista2[3::-1])


def mergeSort(myList):
    if len(myList) > 1:
        mid = len(myList) // 2
        left = myList[:mid]
        right = myList[mid:]

        # Recursive call on each half
        mergeSort(left)
        mergeSort(right)

        # Two iterators for traversing the two halves
        i = 0
        j = 0

        # Iterator for the main list
        k = 0

        while i < len(left) and j < len(right):
            if left[i].titulo <= right[j].titulo:
                # The value from the left half has been used
                myList[k] = left[i]
                # Move the iterator forward
                i += 1
            else:
                myList[k] = right[j]
                j += 1
            # Move to the next slot
            k += 1

        # For all the remaining values
        while i < len(left):
            myList[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            myList[k] = right[j]
            j += 1
            k += 1


def chamaMerge():

    mergeSort(lista)


# def chamaPacote():

#     print("Nome do modulo:", __name__)
#     print("Nome do pacote:", __package__)

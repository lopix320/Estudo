from biblioteca.Livro import Livro
from biblioteca import Metodo


livro1 = Livro(Metodo.numerandoId(), "Loucos1", "Lucas", 6.90)
livro2 = Livro(Metodo.numerandoId(), "Loucos2", "Pedro", 5.3)
livro3 = Livro(Metodo.numerandoId(), "Loucos3", "Gabriel", 5.3)
livro4 = Livro(Metodo.numerandoId(), "Loucos4", "Joao", 5.3)
livro5 = Livro(Metodo.numerandoId(), "Loucos5", "Henrique", 5.3)

Metodo.inserir(livro3)
Metodo.inserir(livro2)
Metodo.inserir(livro1)
Metodo.inserir(livro5)
Metodo.inserir(livro4)

Metodo.exibir()

# print("\n")

# Metodo.chamaMerge()

# Metodo.exibir()

# aux = input("\n1 - REMOVE LIVROS\n0 - STOP!\n")

# while int(aux) == 1:
#     if(int(aux) == 1):
#         id = input("Digite o id do Livro que deseja remover: \n")
#         livro = Metodo.remocaoId(int(id))
#         print(f"\nLivro removido:\n{livro}")
#         aux = input("\nQuer remover mais algum livro?\n0 - NAO | 1 - SIM\n")

# print("Obrigado!") if int(aux) == 0 else False


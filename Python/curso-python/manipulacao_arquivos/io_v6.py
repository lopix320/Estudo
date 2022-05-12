# O with garante que o arquivo sera fechado
with open('pessoas.csv') as arquivo:
    with open('pessoas.txt', mode = 'w') as saida:
        for registro in arquivo:
            pessoa = registro.strip().split(',')
            print('Nome: {}, Idade: {}'.format(*pessoa), file=saida)

if arquivo.closed:
    print('Arquivo foi fechado!')
if saida.closed:
    print('Arquivo de saida foi fechado!')
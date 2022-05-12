try:
    arquivo = open('pessoas.csv') # Usado para abrir arquivos

    for registro in arquivo:
        print('Nome: {}, Idade: {}'.format(*registro.strip().split(',')))
finally:
    print('finally')
    arquivo.close()

if arquivo.closed:
    print('Arquivo foi fechado!')
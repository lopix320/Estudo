arquivo = open('pessoas.csv') # Usado para abrir arquivos

for registro in arquivo:
    print('Nome: {}, Idade: {}'.format(*registro.strip().split(',')))
arquivo.close()
import csv
from urllib import request


def read(url):
    # Baixa o arquivo da internet atraves da url passada
    with request.urlopen(url) as entrada:
        print('Baixando arquivo CSV...')
        dados = entrada.read().decode('latin1')
        print('Download completo!')
        for cidade in csv.reader(dados.splitlines()):
            p = [cidade[3], cidade[8]]
            print('Cidade: {}, Cidade: {}'.format(*p))


if __name__ == '__main__':
    read(r'http://files.cod3r.com.br/curso-python/desafio-ibge.csv')

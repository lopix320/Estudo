import csv

with open('desafio-ibge.csv') as entrada:
    for pessoa in csv.reader(entrada):
        p = [pessoa[3], pessoa[8]]
        print('Cidade: {}, Cidade: {}'.format(*p))

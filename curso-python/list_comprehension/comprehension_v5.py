# O generator gera um valor de acordo com a expressão que você passa
dicionario = {i: i ** 2 for i in range(10) if i % 2 == 0}

for numero, dobro in dicionario.items():
    print(f'{numero} x 2 = {dobro}')
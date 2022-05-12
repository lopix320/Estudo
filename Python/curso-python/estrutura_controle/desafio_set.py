PALAVRAS_PROIBIDAS = {'futebol', 'religiao', 'politica'}
textos = [
    'João gosta de futebol e politica',
    'A praia foi divertida',
]

for texto in textos:
    intercecao = PALAVRAS_PROIBIDAS.intersection(set(texto.lower().split()))
    if intercecao:
        print('Palavras secretas encontradas: ', intercecao)
    else:
        print('Texto autorizado: ', texto)
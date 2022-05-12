def faixaEtaria(idade):
    if 0 < idade <18:
        return 'Menor de idade'
    elif idade in range(18, 65):
        return 'Adulto'
    elif idade in range(64, 100):
        return 'Idoso'
    elif idade >= 100:
        return 'Centenario'
    else:
        return 'Idade invalida'

if __name__ == '__main__':
    for idade in (17, 0, 35, 87, 113, -2):
        print(f'{idade}: {faixaEtaria(idade)}')
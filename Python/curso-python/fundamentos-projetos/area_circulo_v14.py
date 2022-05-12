from math import pi
import sys
import errno


def circulo(raio):
    # é preciso converter a variavel r para float, pois no input ela recebe uma string
    a = pi * (float(raio)**2)
    return a


def help():
    print(f"""\
Necessario informar o raio do circulo.
Sintaxe: {sys.argv[0]} <raio>""")


if __name__ == '__main__':
    if len(sys.argv) < 2:
        help()
        sys.exit(errno.EPERM)  # sai e mostra erro

    if not sys.argv[1].isnumeric():
        help()
        print('O raio deve ser um valor numerico')
        sys.exit(errno.EINVAL)  # sai e mostra o erro de tipo invalido

    r = sys.argv[1]
    area = circulo(r)
    print('Area do circulo', area)

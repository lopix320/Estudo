from math import pi
import sys
import errno
class TerminalColor:
    ERRO = '\033[91m'
    NORMAL = '\033[0m'
    UNDERLINE = '\033[4m'

def help():
    print(f"""\
Necessario informar o raio do circulo.
Sintaxe: {sys.argv[0]} <raio>""")


def circulo(raio):
    return pi * float(raio) ** 2


if __name__ == '__main__':
    if len(sys.argv) < 2:
        help()
        sys.exit(errno.EPERM)# sai e mostra erro

    if not sys.argv[1].isnumeric():
        help()
        print(TerminalColor.UNDERLINE, TerminalColor.ERRO, 'O raio deve ser um valor numerico', TerminalColor.NORMAL)
        sys.exit(errno.EINVAL)# sai e mostra o erro de tipo invalido

    raio = sys.argv[1]
    area = circulo(raio)
    print('Area do circulo', area)

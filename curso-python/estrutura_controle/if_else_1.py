

import sys


class TerminalColor:
    ERRO = '\033[91m'
    NORMAL = '\033[0m'


def help():
    print(f"""\
Necessario informar nota do aluno.
Sintaxe: {sys.argv[0]} <raio>""")

def notaAluno(nota):
    if nota > 10 or nota < 0:
            print(TerminalColor.ERRO, "Nota invalida", TerminalColor.NORMAL)
            sys.exit(1)
    if nota <= 10.0 and nota >= 9.1:
        print("Sua nota é A")
    elif nota <= 9.0 and nota >= 8.1:
        print("Sua nota é A-")
    elif nota <= 8.0 and nota >= 7.1:
        print("Sua nota é B")
    elif nota <= 7.0 and nota >= 6.1:
        print("Sua nota é B-")
    elif nota <= 6.0 and nota >= 5.1:
        print("Sua nota é C")
    elif nota <= 5.0 and nota >= 4.1:
        print("Sua nota é C-")
    elif nota <= 4.0 and nota >= 3.1:
        print("Sua nota é D")
    elif nota <= 3.0 and nota >= 2.1:
        print("Sua nota é D-")
    elif nota <= 2.0 and nota >= 1.1:
        print("Sua nota é E")
    elif nota <= 1.0 and nota >= 0.0:
        print("Sua nota é E-")


if __name__ == '__main__':
    if len(sys.argv) < 2:
        help()
    elif not sys.argv[1].isnumeric():
        help()
        print(TerminalColor.ERRO, "A nota deve ser valor numerico",
              TerminalColor.NORMAL)
    else:
        nota = float(sys.argv[1])
        notaAluno(nota)
        
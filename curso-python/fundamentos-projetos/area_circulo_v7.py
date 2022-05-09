from math import pi


if __name__ == '__main__':
    r = input('Informe o raio: ')
    # é preciso converter a variavel r para float, pois no input ela recebe uma string
    a = pi * (float(r)**2)
    print('Area do circulo: ', a)

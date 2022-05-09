from math import pi

def circulo(raio):
    # é preciso converter a variavel r para float, pois no input ela recebe uma string
    a = pi * (float(raio)**2)
    return a

if __name__ == '__main__':
        r = input('Informe o raio: ')
        circulo(r)
       
       
from math import pi

r = input('Informe o raio: ')
a = pi * (float(r)**2) # é preciso converter a variavel r para float, pois no input ela recebe uma string
print('Area do circulo: ', a)

print('Nome do modulo: ', __name__)
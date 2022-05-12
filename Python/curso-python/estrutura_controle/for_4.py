from random import randint

def sortearDado():
    return randint(1, 6)

for i in range(1, 7):
    if i%2 != 0:
        continue
    if i == sortearDado():
        print('ACERTOU!', i)
        break
else:
    print('Nao acertou o numero!')
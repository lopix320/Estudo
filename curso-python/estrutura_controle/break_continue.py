for x in range(1, 11):
    if x % 2 == 0:
        continue #Quebra a repetição atual e pula pra proxima
    print(x)

for x in range(1, 11):
    if x == 5:
        break #Quebra o laço de repetição e pula pra proxima linha fora do for
    print(x)

print('Fim!')
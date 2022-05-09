def fibonacci(qntd):
    resultado = [0, 1]
    for _ in range(2, qntd):
        resultado.append(sum(resultado[-2:]))         
    return resultado

if __name__ == '__main__':
    for fib in fibonacci(20):
        print(fib, end=',')
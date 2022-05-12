def fibonacci(qntd, sequencia = (0, 1)):
    return sequencia if len(sequencia) == qntd else \
    fibonacci(20, sequencia + (sum(sequencia[-2:]),))

if __name__ == '__main__':
    for fib in fibonacci(20):
        print(fib, end=',')
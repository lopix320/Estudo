def fibonacci(limite):
    start = 0
    end = 1
    print(f'{start},{end}', end=',')
    while end < limite:
        start, end = end, start + end
        print(end, end=',')

if __name__ == '__main__':
    fibonacci(10000)
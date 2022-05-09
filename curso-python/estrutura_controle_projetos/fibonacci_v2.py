def fibonacci(limite):
    start = 0
    end = 1
    print(f'{start},{end}', end=',')
    while end < limite:
        new = start + end
        print(new, end=',')
        start = end
        end = new

if __name__ == '__main__':
    fibonacci(10000)
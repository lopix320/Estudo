def fibonacci():
    i = 0
    start = 0
    end = 1
    print(f'{start},{end}', end=',')
    while i < 100:
        i += 1
        new = start + end
        print(new, end=',')
        start = end
        end = new

if __name__ == '__main__':
    fibonacci()
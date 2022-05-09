def fibonacci(start, end):

    new = start + end
    if start == 0 and end == 1:
        print(start, end, new, end=',')
        fibonacci(end, new)
    else:
        print(new, end=',')
        fibonacci(end, new)

if __name__ == '__main__':
    fibonacci(0, 1)

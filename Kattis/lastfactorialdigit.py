n = int(input())
i = 0
while i < n:
    f = int(input())
    factorial = 1
    if f == 0 or f == 1:
        print(factorial)
    else:
        j = 2
        while(j <= f):
            factorial *= j
            j += 1
        print(factorial % 10) 

    i += 1
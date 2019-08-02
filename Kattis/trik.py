input = input()
count = 1
for l in input:
    if l == 'A' and count == 1:
        count = 2
    elif l == 'A' and count == 2:
        count = 1
    elif l == 'B' and count == 2:
        count = 3
    elif l == 'B' and count == 3:
        count = 2
    elif l == 'C' and count == 1:
        count = 3
    elif l == 'C' and count == 3:
        count = 1
    else :
        pass

print(count)

n = int(input())
res = 0
i = 0
while i < n:
    a = input().split(" ")
    res += float(a[0]) * float(a[1])
    i += 1
print(res)
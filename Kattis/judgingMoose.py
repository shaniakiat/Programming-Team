l, r = input().split()
l, r = [int(l), int(r)]

if l == 0 and r == 0:
    print ("Not a moose")
elif l == r:
    print ("Even ",max(l,r)*2)
else :
    print ("Odd ",max(l,r)*2)

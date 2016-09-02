def rf():
    n = int(input("Enter a number : "))
    a = 0
    while(n > 0):
        af = n%10
        n = int(n/10)
        a = a*10+af
    print(a)
if __name__ == '__main__':
    rf()

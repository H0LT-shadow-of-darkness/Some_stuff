
def stampa_rettangoli():
    A = int(input("Altezza \n"))
    B = int(input("base \n"))
    alt = [A]
    bas = [B]
    j = 0
    for i in bas:
        print("*"*i)

    if B == 1:
        while j < A:
            print("*")
            j = j+1

    if B == 2:
        while j < A:
            print("**")
            j = j+1

    if B == 3:
        while j < A:
            print("* *")
            j = j+1

    while j < A:
        print("*"," "*(B-4), "*")
        j = j+1
    
    for i in bas:
        print("*"*i)
 
pi = True
while pi == True: 
    stampa_rettangoli()
    po = input("continuare: y or n \n")
    if po == "n":
        print("aRRIVEDERCI")
        pi = False
    
    



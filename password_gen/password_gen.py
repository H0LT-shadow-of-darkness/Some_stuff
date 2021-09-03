import random
conv = True
def password_gen():
    caratteri = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUvWXYZ0123456789!?/-%$"
    lung = int(input("Scegli la lunghezza: \n"))
    password = ""
    for i in range(lung):
        password = password + random.choice(caratteri)
    print("la tua nuova password è ", password)

while conv == True:
    password_gen()
    A = input("Vuoi continuare? y or n \n")
    if A == "n":
        conv = False
print("Grazie per aver utilizzato il password generator")
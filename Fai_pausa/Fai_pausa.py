#inizializzazione degli importi
import time
import tkinter as tk
import os
import subprocess, signal
#creazione e modifica  della finestra
prog = True
window = tk.Tk()
window.geometry("600x600")
window.title("AVVERTENZA")
window.resizable(False,False)
window.configure(background="black")
labelExample = tk.Label(window, text="Fai una pausa", fg="red", font=("Helvetica", 50))
window.attributes("-topmost", True)

#funzione che andrà a creare la finestra dopo un tempo prestabilito
if __name__ == "__main__":
    print("The program is working")
    time.sleep(900)
    print("sono passati 15 minuti")
    time.sleep(900)
    print("sono passati 30 minuti")
    time.sleep(600)
    print("sono passati 40 minuti")
    window.lift()
    labelExample.pack()
    window.mainloop()
    




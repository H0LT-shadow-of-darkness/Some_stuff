#imports
import pygame
import time
from datetime import datetime
import tkinter as tk

#declarations
window = tk.Tk()
labelExample = tk.Label(window, text="TI DEVI SVEGLIARE COGLIONE", fg="red", font=("Helvetica", 30))
W = input("A che ora vuoi svegliarti?")
W = W.split(":")
W[0] = int(W[0])
W[1] = int(W[1])
pg = True
A = datetime.now().strftime('%H %M')
A = A.split()
minuti = A[1]
ore = A[0]
ore = int(ore)
minuti = int(minuti)
print(ore)
print(minuti)
file = 'Svegliati_coglione\sample-3s.mp3'

#function
def pmusic(file):
    pygame.init()
    pygame.mixer.init()
    clock = pygame.time.Clock()
    pygame.mixer.music.load(file)
    pygame.mixer.music.play()
    while pygame.mixer.music.get_busy():
        print("SVEGLIATI COGLIONE")
        clock.tick(1000)

def finestra():
    global window, labelExample
    window.geometry("600x600")
    window.title("AVVERTENZA")
    window.resizable(False,False)
    window.configure(background="black")
    window.attributes("-topmost", True)

def sveglia(x,y):
    global minuti, ore, pg
    while pg == True:
        time.sleep(60)
        minuti = minuti + 1
        if minuti == 60:
            minuti = 0
            ore = ore + 1
        if ore == 24:
            ore = 0
        if ore == x and minuti == y:
            pmusic(file) 
            finestra()
            window.lift()
            labelExample.pack()
            window.mainloop()
            pg = False

#program start
sveglia(W[0],W[1])

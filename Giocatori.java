package Carte;
public class Giocatori{
    private int numero;
    private int gettoni;
    private int carta;
    private int seme;


    Giocatori(int gettoni, int numero){
        this.gettoni=gettoni;
        this.numero=numero;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }
    public void setSeme(int seme) {
        this.seme = seme;
    }
    public void setGettoni(int gettoni) {
        this.gettoni = gettoni;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCarta() {
        return this.carta;
    }
    public int getGettoni() {
        return this.gettoni;
    }
    public int getSeme() {
        return this.seme;
    }
    public int getNumero() {
        return this.numero;
    }

    public void addGettoni(int gettoni){
        this.gettoni+=gettoni;
    }
    public void subGettoni(int gettoni){
        this.gettoni-=gettoni;
    }


}
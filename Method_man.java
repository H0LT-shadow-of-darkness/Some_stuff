package Carte;
import java.util.*;
public class Method_man {
    static Scanner tast = new Scanner(System.in);
    public static void stampa_regole(int gioco){
        if(gioco==1)
            System.out.println(" Il banco distribuisce una carta a tutti i giocatori che hanno puntato e a se stesso. \n Vince il giocatore con la carta più alta (carte da 1 a 13) e ritira tutto il piatto,\n Se il banco ha la carta più alta si prende il piatto. \n Se due giocatori hanno carta uguale vince il banco.");


    }
    
    public static void shuffle(int[][] mazzo){
        int random1, random2, temp1, temp2;
        for(int i=0;i<1000;i++){
            random1= (int)(Math.random()*51);
            random2= (int)(Math.random()*51);

            temp1=mazzo[0][random1];
            temp2=mazzo[1][random1];

            mazzo[0][random1]=mazzo[0][random2];
            mazzo[1][random1]=mazzo[1][random2];

            mazzo[0][random2]=temp1;
            mazzo[1][random2]=temp2;
        }
    }
    
    public static void ordina_mazzo(int[][] mazzo){
        int i=1, j=1, t=1;
        for(int riga=0; riga<2; riga++){
            for(int colonna=0; colonna<52; colonna++){
                if(riga==0){
                    mazzo[riga][colonna]=i;
                    i++;
                    if(i==14)
                        i=1;
                }else if(riga==1){
                    mazzo[riga][colonna]=j;
                    t++;
                    if(t==14){
                        t=1;
                        j++;
                    }  
                }
            }
        }
    }

    public static void carta_alta(int[][] mazzo, int giocatori, int gettoni){
        Method_man.shuffle(mazzo);
        int scorri_carte_banco=0, player=giocatori, gettoniMax=0, count =0, vincitore=0, cartaMax=0, piatto=0, gettoz=0;
        Giocatori banco = new Giocatori(gettoni,6);
        Giocatori giocatore1 = new Giocatori(gettoni,1);
        Giocatori giocatore2 = new Giocatori(gettoni,2);
        Giocatori giocatore3 = new Giocatori(gettoni,3);
        Giocatori giocatore4 = new Giocatori(gettoni,4);
        Giocatori giocatore5 = new Giocatori(gettoni,5);
        boolean verifica=true;
        int[] arraygettoni = new int[6];
        int[] arraycarte = new int[5];
        boolean[] arrayverifiche= new boolean[5];
        for(int h=0;h<5;h++){
            if(h<giocatori)
                arrayverifiche[h]=true;
            else
                arrayverifiche[h]=false;
        }
       

        System.out.println("Iniziamo!");
    
        System.out.println("Distribuendo una carta a testa...");
        while(scorri_carte_banco+giocatori<=52&&player>1){
            while(verifica==true){
                if(arrayverifiche[0]==true){
                    System.out.println("Giocatore 1 quanti gettoni vuoi puntare?");
                    gettoz=tast.nextInt();
                    if(gettoz>giocatore1.getGettoni()){
                        System.out.println("Giocatore 1 non hai abbastanza gettoni, riprova");
                    }else {
                        giocatore1.subGettoni(gettoz);
                        piatto=piatto+gettoz;
                        verifica=false;
                    }
                }else
                    verifica=false;
            }
            verifica=true;
            while(verifica==true){
                if(arrayverifiche[1]==true){
                    System.out.println("Giocatore 2 quanti gettoni vuoi puntare?");
                    gettoz=tast.nextInt();
                    if(gettoz>giocatore2.getGettoni()){
                        System.out.println("Giocatore 2 non hai abbastanza gettoni, riprova");
                    }else {
                        giocatore2.subGettoni(gettoz);
                        piatto=piatto+gettoz;
                        verifica=false;
                    }
                }else
                    verifica=false;
            }
            verifica=true;
            while(verifica==true&&giocatori>=3){
                if(arrayverifiche[2]==true){
                    System.out.println("Giocatore 3 quanti gettoni vuoi puntare?");
                    gettoz=tast.nextInt();
                    if(gettoz>giocatore3.getGettoni()){
                        System.out.println("Giocatore 3 non hai abbastanza gettoni, riprova");
                    }else {
                        giocatore3.subGettoni(gettoz);
                        piatto=piatto+gettoz;
                        verifica=false;
                    }
                }else
                    verifica=false;
            }
            verifica=true;
            while(verifica==true&&giocatori>=4){
                if(arrayverifiche[3]==true){
                    System.out.println("Giocatore 4 quanti gettoni vuoi puntare?");
                    gettoz=tast.nextInt();
                    if(gettoz>giocatore4.getGettoni()){
                        System.out.println("Giocatore 4 non hai abbastanza gettoni, riprova");
                    }else {
                        giocatore4.subGettoni(gettoz);
                        piatto=piatto+gettoz;
                        verifica=false;
                    }
                }else
                    verifica=false;
            }
            verifica=true;
            while(verifica==true&&giocatori>=5){
                if(arrayverifiche[4]==true){
                    System.out.println("Giocatore 5 quanti gettoni vuoi puntare?");
                    gettoz=tast.nextInt();
                    if(gettoz>giocatore5.getGettoni()){
                        System.out.println("Giocatore 5 non hai abbastanza gettoni, riprova");
                    }else {
                        giocatore5.subGettoni(gettoz);
                        piatto=piatto+gettoz;
                        verifica=false;
                    }
                }else
                    verifica=false;
            }

            verifica=true;

            switch(giocatori){
                case 1:
                    if(arrayverifiche[0]==true){
                    giocatore1.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore1.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;  
                    }else{
                        giocatore1.setCarta(0);
                        giocatore1.setSeme(0);
                    }
                    break;
                case 2:
                    if(arrayverifiche[1]==true){
                    giocatore2.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore2.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore1.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore1.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    }else{
                        giocatore2.setCarta(0);
                        giocatore2.setSeme(0);
                    }
                    break;
                case 3:
                    if(arrayverifiche[2]==true){
                    giocatore3.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore3.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore2.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore2.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;                     
                    giocatore1.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore1.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    }else{
                        giocatore3.setCarta(0);
                        giocatore3.setSeme(0);
                    }
                    break;
                case 4:
                    if(arrayverifiche[3]==true){
                    giocatore4.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore4.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore3.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore3.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore2.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore2.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore1.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore1.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    }else{
                        giocatore4.setCarta(0);
                        giocatore4.setSeme(0);
                    }
                    break;
                case 5: 
                    if(arrayverifiche[4]==true){
                    giocatore5.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore5.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore4.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore4.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore3.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore3.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore2.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore2.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    giocatore1.setCarta(mazzo[0][scorri_carte_banco]);
                    giocatore1.setSeme(mazzo[1][scorri_carte_banco]);
                    scorri_carte_banco++;
                    }else{
                        giocatore5.setCarta(0);
                        giocatore5.setSeme(0);
                    }
                    break;
                }

            System.out.println("Carte distribuite ai rispettivi giocatori:");
            System.out.println("G   carta   seme    gettoni");
            if(arrayverifiche[0]=true){
                System.out.println("1   "+giocatore1.getCarta()+"       "+giocatore1.getSeme()+"        "+giocatore1.getGettoni());
            }if(arrayverifiche[1]=true){
                System.out.println("2   "+giocatore2.getCarta()+"       "+giocatore2.getSeme()+"        "+giocatore2.getGettoni());
            }if(giocatori>=3&&arrayverifiche[2]==true){
                System.out.println("3   "+giocatore3.getCarta()+"       "+giocatore3.getSeme()+"        "+giocatore3.getGettoni());
            }if(giocatori>=4&&arrayverifiche[3]==true){
                System.out.println("4   "+giocatore4.getCarta()+"       "+giocatore4.getSeme()+"        "+giocatore4.getGettoni());
            }if(giocatori>=5&&arrayverifiche[4]==true){
                System.out.println("5   "+giocatore5.getCarta()+"       "+giocatore5.getSeme()+"        "+giocatore5.getGettoni());
            }System.out.println("B                   "+banco.getGettoni());

                
        
            arraycarte[0]=giocatore1.getCarta();
            arraycarte[1]=giocatore2.getCarta();
            arraycarte[2]=giocatore3.getCarta();
            arraycarte[3]=giocatore4.getCarta();
            arraycarte[4]=giocatore5.getCarta();

            for(int cartatore=0;cartatore<giocatori;cartatore++){
                if(arraycarte[cartatore]>cartaMax){
                    cartaMax=arraycarte[cartatore];
                    vincitore=cartatore+1;
                }
            }
            for(int cartatore=0;cartatore<giocatori;cartatore++){
                if(arraycarte[cartatore]==cartaMax){
                	count++;
                }
            }
            
            if(count>=2)
                vincitore=0;

            switch(vincitore){
                case 1:
                    giocatore1.addGettoni(piatto);
                    System.out.println("COMPLIMENTI! giocatore 1 si prende il piatto.. succulento");
                    System.out.println("Gettoni giocatore 1: "+ giocatore1.getGettoni());
                    break;
                case 2:
                    giocatore2.addGettoni(piatto);
                    System.out.println("COMPLIMENTI! giocatore 2 si prende il piatto.. succulento");
                    System.out.println("Gettoni giocatore 2: "+ giocatore2.getGettoni());
                    break;
                case 3:
                    giocatore3.addGettoni(piatto);
                    System.out.println("COMPLIMENTI! giocatore 3 si prende il piatto.. succulento");
                    System.out.println("Gettoni giocatore 3: "+ giocatore3.getGettoni());
                    break;
                case 4:
                    giocatore4.addGettoni(piatto);
                    System.out.println("COMPLIMENTI! giocatore 4 si prende il piatto.. succulento");
                    System.out.println("Gettoni giocatore 4: "+ giocatore4.getGettoni());
                    break;
                case 5: 
                    giocatore5.addGettoni(piatto);
                    System.out.println("COMPLIMENTI! giocatore 5 si prende il piatto.. succulento");
                    System.out.println("Gettoni giocatore 5: "+ giocatore5.getGettoni());
                    break;
                case 0:
                    banco.addGettoni(piatto);
                    break;

            }
            count=0;
            cartaMax=0;
            piatto=0;
            vincitore=0;
            verifica=true;
            if(giocatore1.getGettoni()<=0){
                System.out.println("Giocatore 1 eliminato");
                arrayverifiche[0]=false;
                player--;
            }if(giocatore2.getGettoni()<=0){
                System.out.println("Giocatore 2 eliminato");
                arrayverifiche[1]=false;
                player--;
            }if(giocatore3.getGettoni()<=0){
                System.out.println("Giocatore 3 eliminato");
                arrayverifiche[2]=false;
                player--;
            }if(giocatore4.getGettoni()<=0){
                System.out.println("Giocatore 4 eliminato");
                arrayverifiche[3]=false;
                player--;
            }if(giocatore5.getGettoni()<=0){
                System.out.println("Giocatore 5 eliminato");
                arrayverifiche[4]=false;
                player--;
            }
        }
        System.out.println("FINE!");

            arraygettoni[0]=giocatore1.getGettoni();
            arraygettoni[1]=giocatore2.getGettoni();
            arraygettoni[2]=giocatore3.getGettoni();
            arraygettoni[3]=giocatore4.getGettoni();
            arraygettoni[4]=giocatore5.getGettoni();
            arraygettoni[5]=banco.getGettoni();

            for(int gettonatore=0;gettonatore<giocatori+1;gettonatore++){
                if(arraygettoni[gettonatore]>gettoniMax){
                    gettoniMax=arraygettoni[gettonatore];
                    vincitore=gettonatore;
                }
            }
            System.out.println("Il vincitore è il giocatore n° "+(vincitore+1));;
        }
            
}



import Carte.Method_man;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner tast = new Scanner(System.in);
        int[][] mazzo = new int[2][52];
        Method_man.ordina_mazzo(mazzo);
        Method_man.shuffle(mazzo);

        /*for(int righe=0;righe<2;righe++){
            for(int colonne=0;colonne<52;colonne++){
                System.out.print(mazzo[righe][colonne]+"    ");
            }
            System.out.println("\n");

        }*/
        
        boolean verifica = true;
        int gioco=0, giocatori=0, gettoni=0;
        String input, risposta;
        Method_man.ordina_mazzo(mazzo);

        while(verifica==true){
            System.out.println("A che gioco vuoi giocare? (numero:r per le regole)");
            System.out.println("1) carta_alta");
            input=tast.next();
            if(input.length()==3){
                Method_man.stampa_regole(1);
                System.out.println("");
                System.out.println("Vuoi giocare? y or n");
                risposta=tast.next();
                if(risposta.equalsIgnoreCase("y"))
                    verifica=false;
            }else{
                gioco=Integer.parseInt(input);
                verifica=false;
            }
        }
        verifica=true;
        switch(gioco){
            case 1:
                while(verifica==true){
                    System.out.println("Quanti giocatori? (max 5, min 2)");
                    giocatori=tast.nextInt();
                    if(giocatori>=2&&giocatori<=5){
                        verifica=false;
                    }else{
                        if(giocatori>5)
                            System.out.println("Troppi giocatori");
                        else
                            System.out.println("Almeno 2 giocatori");
        
                    }
                }
                verifica=true;
                while(verifica==true){
                    System.out.println("Quanti gettoni? (min 10, max 100)");
                    gettoni=tast.nextInt();
                    if(gettoni>=10&&gettoni<=100){
                        verifica=false;
                    }else{
                        if(giocatori>100)
                            System.out.println("Troppi gettoni");
                        else
                            System.out.println("Almeno 10 gettoni");
        
                    }
                }
                Method_man.carta_alta(mazzo, giocatori, gettoni);
                break;
            case 2:
                break;
        }
    }
}

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int ora_inizio, ora_fine,  min_inizio, min_fine;
        int ora_finale, min_finale;
        String orario_inizio, orario_fine;
        Scanner tast = new Scanner(System.in);


        System.out.println("inserisci orario di inizio (00:00)");
        orario_inizio = tast.next();
        //System.out.println("inserisci minuti di inizio");
        //min_inizio = tast.nextInt();
        System.out.println("inserisci orario di fine (00:00)");
        orario_fine = tast.next();
        //System.out.println("inserisci ora di fine");
        //min_fine = tast.nextInt();
        ora_inizio=(10*((int)orario_inizio.charAt(0)))+((int)orario_inizio.charAt(1));
        ora_fine=(10*((int)orario_fine.charAt(0)))+((int)orario_fine.charAt(1));
        min_inizio=(10*((int)orario_inizio.charAt(3)))+((int)orario_inizio.charAt(4));
        min_fine=10*((int)orario_fine.charAt(3))+((int)orario_fine.charAt(4));






        min_finale=min_fine-min_inizio;
        ora_finale=ora_fine-ora_inizio;
        if(min_finale<0){
            ora_finale--;
            min_finale=60+min_finale;
        }

        System.out.println("sono passate:"+ora_finale+" ore e "+min_finale+" minuti");



        

    }
}

package sudoku;
import java.util.Scanner;
public class Gioca{

	public static void main(String[] args) {
		Sudoku sud= new Sudoku();
		Scanner s = new Scanner(System.in);
		
		sud.gioca();
		sud.stampa();
		System.out.println("Questo è il sudoku proposto, vuoi giocare? (y o n)");
		String risp = s.next();
		if(risp.equalsIgnoreCase("n")){
			System.exit(0);
		}
		while(true) {
			System.out.println("Inserisci il valore che vuoi inserire (1-9)");
			int val = s.nextInt();
			if(val<=0||val>=10) {
				System.exit(0);
			}
			System.out.println("Inserisci la riga in cui vuoi inserire il valore(1-9)");
			int rga = s.nextInt();
			if(rga<=0||rga>=10) {
				System.exit(0);
			}
			System.out.println("Inserisci la colonna in cui vuoi inserire il valore(1-9)");
			int cln = s.nextInt();
			if(cln<=0||cln>=10) {
				System.exit(0);
			}
			sud.aggiungiMossa(rga, cln, val); //righe e colonne partono da 1
			System.out.println("Vuoi correggere? (y o n)");
			risp = s.next();
			if(risp.equalsIgnoreCase("y")){
				break;	
			}

		}
		

		/* soluzione
		sud.aggiungiMossa(1, 1, 1); //righe e colonne partono da 1
		sud.aggiungiMossa(1, 2, 9);
		sud.aggiungiMossa(1, 3, 4);
		sud.aggiungiMossa(1, 4, 5);
		sud.aggiungiMossa(1, 6, 3);
		sud.aggiungiMossa(1, 8, 2);
		sud.aggiungiMossa(1, 9, 7);
		
		sud.aggiungiMossa(2, 2, 5); 
		sud.aggiungiMossa(2, 2, 2);
		sud.aggiungiMossa(2, 4, 9);
		sud.aggiungiMossa(2, 8, 3);
		sud.aggiungiMossa(2, 9, 6);

		sud.aggiungiMossa(3, 2, 6);
		sud.aggiungiMossa(3, 5, 8);
		sud.aggiungiMossa(3, 8, 4);
		sud.aggiungiMossa(3, 9, 5);
		
		sud.aggiungiMossa(4, 1, 3);
		sud.aggiungiMossa(4, 4, 7);
		sud.aggiungiMossa(4, 5, 5);
		sud.aggiungiMossa(4, 7, 6);
		sud.aggiungiMossa(4, 8, 9);

		sud.aggiungiMossa(5, 4, 4);
		sud.aggiungiMossa(5, 5, 2);
		sud.aggiungiMossa(5, 6, 6);
		sud.aggiungiMossa(5, 9, 8);
		
		sud.aggiungiMossa(6, 2, 8);
		sud.aggiungiMossa(6, 3, 6);
		sud.aggiungiMossa(6, 5, 1);
		sud.aggiungiMossa(6, 6, 9);
		sud.aggiungiMossa(6, 8, 7);
		
		sud.aggiungiMossa(7, 1, 8);
		sud.aggiungiMossa(7, 4, 6);
		sud.aggiungiMossa(7, 7, 2);
		sud.aggiungiMossa(7, 8, 5);
		
		sud.aggiungiMossa(8, 4, 1);
		sud.aggiungiMossa(8, 5, 9);
		sud.aggiungiMossa(8, 6, 2);
		sud.aggiungiMossa(8, 7, 7);
		sud.aggiungiMossa(8, 9, 3);
		
		sud.aggiungiMossa(9, 1, 2);
		sud.aggiungiMossa(9, 2, 7);
		sud.aggiungiMossa(9, 3, 9);
		sud.aggiungiMossa(9, 4, 8);
		sud.aggiungiMossa(9, 5, 3);
		sud.aggiungiMossa(9, 6, 5);
		sud.aggiungiMossa(9, 7, 4);
		*/
		if(sud.correttore()==true) {
			System.out.println("Corretto");
		}
	}

}

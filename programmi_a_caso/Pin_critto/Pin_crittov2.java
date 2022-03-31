package es;
import java.util.Scanner;
public class compz {

	public static void main(String[] args) {
		String PIN_critto ="", PIN_inserito, PIN_critto1 ="";
		String PIN = "12345";
		Scanner tast = new Scanner(System.in);
		
		int[] array = new int[10];
		for(int i=0; i<array.length;i++) {
			array[i] = (int)(Math.random()*3)+1;
		}
		System.out.println("PIN:	0 1 2 3 4 5 6 7 8 9");
		System.out.print("NUM:	");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Inserisci il pin con crittografia");
		PIN_inserito = tast.next();
		for(int i=0;i<5;i++) {
			for(int j=0;j<array.length;j++) {
				PIN_critto=PIN_critto+String.valueOf(array[j]);
			}
		}
		for(int i=0;i<6;i++) {
			if(i==0) {
				continue;
			}
			PIN_critto1=PIN_critto1+PIN_critto.charAt(i);
		}
		if(PIN_inserito.equals(PIN_critto1)) {
			System.out.println("IL PIN INSERITO PUò ESSERE CORRETTO");
		}else {
			System.out.println("IL PIN INSERITO NON PUò ESSERE CORRETTO");

		}
	
	}
}

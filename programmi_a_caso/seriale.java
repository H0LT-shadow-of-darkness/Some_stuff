import java.util.Scanner;
public class seriale {

	public static void main(String[] args) {
		int[] array=new int[10];
		Scanner tast=new Scanner(System.in);
		System.out.println("Inserisci seriale di 15 numeri");
		String seriale = tast.next();
		int numero;
		int conteggio=0;
		if(seriale.length()!=15) {
			System.out.println("seriale non di 15 caratteri");
			return;
		}
		
		for(int n=0;n<=9;n++) {
			for(int i=0;i<15;i++) {
				numero=seriale.charAt(i)-'0';
				if(numero==n) {
					conteggio++;
				}
			}
			array[n]=conteggio;
			conteggio=0;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println("Nel tuo seriale ci sono "+array[i]+" numeri "+i);

		}
	}

}

package jlibbreria;
import java.util.Scanner;
public class array_telef {

	public static void main(String[] args) {
		Scanner tast = new Scanner(System.in);
		int[] array = new int[10];
		String n_tel;
		int cont=0;
		int num;
		System.out.println("Inserisci numero di telefono");
		n_tel = tast.next();
		
		for(int n=0;n<9;n++) {
			for(int t=0;t<10;t++) {
				num=n_tel.charAt(t)-'0';
				if(num==n) {
					cont++;
				}
			}
			array[n]=cont;
			cont=0;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println("Nel tuo numero di telefono ci sono: "+array[i]+" "+i);
		}
	}

}

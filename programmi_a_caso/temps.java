import java.util.Scanner;
public class temps {

	public static void main(String[] args) {
		double[] array = new double[10];
		Scanner tast = new Scanner(System.in);
		double conto=0;
		double media=0;
		int giorni_s_m=0;
		for(int i=0;i<array.length;i++) {
			System.out.println("Insrisci temperatura");
			array[i]=tast.nextDouble();
			conto=conto+array[i];
		}
		media=conto/10;
		System.out.println("Media: "+media);

		for(int i=0;i<array.length;i++) {
			if(array[i]<media) {
				System.out.println("Nel giorno "+i+" la temperatura � sotto la media con "+array[i]+" gradi");
				giorni_s_m++;
			}
		}
		System.out.println("Ci sono: "+giorni_s_m+" giorni sotto la media");

			

	}

}

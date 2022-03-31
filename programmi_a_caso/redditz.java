import java.util.Scanner;

public class redditz {

	public static void main(String[] args) {
		Scanner tast = new Scanner(System.in);
		System.out.println("Insrisci k");
		int k = tast.nextInt();
		double[] array= new double[k];
		double max=0;
		double perc;
		int cont=0;
		for(int i=0;i<array.length;i++) {
			System.out.println("Insrisci reddito famiglia");
			array[i]= tast.nextDouble();
			if(array[i]>max) {
				max=array[i];
			}
		}
		perc=(max*20)/100;
		for(int i=0;i<array.length;i++) {
			if(array[i]>=(max-perc)&&array[i]!=max) {
				System.out.println("la famiglia "+i+" ha un reddito di "+array[i]+" perci� � inferiore fino al 20 perc");
				cont++;
			}
				
		}
		System.out.println("Le famiglie con reddito inferiore fino al 20 perc sono "+cont);

		
	}

}

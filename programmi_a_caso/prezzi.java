import java.util.Scanner;
public class prezzi {

	public static void main(String[] args) {
		Scanner tast = new Scanner(System.in);
		double[] prezzi= {70, 50, 90,  70.50,  3.50};
		String[] nomi= {"felpe", "zaini", "jeans", "camicie", "mutande"};
		int quant;
		String nome;
		double prezzo=0;
		double total;
		System.out.println("inserisci nome prodotto");
		nome = tast.next();
		System.out.println("inserisci quantit� prodotto");
		quant = tast.nextInt();
		
		for(int i=0;i<nomi.length;i++) {
			if(nomi[i].equals(nome)) {
				prezzo=prezzi[i];
			}
		}
		total=prezzo*quant;
		System.out.println("Per acquistare "+ quant+" "+nome+" dovrai pagare "+total);


	}

}

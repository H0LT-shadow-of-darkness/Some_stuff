package jcalcolatrice;
import java.util.Scanner;

public class jcalcolatrice {

	public static void main(String[] args) {
		
		System.out.println("Benvenuto nella calcolatrice java");
		Scanner tastiera = new Scanner(System.in);
		 
		 String ad = "+";
		 String st = "-";
		 String mt = "*";
		 String dv = "/";
		 boolean cond = true;
		 
		 while(cond == true) {
			 
			    System.out.println("Digita un'operazione(+,-,*,/)");
			    String op = tastiera.next();
			    
			    System.out.println("Inserisci il primo numero, premi invio e inserisci il secondo");
			    int n1 = tastiera.nextInt();
				int n2 = tastiera.nextInt();
			    
			    if(op.equals(ad)) {
					System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
				}
			    
				if(op.equals(st)) {
					System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
				}
				
				if(op.equals(mt)) {
					System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
				}
				
				if(op.equals(dv)) {
					
					if(n2 == 0) {
						System.out.println("Non si può dividere un numero per zero, riprova");
						cond = false;
					}
					
					System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
				}
				System.out.println("Vuoi eseguire un'alra operazione? (y or n)");
				String risp = tastiera.next();
				if(risp.equals("n")) {
					cond = false;
				}
		 
				
		 }
		 
		 System.out.println("Arrivederci!");
		
	}

}
package jlibbreria;
import java.util.Scanner;
public class XCircolare {

	public static void main(String[] args) {
		int n_positivi, risposta, risultato, risultato2;
		boolean vaccino;
		String risposta2, giorni = "giorni", mesi = "mesi";
		Scanner tast = new Scanner(System.in);
		
		
		System.out.println("Inserisci numero positivi");
		 n_positivi = tast.nextInt();
		System.out.println("vaccinato? (2 dosi)(true or false)");
		 vaccino = tast.nextBoolean();
		 if(n_positivi>=2) {
			 if(vaccino==true) {
				 System.out.println("quanto tempo fa?");
				 risposta = tast.nextInt();
				 risposta2 = tast.next();
				 risultato = risposta2.compareTo(giorni);
				 risultato2 = risposta2.compareTo(mesi);
				 if(risultato2==0 && risposta>4) {
					 System.out.println("non potrai proseguire in didattica in presenza, ma DDI, rientrerai a scuola dopo almeno 5 giorni con tampone negativo");
				 }else if(risultato==0 && (risposta>120 || risposta<14)){
					 System.out.println("non potrai proseguire in didattica in presenza, ma DDI, rientrerai a scuola dopo almeno 5 giorni con tampone negativo");
				 }else {
					 System.out.println("prosegui pure didattica in presenza con mascherina ffp2");
				 }
			 }else {
				 System.out.println("non potrai proseguire in didattica in presenza, ma DDI, rientrerai a scuola dopo almeno 5 giorni con tampone negativo");
			 }
		 }else {
			 System.out.println("didattica in presenza ma con mascherine ffp2");
		 }
	}
}
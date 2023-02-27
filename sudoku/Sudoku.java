package sudoku;

import java.util.Arrays;

public class Sudoku {
	public int[][]scacchiera=new int[9][9];
	private boolean[][]verifica=new boolean[9][9];
	private boolean giocoIniziato;
	public final int[] numeri = {1,2,3,4,5,6,7,8,9};
	public int[] mieiNumeri = new int[9];
	private int temp1=0;
	private int tempT=0;
	int iter=0;

	public Sudoku() {
		giocoIniziato=false;
		for(int rga=0;rga<9;rga++) {
			for(int cln=0;cln<9;cln++) {
				scacchiera[rga][cln]=0;
			}
		}
		for(int rga=0;rga<9;rga++) {
			for(int cln=0;cln<9;cln++) {
				verifica[rga][cln]=true;
			}
		}
		for(int t=0;t<9;t++) {
			mieiNumeri[t]=0;
		}
	}
	
	public void gioca() {
		aggiungiVerifica(0, 4, 6);
		aggiungiVerifica(0, 6, 8);
		
		aggiungiVerifica(1, 0, 5);
		aggiungiVerifica(1, 2, 8);
		aggiungiVerifica(1, 4, 4);
		aggiungiVerifica(1, 5, 7);
		aggiungiVerifica(1, 6, 1);

		aggiungiVerifica(2, 0, 7);
		aggiungiVerifica(2, 2, 3);
		aggiungiVerifica(2, 3, 2);
		aggiungiVerifica(2, 5, 1);
		aggiungiVerifica(2, 6, 9);

		aggiungiVerifica(3, 1, 1);
		aggiungiVerifica(3, 2, 2);
		aggiungiVerifica(3, 5, 8);
		aggiungiVerifica(3, 8, 4);
		
		aggiungiVerifica(4, 0, 9);
		aggiungiVerifica(4, 1, 5);
		aggiungiVerifica(4, 2, 7);
		aggiungiVerifica(4, 6, 3);
		aggiungiVerifica(4, 7, 1);
		
		aggiungiVerifica(5, 0, 4);
		aggiungiVerifica(5, 3, 3);
		aggiungiVerifica(5, 6, 5);
		aggiungiVerifica(5, 8, 2);
		
		aggiungiVerifica(6, 1, 3);
		aggiungiVerifica(6, 2, 1);
		aggiungiVerifica(6, 4, 7);
		aggiungiVerifica(6, 5, 4);
		aggiungiVerifica(6, 8, 9);
		
		aggiungiVerifica(7, 0, 6);
		aggiungiVerifica(7, 1, 4);
		aggiungiVerifica(7, 2, 5);
		aggiungiVerifica(7, 7, 8);
		
		aggiungiVerifica(8, 7, 6);
		aggiungiVerifica(8, 8, 1);
		giocoIniziato=true;
	}
	public void stampa() {
		System.out.println(" ====================");
		for(int rga=0;rga<9;rga++) {
			if(rga%3==0&&rga!=0) {
				System.out.println("[--------------------]");
			}
			System.out.print("[");

			for(int cln=0;cln<9;cln++) {
				if(cln%3==0&&cln!=0) {
					System.out.print("|");
				}
				System.out.print(scacchiera[rga][cln]+" ");
			}
			System.out.println("]");
		}
		System.out.println(" ====================");

	}
	private void aggiungiVerifica(int rga, int cln, int val) {
		if(giocoIniziato==false) {
			if(val==0) {
				scacchiera[rga][cln]=val;
				verifica[rga][cln]=true;
			}else {
				scacchiera[rga][cln]=val;
				verifica[rga][cln]=false;
			}		
		}else {
			System.out.println("GIOCO GIA INIZIATO");
		}
	}
	public void aggiungiMossa(int rga, int cln, int val) {
		rga-=1;
		cln-=1;
		if(verifica[rga][cln]==true) {
			scacchiera[rga][cln]=val;
		}else {
			System.out.println("NON MODIFICABILE");
		}
		System.out.println();		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();		
		System.out.println();
		System.out.println();		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();		
		System.out.println();
		System.out.println();		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();		
		System.out.println();

		stampa();
	}

	private boolean correggiQuadrati() {
		if(correggiQuad(0,0)==false) {
			System.out.println("sbagliato quadrato3x3 1");
			return false;
		}if(correggiQuad(0,3)==false) {
			System.out.println("sbagliato quadrato3x3 2");
			return false;
		}if(correggiQuad(0,6)==false) {
			System.out.println("sbagliato quadrato3x3 3");
			return false;
		}if(correggiQuad(3,0)==false) {
			System.out.println("sbagliato quadrato3x3 4");
			return false;
		}if(correggiQuad(3,3)==false) {
			System.out.println("sbagliato quadrato3x3 5");
			return false;
		}if(correggiQuad(3,6)==false) {
			System.out.println("sbagliato quadrato3x3 6");
			return false;
		}if(correggiQuad(6,0)==false) {
			System.out.println("sbagliato quadrato3x3 7");
			return false;
		}if(correggiQuad(6,3)==false) {
			System.out.println("sbagliato quadrato3x3 8");
			return false;
		}if(correggiQuad(6,6)==false) {
			System.out.println("sbagliato quadrato3x3 9");
			return false;
		}return true;
	}
	private boolean correggiQuad(int riga, int colonna) {
		int temp=0;
		for(int rga=riga;rga<riga+3;rga++) {
			for(int cln=colonna;cln<colonna+3;cln++) {
				mieiNumeri[temp]=scacchiera[rga][cln];
				temp++;
			}
			
		}if(equals()==false) {
			return false;
		}
		return true;
		
	}
	
	private boolean correggiRighe() {
		for(int rga=0;rga<9;rga++) {
			for(int cln=0;cln<9;cln++) {
				mieiNumeri[cln]=scacchiera[rga][cln];
			}
			if(equals()==false) {
				System.out.print("sbagliato riga "+(rga+1)+" colonna ");
				correggiColonne();
				return false;
			}
		}
		return true;
	}
	private boolean correggiColonne() {
		for(int cln=0;cln<9;cln++) {
			for(int rga=0;rga<9;rga++) {
				mieiNumeri[rga]=scacchiera[cln][rga];
			}
			if(equals()==false) {
				System.out.println(cln+1);
				return false;
			}
		}
		return true;
	}
	public boolean correttore() {		
		if(correggiRighe()==false) {
			return false;
		}if(correggiColonne()==false) {
			return false;
		}if(correggiQuadrati()==false) {
			return false;
		}
		return true;
	}
	private boolean equals() {
		Arrays.sort(mieiNumeri);
		for(int i=0;i<9;i++) {
			if(mieiNumeri[i]!=numeri[i]) {
				return false;
			}
		}
		return true;
	}
}
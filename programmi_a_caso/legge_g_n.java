
import java.util.Scanner;
public class legge_g_n {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int var1; 
		int var2;
		int conteggio_1=0, conteggio_2=0, conteggio_3=0, conteggio_4=0, conteggio_6=0, conteggio_5=0;
			System.out.println("Quante volte vuoi lanciare il dado???");
				var1=tastiera.nextInt();
				int array[]=new int[var1];
				for(int i = 0;i<var1;i++) {
					array[i]=var2=(int)(6*Math.random())+1;
						System.out.println(array[i]);
				}
				for(int i= 0;i<var1;i++) {
					switch(array[i]) {
					case 1:
						conteggio_1++;
						break;
					case 2:
						conteggio_2++;
						break;
					case 3:
						conteggio_3++;
						break;
					case 4:
						conteggio_4++;
						break;
					case 5:
						conteggio_5++;
						break;
					case 6:
						conteggio_6++;
						break;
					}
				}
				System.out.println("");
				System.out.println("l'1 lo troviamo " + conteggio_1 + " volta/e " + "la sua percentuale equivale a " + (conteggio_1*100)/var1 + "%");
				System.out.println("il 2 lo troviamo " + conteggio_2 + " volta/e " + "la sua percentuale equivale a " + (conteggio_2*100)/var1 + "%");
				System.out.println("il 3 lo troviamo " + conteggio_3 + " volta/e " + "la sua percentuale equivale a " + (conteggio_3*100)/var1 + "%");				System.out.println("l'1 lo troviamo " + conteggio_1 + " volta/e" + "la sua percentuale equivale a " + (conteggio_1*100)/var1 + "%");
				System.out.println("il 4 lo troviamo " + conteggio_4 + " volta/e " + "la sua percentuale equivale a " + (conteggio_4*100)/var1 + "%");
				System.out.println("il 5 lo troviamo " + conteggio_5 + " volta/e " + "la sua percentuale equivale a " + (conteggio_5*100)/var1 + "%");
				System.out.println("il 6 lo troviamo " + conteggio_6 + " volta/e " + "la sua percentuale equivale a " + (conteggio_6*100)/var1 + "%");
				

				
					

	
				
					
					
					
					
					
					
				}
				
					
					
						
	}

								

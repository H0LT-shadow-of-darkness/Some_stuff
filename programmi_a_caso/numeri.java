import java.util.Scanner;
public class numeri {
    public static void main(String[] args){
        Scanner tast = new Scanner(System.in);
		int[] array = new int[10];
		int n;
		int f;
		int[] counter= new int[10];
        boolean[] contatore = new boolean[10];
		System.out.println("inserisci numero");

		for(int i=0; i<array.length;i++) {
			array[i]= tast.nextInt();
			if(array[i]<0) {
				break;
			}
		}	
		for(int i=0; i<array.length;i++) {
			n=array[i];
			f=i+1;
			for(int j=0; j<array.length;j++) {
				if(n==array[j]) {
					counter[i]++;
				}
			}
			if(counter[i]==n) {
                contatore[n]=true;
			}
				}

            for(int i=0; i<array.length;i++) {
                if(contatore[i]==true){
                    System.out.println("numero "+ i);
                }
            }

		}
    }

			
		
	


    

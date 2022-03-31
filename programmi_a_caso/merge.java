import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner tast = new Scanner(System.in);
        int temp;
		int size = 8;
		int metasize = size/2;
		temp= size-metasize;
		int[] array = {2,8,5,3,9,4,1,7};
		int[] primameta = new int[metasize];
		int[] secondameta = new int[temp];
		for(int f=0;f<metasize;f++) {
			primameta[f]=array[f];
			}
		for(int g=0;g<temp;g++) {
			secondameta[g]=array[g+metasize];
		}


		ordina(primameta);
        ordina(secondameta);


		int k=0, i=0, j=0;
		int max;
		if(primameta[metasize-1]>secondameta[temp-1]) {
			max =primameta[metasize-1];
		}else {
			max = secondameta[temp-1];
		}
		while(k!=size) {
			if(i<=metasize-1 && j<=temp-1) {
				if(primameta[i]<secondameta[j]) {
					array[k]=primameta[i];
					i++;
				}else {
					array[k]=secondameta[j];
					j++;
				}
			}
			k++;
		}
		array[size-1]=max;
		for(int t=0; t<size; t++) {
			System.out.println(array[t]);
		}
    }
	public static void ordina(int[] args) {
		int min=0;
		int indicemin=0;
		int temp=0;
		for(int i=0;i<args.length;i++) {
			min=args[i];
			for(int j=i;j<args.length;j++) {
				if(args[j]<=min) {
					min=args[j];
					indicemin=j;
				}
			}
			temp=args[i];
			args[i]=args[indicemin];
			args[indicemin]=temp;
		}
	}
}


	

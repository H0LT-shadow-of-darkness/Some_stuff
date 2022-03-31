package jlibbreria;

public class na_sorta_de_selection {

	public static void main(String[] args) {
		int[] array = {10,10,9,8,7,6,5,4,3,2,110,10,9,8,7,6,5,4,3,2,-1};
		int min=0;
		int indicemin=0;
		int temp=0;
		for(int i=0;i<array.length;i++) {
			min=array[i];
			for(int j=i;j<array.length;j++) {
				if(array[j]<=min) {
					min=array[j];
					indicemin=j;
				}
			}
			temp=array[i];
			array[i]=array[indicemin];
			array[indicemin]=temp;
		}
		for(int t=0;t<array.length;t++) {
			System.out.println(array[t]);
		}
	}

}

package es;

public class rick {

	public static void main(String[] args) {
		System.out.println(potenza(3,2));
	}
	public static int potenza(int x, int y) {
		if(y==0) {
			return 1;
		}if(y==1){
			return x;
		}else {
			return x*potenza(x,y-1);
		}
	}

}

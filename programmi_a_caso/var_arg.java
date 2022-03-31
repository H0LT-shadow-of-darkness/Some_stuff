
public class var_arg {

	public static void main(String[] args) {
		String fras= "peppe non è homo ma è bello verde rosso";
		String parola = "homo";
		String parola3 = "non";
		String parola4 = "bello";
		String parola5 = "rosso";
		
		censura(fras, parola, parola3, parola4, parola5);
	}
	
	
	
	public static void censura(String ...arg){
		int arglen=arg.length;
		for(int i=0;i<=arglen;i++) {
			int ninizio= arg[0].indexOf(arg[i+1]);
			int nn = ninizio +arg[i+1].length();
			String frase1 = arg[0].substring(0,ninizio);
			String frase2 = arg[0].substring(nn); 
			arg[0] = frase1.concat(frase2);
			System.out.println(arg[0]);
		}
	}
}



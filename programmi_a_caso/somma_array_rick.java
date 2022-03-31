public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {4,5};
        System.out.println(somma_array(array, 0));
    }
    
    public static int somma_array(int[] array, int k){
        int risultato=0;
        if(k!=array.length){
            risultato=array[k]+somma_array(array, k+1);
            return risultato;
        }else{
            return risultato;
        }


    }
}

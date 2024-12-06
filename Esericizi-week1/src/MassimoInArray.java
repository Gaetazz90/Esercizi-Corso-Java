import java.util.Arrays;

public class MassimoInArray {
    /*
    Scrivete una funzione che calcoli il massimo valore compreso in un array,
    senza utilizzare metodi di supporto.
     */

    public static int maxvalue(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] numeri = {0,1,21,-3,4,55,6,27,85,14,10};
        System.out.println(Arrays.toString(numeri));
        System.out.println("MAX: " + maxvalue(numeri));
        Arrays.sort(numeri);
        System.out.println(Arrays.toString(numeri));

    }
}

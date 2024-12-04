import java.util.Arrays;

public class EsercizioTabelline {

    /*
    Scrivete una funzione che dato in input due numeri n ed m,
    crea un array lungo m che in ogni cella ha il valore di indice della cella moltiplicato per n.
     */

    public static int[] tabelline(int m, int n){
        int[] array1 = new int[m];
        for(int i = 0; i < array1.length; i++){
            array1[i] = i * n;
        }
        return array1;
    }

    public static void main (String[] args){
        int[] outputArray1 = tabelline(11, 2);
        System.out.println(Arrays.toString(outputArray1));
    }

}

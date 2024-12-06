import java.util.Arrays;

public class Fattoriale {
    /*
    ALGORITMO:
    i = 2, result = 1 * 2 = 2
    i = 3, result = 2 * 3 = 6
    i = 4, result = 6 * 4 = 24
    ecc.
    */

    public static int fattoriale(int n){
        if(n < 0){
            System.out.println("Non esiste il fattoriale di un numero negativo");
        }
        if(n == 0){
            return 1;
        }
        int risultato = 1;
        for(int i = 2; i <= n; i++){
            risultato = risultato * i;
        }
        return risultato;
    }

    public static void main(String[] Args){
        //System.out.println(fattoriale(3));
        int n = 5;
        System.out.println("Il fattoriale di " + n + " è: " + fattoriale(n));
    }
}

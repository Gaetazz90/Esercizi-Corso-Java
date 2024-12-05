import java.util.Arrays;
import java.util.Locale;

public class Anagramma {

    /*
    Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri
    con le stesse frequenze. Ad esempio, gli anagrammi di CAT sono CAT,
    ACT,TAC,TCA,ATC, e CTA. Date due stringhe a e b in input, stampare «anagrammi»
    se sono anagrammi (case-insensitive), «non anagrammi» altrimenti.
    */

    public static void anagrammaSiNo(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            System.out.println("Non Anagramma");
            return;
        }
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if(Arrays.equals(arrayA, arrayB)){
            System.out.println("Anagramma");
        }else{
            System.out.println("Non Anagramma");
        }
    }

    public static void main(String[] args){
        anagrammaSiNo("Anna", "Nana");
    }


}

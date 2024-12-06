import java.util.Arrays;

public class DispariPerDue {
    /*
    Scrivete una funzione che dato un array di valori interi ne restituisce una copia
    dove i numeri dispari sono stati moltiplicati per 2.
     */

   public static int[] disparix2(int[] arrayInput){
       int[] arrayOutput = new int[arrayInput.length];
       for (int i = 0; i < arrayInput.length; i++) {
           if(arrayInput[i] % 2 == 1){
               arrayOutput[i] = arrayInput[i] * 2;
           }else{
               arrayOutput[i] = arrayInput[i];
           }
       }
       return arrayOutput;
   }

   public static void main(String[] args){
       int[] arrayNumeri = {12, 24, 37, 49, 51, 666};
       System.out.println(Arrays.toString(disparix2(arrayNumeri)));

   }

}

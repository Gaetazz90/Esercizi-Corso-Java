/*

Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale ogni numero è
definito dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via. Assumete di iniziare da 0,
dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.

suggerimento: usate gli array

Test: fibonacci(45) deve stampare 1134903170

 */


public class EsercizioFibonacci {

    public static int fibonacci(int n){
        int[] arrayFib = new int[10];
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        for(int i = 2; i < arrayFib.length; i++){
            arrayFib[i] = arrayFib[i-1] + arrayFib[i-2];
        }
        int nFib = arrayFib[i];
        return nFib;
    }
}

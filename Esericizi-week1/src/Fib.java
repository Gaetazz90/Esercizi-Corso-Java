public class Fib {
    /*
    Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci,
    nella quale ogni numero è
    definito dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
    Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via. Assumete di iniziare da 0,
    dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.

    suggerimento: usate gli array

    Test: fibonacci(45) deve stampare 1134903170

    Fib(0) = 0
    Fib(1) = 1
    Fib(n) = Fib(n-1) + Fib(n-2)

     */

    public static void fib(int n){
        int[] arrayFib = new int[n];
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        int fibN = -1;
        for(int i = 2; i < arrayFib.length; i++){
            arrayFib[i] = arrayFib[i-1] + arrayFib[i-2];
            fibN = arrayFib[i];
        }
        System.out.println(fibN);
    }

    public static void main(String[] args){
        fib(8);
    }
}

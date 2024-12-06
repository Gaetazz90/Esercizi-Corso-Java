public class Fibonacci {
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

    //N è praticamente l'indice del numero della successione di Fib che voglio trovare...
    //dato che la sequenza è infinita, N + 1 sarà la lunghezza del mio array...
    //
    public static int fibonacci(int n){
        if(n < 0){
            System.out.println("Errore: la sequenza di Fibonacci parte da 0!");
            return -1;
        }
        int[] numeri = new int[n+1];
        numeri[0] = 0;
        numeri[1] = 1;
        for(int i = 2; i <= n; i++){
            numeri[i] = numeri[i-1] + numeri[i-2];
        }
        return numeri[n];
    }
    public static void main(String[] args){
        System.out.println(fibonacci(4));
    }
}

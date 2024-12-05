/*
Scrivere un metodo che chieda all'utente di inserire due numeri interi e di
inserire un'operazione tra le seguenti:
- somma
- sottrazione
- moltiplicazione
- divisione
- resto
e stampa a video il risultato dell'operazione scelta tra i due numeri
 */

import java.util.Scanner;

public class Calcolatrice {
    public static void calcolatrice(){
        System.out.println("Inserisci 2 numeri:");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Errore: devi inserire un numero intero!");
        }
        int a = scanner.nextInt();//oppure Integer.parseInt(input.next())
        int b = scanner.nextInt();//oppure Integer.parseInt(input.next())
        System.out.println("Inserisci un operatore tra i seguenti: +, \n -, \n *, \n /, \n %");
        String operatore = scanner.next();
        if(operatore.equals("+")){
            int somma = a + b;
            System.out.println(somma);
        }else if(operatore.equals("-")){
            int sottrazione = a - b;
            System.out.println(sottrazione);
        }else if(operatore.equals("*")){
            int moltiplicazione = a * b;
            System.out.println(moltiplicazione);
        }else if(operatore.equals("/")){
            if(b == 0){
                System.out.println("Errore: risultato indefinito!Non puoi dividere un numero per 0");
            }
            double divisione = (double)a / (double)b;
            System.out.println(divisione);
        }else if(operatore.equals("%")){
            int modulo = a % b;
            System.out.println(modulo);
        }else{
            System.out.println("Errore: operatore non valido");
            calcolatrice();
        }
    }

    public static void main(String[] args){
        calcolatrice();
    }
}

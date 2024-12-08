import java.util.Arrays;
import java.util.Random;

public class Tombola {


    public static void tombola(int[] tabellone, boolean[] estrazione, int[][] cartelle, boolean[][] risultati) {
        Random random = new Random();

        //Crea numeri della tombola
        for (int i = 0; i < tabellone.length; i++) {
            tabellone[i] = i + 1;
        }

        //Creazione cartelle con numeri casuali(per ora senza controllo dei duplicati)
        int max = 90;
        int min = 1;
        int numeroCartelle;
        for (int i = 0; i < cartelle.length; i++) {
            for (int j = 0; j < cartelle[i].length; j++) {
                boolean doppione = false;
                while(doppione == false){
                    numeroCartelle = random.nextInt((max - min) + 1) + min;
                    cartelle[i][j] = numeroCartelle;
                    for(int m = 0; m < cartelle.length; m++) {
                        for (int n = 0; n < cartelle[m].length; n++) {
                            if (cartelle[m][n] == numeroCartelle) {
                                doppione = true;
                            }
                        }
                    }
                    if(doppione == true){
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(cartelle[i]));
        }



        //crea una funzione che estrae un numero a caso dalla sacchetta
        int numeroEstratto = 0;
        for (int k = 0; k < tabellone.length; k++) {
            int indiceCasuale = random.nextInt(tabellone.length);
            while (estrazione[indiceCasuale] == false) {
                numeroEstratto = tabellone[indiceCasuale];
                estrazione[indiceCasuale] = true;
                //crea una funzione che verifica se il numero estratto è contenuto in una delle cartelle
                for (int i = 0; i < cartelle.length; i++) {
                    for (int j = 0; j < cartelle[i].length; j++) {
                        if (cartelle[i][j] == numeroEstratto) {
                            risultati[i][j] = true;
                        }
                    }
                }
            }
        }

        //verificate quindi le condizioni, stampa il risultato a seconda dei numeri estratti
        int numeriTrovati = 0;
        for(int i = 0; i < risultati.length; i++){
            for(int j = 0; j < risultati[i].length; j++){
                if(risultati[i][j] == true){
                    numeriTrovati++;
                }
            }
        }
        System.out.println(numeriTrovati);
        System.out.println("Numeri trovati nella cartella: " + numeriTrovati);
        if(numeriTrovati == 2){
            System.out.println("Ambo");
        }else if(numeriTrovati == 3){
            System.out.println("Terna");
        }else if(numeriTrovati == 4){
            System.out.println("Quaterna");
        }else if(numeriTrovati == 5){
            System.out.println("Cinquina");
        }else if(numeriTrovati > 5 && numeriTrovati < 27){
            System.out.println("ti stai avvicinando alla tombola");
        }else{
            System.out.println("Tombola");
        }
//        switch(numeriTrovati){
//            case 2:
//                System.out.println("Ambo");
//                break;
//            case 3:
//                System.out.println("Terna");
//                break;
//            case 4:
//                System.out.println("Quaterna");
//                break;
//            case 5:
//                System.out.println("Cinquina");
//                break;
//            case 27:
//                System.out.println("Tombola");
//                break;
//            default:
//                System.out.println("Nessun punteggio");
//        }

    }

    public static void main(String[] args){

        int[] numeriTombola = new int[90];

        boolean[] numeriEstratti = new boolean[90];

        String giocatore1 = "John";
        int[][] cartella1 = new int[3][9];
        String giocatore2 = "Tom";
        int[][] cartella2 = new int[3][9];
        String giocatore3 = "Rick";
        int[][] cartella3 = new int[3][9];

        boolean[][] risulato1 = new boolean[3][9];
        boolean[][] risulato2 = new boolean[3][9];
        boolean[][] risulato3 = new boolean[3][9];

        tombola(numeriTombola, numeriEstratti, cartella1, risulato1);

    }


}


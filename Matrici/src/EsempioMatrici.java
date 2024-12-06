import java.util.Arrays;

public class EsempioMatrici {

    public static void funzioneMatrice(int[][] matrice){
        for(int i = 0; i < matrice.length; i++){
            int[] riga = matrice[i];
            //la riga è corrisponde a ciascun array
            for(int j = 0; j < riga.length; j++){
                int colonna = riga[j];
                //tecnicamente questa non è una colonna, ma solo l'elemento singolo di una colonna...
                //la colonna vera sarebbe ad es: matrice[0][0], matrice[1][0], matrice[2][0];
                System.out.println(colonna);
            }
        }
    }

    public static void stampaMatriceQuadrata(int[][] matrice){
        String myString = "[ \n";
        for (int i = 0; i < matrice.length; i++){
            myString += Arrays.toString(matrice[i]);
            myString += ", \n";
            System.out.println(Arrays.toString(matrice[i]));
        }
        myString += "]";
        System.out.println(myString);
    }

    public static void main (String[] args){
        int[][] matrice1 =
                {
                        {3,6,9},
                        {12,15,18},
                        {21,24,27}
                };
        System.out.println(Arrays.deepToString(matrice1));
        funzioneMatrice(matrice1);
        stampaMatriceQuadrata(matrice1);
    }
}

/*
Per stampare l'array bidimnesionale ho diversi modi come visto sopra:
1. mi faccio 2 cicli for e stampo quindi ogni elemento(quindi uno sotto l'altro)
    3
    6
    9
    12
    15
    18
    21
    24
    27
2. mi faccio 1 solo ciclo for(quindi solo l'array globale) e lo stampo con il metodo Arrays.toString
    [3, 6, 9]
    [12, 15, 18]
    [21, 24, 27]
    2.1 se voglio ottenere un outuput più organizzato fai come vedi sopra
    [
    [3, 6, 9],
    [12, 15, 18],
    [21, 24, 27],
    ]
3. usa il metodo Arrays.deepToString - VALE SOLO PER GLI ARRAY BIDIMENSIONALI
   che stampa direttamente tutto l'array di array.
    [3, 6, 9], [12, 15, 18], [21, 24, 27]]
 */

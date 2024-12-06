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
        funzioneMatrice(matrice1);
        stampaMatriceQuadrata(matrice1);
    }
}

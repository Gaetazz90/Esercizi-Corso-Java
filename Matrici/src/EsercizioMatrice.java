/*
Scrivete una funzione che data una matrice quadrata in input, restituisce la somma della diagonale da sinistra a destra.
Scrivete una seconda funzione che presa una matrice quadrata e un booleano a seconda del valore del booleano restituisce
o la somma della diagonale da sinistra a destra o quella da destra a sinistra.
Hint: usate la prima funzione nella seconda!
 */

public class EsercizioMatrice {

    public static int sommaDiagonale(int[][] matrix){
        int somma = 0;
        //somma = matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3] ;
        //Anche se il risultato è giusto...questo metodo non va bene, perchè se ho ad es. una matrice 100*100
        //dovrei scrivermi a mano la somma e diventerebbe troppo lungo-NON FUNNZIONALE
        //Quindi, dato che gli indici di ogni elemento della somma sono sempre uguali(0-0,1-1,2-2, ecc.)
        //posso ciclarmi l'array e usare come indice per ogni addendo semplicemente il contatore "i";
        for(int i = 0; i < matrix.length; i++){
            somma = somma + matrix[i][i];
        }
        return somma;
    }

    public static int sommaDiagonale2(int[][] matrix2, boolean booleano){
        int somma2 = 0;
        if(booleano == true){
            for(int i = 0; i < matrix2.length; i++){
                somma2 += matrix2[i][i];
            }
        }
        else{
            for(int i = matrix2.length; i > 0; i--){
                somma2 += matrix2[i-1][matrix2.length-i];
            }
        }

        return somma2;
    }

    public static void main(String[] args){
        int[][] matriceQuadrata =
                {
                {5,10,15,22},
                {25,30,35,40},
                {45,50,55,60},
                {66,70,75,80}
                };
        System.out.println(sommaDiagonale(matriceQuadrata));
        System.out.println(sommaDiagonale2(matriceQuadrata, true));
        System.out.println(sommaDiagonale2(matriceQuadrata, false));


        /*
        //Stampa metodo 1
        System.out.println(Arrays.deepToString(matriceQuadrata));

        //Stampa metodo 2
        for (int i = 0; i < matriceQuadrata.length; i++){
            System.out.println(Arrays.toString(matriceQuadrata[i]));
        }

        //Stampa metodo 3
        for(int i = 0; i < matriceQuadrata.length; i++){
            for(int j = 0; j < matriceQuadrata.length; j++){
                System.out.println(matriceQuadrata[i][j]);
            }
        }
        */

    }
}

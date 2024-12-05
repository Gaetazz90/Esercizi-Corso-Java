    public class ConteggioSecondi {

    /*
    Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa
    che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
     */

        public static String contasecondi(int secondi){
           if(secondi < 0){
               System.out.println("Il numero di secondi non può essere negativo");
           }
           int giorni = secondi / 86400;
           int restoOre = secondi % 86400;
           int ore = restoOre / 3600;
           int restoMinuti = restoOre % 3600;
           int minuti = restoMinuti / 60;
           int restoSecondi = restoMinuti % 60;
           String fraseFinale = secondi + " secondi corrispondono a: " + giorni + " giorni," + ore + " ore," + minuti + " minuti e " + restoSecondi + " secondi";
           return fraseFinale;
        }

        public static void main(String[] args){
            System.out.println(contasecondi(8715471));
        }
    }


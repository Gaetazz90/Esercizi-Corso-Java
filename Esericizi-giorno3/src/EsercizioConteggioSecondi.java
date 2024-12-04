    public class EsercizioConteggioSecondi {

    /*
    Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa
    che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
     */

        public static String contasecondi(int nS){
            int nM = nS / 60;
            int nH = nS / 3600;
            String StringSeconds = "Ore: " + nH + "\n" + "Minuti: " + nM + "\n" +  "Secondi: " + nS;
            return StringSeconds;
        }

        public static void main(String[] args){
            System.out.println(contasecondi(7200));


        }
    }


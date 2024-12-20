import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NullPointerException, IllegalArgumentException, InvalidGenereException {

        Impiegato impiegato1 = new Impiegato("Marco", "Bianchi", 'M', 1348.27);
        Impiegato impiegato2 = new Impiegato("Bianca", "Rossi", 'F', 1498.67);
        Impiegato impiegato3 = new Impiegato("Anna", "Verdi", 'F', 2135.98);
        Impiegato impiegato4 = new Impiegato("Paola", "Neri", 'F', 896.47);
        Impiegato impiegato5 = new Impiegato("Walter", "White", 'M', 1784.56);
        Impiegato impiegato6 = new Impiegato("Elliot", "Anderson", 'M', 2551.89);

        List<Impiegato> listaImpiegati = new ArrayList<>();

        listaImpiegati.add(impiegato1);
        listaImpiegati.add(impiegato2);
        listaImpiegati.add(impiegato3);
        listaImpiegati.add(impiegato4);
        listaImpiegati.add(impiegato5);
        listaImpiegati.add(impiegato6);

        System.out.println(listaImpiegati);

        List<Impiegato> listaImpiegatiMaschi =  listaImpiegati
                                                .stream()
                                                .filter(impiegato -> impiegato.getGenere().equals('M'))
                                                .collect(Collectors.toList());
                                        //oppure.toList() ---> solo per le Liste
        System.out.println(listaImpiegatiMaschi);

        Set<Impiegato> setImpiegatiFemmine = listaImpiegati
                                            .stream()
                                            .filter(impiegato -> impiegato.getGenere().equals('F'))
                                            .collect(Collectors.toSet());
        System.out.println(setImpiegatiFemmine);

        Map<Integer, Impiegato> mappaImpiegati = listaImpiegati
                                                .stream()
                                                .collect(Collectors.toMap(impiegato -> impiegato.getId(), Function.identity()));
                                        //oppure.collect(Collectors.toMap(Impiegato::getId, Function.identity()));
        System.out.println(mappaImpiegati);



        //Nota: mentre per le collections(quindi Set List ecc. ) non devi specificare niente nel metodo collect,
        //a meno che non vuoi ritornare un implementazione specifica di Lista(ad es. ArrayList) o di Set (ad es. HashSet)
        //(ricorda che non c'è garanzia sul tipo di implementazione di List, Set ecc.)
        //nelle mappe, dove definisci prima solo di che Tipo saranno la chiave e il valore associati a ciascun elemento,
        //poi nel Collectors dovrai specificare quindi quale sarà la chiave di ogni elemento (in questo caso l'id di ogni impiegato)
        // e il suo valore associato (in questo caso l'oggetto impiegato), infatti Function.identity() è una funzione che ritorna un input senza modificarlo(l'oggetto impiegato appunto).



    }
}
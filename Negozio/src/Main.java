import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Negozio negozio = new Negozio("McDonato - Alimentari e non");

        Prodotto prodotto1 = new Prodotto("Panini", TipoProdotto.ALIMENTARI, 0.75);
        Prodotto prodotto2 = new Prodotto("Detersivo", TipoProdotto.CASALINGHI, 4.20);
        Prodotto prodotto3 = new Prodotto("Cacciavite", TipoProdotto.DIY, 2.50);

        negozio.aggiungiProdotto(prodotto1, 10);
        negozio.aggiungiProdotto(prodotto2, 5);
        negozio.aggiungiProdotto(prodotto3, 20);

        Prodotto prodotto4 = new Prodotto("Quaderni", TipoProdotto.CARTOLERIA, 1.25);
        Prodotto prodotto5 = new Prodotto("Pennarelli", TipoProdotto.CARTOLERIA, 1.75);
        negozio.aggiungiProdotto(prodotto4, 25);
        negozio.aggiungiProdotto(prodotto5, 50);

        negozio.aggiungiProdotto(prodotto1, 12);
        negozio.aggiungiProdotto(prodotto2, 6);

        negozio.rimuoviProdotto(prodotto5);

        Prodotto prodotto6 = new Prodotto("Penne Biro", TipoProdotto.CARTOLERIA, 0.50);
        negozio.aggiungiProdotto(prodotto6 , 50);

        Cliente cliente1 = new Cliente("Mbare Peppino", LocalDate.of(1975,10,16));

        cliente1.acquistaProdotto(prodotto3, 10);
        cliente1.acquistaProdotto(prodotto5, 5);
        cliente1.acquistaProdotto(prodotto4, 30);
        cliente1.acquistaProdotti(Arrays.asList(prodotto1, prodotto2), Arrays.asList(5, 2));




    }


}
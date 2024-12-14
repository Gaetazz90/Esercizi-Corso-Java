import java.util.ArrayList;
import java.util.List;

public class Negozio {

    private String nomeNegozio;
    private static List<Prodotto> prodotti;

    public Negozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
        prodotti = new ArrayList<>();
    }

    public String getNomeNegozio() {
        return nomeNegozio;
    }
    public void setNomeNegozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
    }

    public static List<Prodotto> getProdotti() {
        return prodotti;
    }
    public static void setProdotti(List<Prodotto> newProdotti) {
        prodotti = newProdotti;
    }

    public void aggiungiProdotto(Prodotto prodotto, Integer quantita){
        if(prodotti.contains(prodotto)){
            prodotto.setQuantita(quantita);
        }
        prodotto.setQuantita(quantita);
        prodotti.add(prodotto);
    }
    public void rimuoviProdotto(Prodotto prodotto){
        prodotti.remove(prodotto);
    }
    public void listaProdotti(){
        for (Prodotto p : prodotti) {
            System.out.println("---------------");
            System.out.println("ID prodotto: " + p.getId());
            System.out.println("Nome Prodotto: " + p.getNomeProdotto());
            System.out.println("Quantità disponibile: " + p.getQuantita());
            System.out.println("---------------");
        }
    }

    public static boolean isProdottoDisponibile(Prodotto prodotto, Integer quantita){
        if(!prodotti.contains(prodotto)){
            System.out.println("Spiacenti, prodotto non disponbile");
            return false;
        }
        if(prodotto.getQuantita() < quantita){
            System.out.println("Spiacenti, quantità non disponibile");
            return false;
        }
        return true;
    }



}

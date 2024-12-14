import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    private String nomeCliente;
    private LocalDate dataDiNascita;
    private String codiceFiscale;

    public Cliente(String nomeCliente, LocalDate dataDiNascita) {
        this.nomeCliente = nomeCliente;
        this.dataDiNascita = dataDiNascita;
        this.codiceFiscale = UUID.randomUUID().toString();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }
    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Cliente cliente = (Cliente) obj;
//        if(cliente.getCodiceFiscale().equals(this.codiceFiscale)){
//            return true;
//        }
//        return false;
        return cliente.getCodiceFiscale().equals(this.codiceFiscale);
    }

    public double acquistaProdotto(Prodotto prodotto, Integer quantita){
        if(!Negozio.isProdottoDisponibile(prodotto, quantita)){
            return 0.0;
        }
        prodotto.setQuantita(prodotto.getQuantita() - quantita);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuoi rateizzare il pagamento?\n " +
                            "Premi N per pagare in unica soluzione\n" +
                            "Premi Y per rateizzare l'importo");
        String risposta = scanner.next();
        if(risposta.equals("N")){
            double importoTotale = quantita * prodotto.getPrezzoProdotto();
            System.out.println("Prezzo totale da pagare per l'acquisto: " + importoTotale);
            return importoTotale;
        }
        else if(risposta.equals("Y")) {
            System.out.println("In quanti mesi vuoi pagare? Scegli un numero tra 2 e 12");
            int nMesi = scanner.nextInt();
            if(nMesi > 2 && nMesi < 12){
                double importoRata = quantita * prodotto.getPrezzoProdotto() / nMesi;
                System.out.println("Prezzo della rata mensile: " + importoRata);
                return importoRata;
            }
            else{
                System.out.println("Allora sei scemo...ti ho detto un numero tra 2 e 12...quindi mo te lo scelgo io");
                nMesi = 6;
                double importoRata = quantita * prodotto.getPrezzoProdotto() / nMesi;
                System.out.println("Prezzo della rata mensile: " + importoRata);
                return importoRata;
            }
        }
        else{
            double importoTotale = prodotto.getQuantita()* prodotto.getPrezzoProdotto();
            System.out.println("E allora mo paghi tutto insieme trmon" + importoTotale);
            System.out.println("Prezzo totale da pagare per l'acquisto: " + importoTotale);
            return importoTotale;
        }
    }

    public double acquistaProdotti(List<Prodotto> prodotti,List<Integer> quantita){
        if(prodotti.size() != quantita.size()){
            System.out.println("Input errato: prodotti e quantità non corrispondono");
            return 0.0;
        }
        for (int i = 0; i < prodotti.size(); i++) {
            if(!Negozio.isProdottoDisponibile(prodotti.get(i),quantita.get(i))){
                return 0.0;
            }
        }
        double importoTotale = 0.0;
        for (int i = 0; i < prodotti.size(); i++) {
            prodotti.get(i).setQuantita(prodotti.get(i).getQuantita() - quantita.get(i));
            importoTotale += prodotti.get(i).getPrezzoProdotto() * quantita.get(i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuoi rateizzare il pagamento?\n " +
                            "Premi N per pagare in unica soluzione\n" +
                            "Premi Y per rateizzare l'importo");
        String risposta = scanner.next();
        if(risposta.equals("Y")){
            System.out.println("In quanti mesi vuoi pagare? Scegli un numero tra 2 e 12");
            int nMesi = scanner.nextInt();
            if(nMesi> 2 && nMesi < 12){
                double importoRata = importoTotale / nMesi;
                System.out.println("Prezzo della rata mensile: " + importoRata);
                return importoRata;
            }
            else{
                System.out.println("Allora sei scemo...ti ho detto un numero tra 2 e 12...quindi mo te lo scelgo io");
                nMesi = 6;
                double importoRata = importoTotale / nMesi;
                System.out.println("Prezzo della rata mensile: " + importoRata);
                return importoRata;
            }
        }
        else if(risposta.equals("N")){
            System.out.println("Prezzo totale da pagare per l'acquisto: " + importoTotale);
            return importoTotale;
        }
        else{
            System.out.println("Prezzo totale da pagare per l'acquisto: " + importoTotale);
            return importoTotale;
        }

    }


}

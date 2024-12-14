import java.util.UUID;

public class Prodotto {

    private static Integer idTot = 1;
    private Integer id;
    private String nomeProdotto;
    private TipoProdotto tipoProdotto;
    private Double prezzoProdotto;
    private Integer quantita;

    public Prodotto(String nomeProdotto, TipoProdotto tipoProdotto, Double prezzoProdotto) {
        this.id = idTot++;
        this.nomeProdotto = nomeProdotto;
        this.tipoProdotto = tipoProdotto;
        this.prezzoProdotto = prezzoProdotto;
        this.quantita = 0;
    }

    public Integer getId(){
        return this.id;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }
    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }
    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public Double getPrezzoProdotto() {
        return prezzoProdotto;
    }
    public void setPrezzoProdotto(Double prezzoProdotto) {
        this.prezzoProdotto = prezzoProdotto;
    }

    public Integer getQuantita() {
        return quantita;
    }
    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

}

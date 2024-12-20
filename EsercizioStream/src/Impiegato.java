public class Impiegato {

//    id, nome, cognome, genere, pagaMensile.

    private static Integer idTot = 0;
    private Integer id;
    private String nome;
    private String cognome;
    private Character genere;
    private Double pagaMensile;

    public Impiegato(String nome, String cognome, Character genere, Double pagaMensile) throws InvalidGenereException {
        Validators.requireNotNullNotBlank(nome);
        Validators.requireNotNullNotBlank(cognome);
        Validators.requireNotNullNotBlank(genere);
        Validators.requireNotNullNotBlank(pagaMensile);
        Validators.requireBiggerThan(pagaMensile, 0d);
        this.id = ++idTot;
        this.nome = nome;
        this.cognome = cognome;
        if(genere.equals('M') || genere.equals('F')){
            this.genere = genere;
        }else{
            throw new InvalidGenereException("Genere inserito non valido");
        }

        this.pagaMensile = pagaMensile;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Character getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    public Double getPagaMensile() {
        return pagaMensile;
    }

    public void setPagaMensile(Double pagaMensile) {
        this.pagaMensile = pagaMensile;
    }


    @Override
    public String toString() {
        return "Dati Impiegato: ID=" + id +  " nome=" + nome + " cognome=" + cognome + " genere=" + genere + " paga mensile=" + pagaMensile + "\n";
    }
}

public class Film {

    private String titolo;
    private int annoUscita;
    private Genere genere;
    private String regista;
    private boolean disponibile;
    private boolean visionando;

    public Film(String titolo, int annoUscita, Genere genere, String regista){
        this.titolo = titolo;
        this.annoUscita = annoUscita;
        this.genere = genere;
        this.regista = regista;
        this.disponibile = true;
        this.visionando = false;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoUscita(){
        return annoUscita;
    }
    public void setAnnoUscita( int annoUscita){
        this.annoUscita = annoUscita;
    }

    public Genere getGenere(){
        return genere;
    }
    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public String getRegista(){
        return regista;
    }
    public void setRegista(String regista){
        this.regista = regista;
    }

    public boolean isDisponibile() {
        return disponibile;
    }
    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public boolean isVisionando() {
        return visionando;
    }
    public void setVisionando(boolean visionando) {
        this.visionando = visionando;
    }

    public void infoFilm(){
        System.out.println("--------------------");
        System.out.println("Titolo Film: " + getTitolo());
        System.out.println("Anno di uscita Film: " + getAnnoUscita());
        System.out.println("Genere Film: " + getGenere());
        System.out.println("Regista Film: " + getRegista());
        System.out.println("Disponibile:" + (isDisponibile() ? "SI" : "NO"));
        System.out.println("--------------------");
    }

    public void visionaFilm(){
        if(disponibile){
            System.out.println("Il film '" + getTitolo() +   "' è iniziato...buona visione");
            visionando = true;
        }else{
            System.out.println("Sorry bro...il film non è più disponibile");
        }
    }

    public void terminaVisione(){
        if(visionando){
            System.out.println("La visione del film '" + getTitolo() + "' è terminata");
            visionando = false;
        }else{
            System.out.println("Non puoi terminare un film che non hai ancora iniziato babbeo");
        }
    }

}

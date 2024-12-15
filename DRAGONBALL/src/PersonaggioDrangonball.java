import java.util.ArrayList;
import java.util.Random;

public abstract class PersonaggioDrangonball implements Comparable<PersonaggioDrangonball> {

    private final String nome;
    private final String pianetaDiOrigine;
    private Integer puntiVita;
    private Integer forzaFisica;
    private Attakko attakkoFisico;
    private ArrayList<Attakko> listAttakki;
    private Double probSkivaAttakko;
    private Double resistenzaFisica;

    protected PersonaggioDrangonball( String nome,
                                      String pianetaDiOrigine,
                                      Integer puntiVita,
                                      Integer forzaFisica,
                                      Attakko attakkoFisico,
                                      Double probSkivaAttakko,
                                      Double resistenzaFisica) {
        this.nome = nome;
        this.pianetaDiOrigine = pianetaDiOrigine;
        this.puntiVita = puntiVita;
        this.forzaFisica = forzaFisica;
        this.attakkoFisico = attakkoFisico;
        this.listAttakki = new ArrayList<>();
        this.probSkivaAttakko = probSkivaAttakko;
        this.resistenzaFisica = resistenzaFisica;
    }

    public String getNome() {
        return nome;
    }

    public String getPianetaDiOrigine() {
        return pianetaDiOrigine;
    }

    public Integer getPuntiVita() {
        return puntiVita;
    }

    public Integer getForzaFisica() {
        return forzaFisica;
    }

    public Attakko getAttakkoFisico() {
        return attakkoFisico;
    }

    public ArrayList<Attakko> getListAttakki() {
        return listAttakki;
    }

    public Double getProbSkivaAttakko() {
        return probSkivaAttakko;
    }

    public Double getResistenzaFisica() {
        return resistenzaFisica;
    }

    public void setPuntiVita(Integer puntiVita) {
        if(puntiVita < 0){
            this.puntiVita =  0;
        }else if(puntiVita > 10){
            this.puntiVita =  10;
        }
        this.puntiVita = puntiVita;
    }

    public void setForzaFisica(Integer forzaFisica) {
        if(forzaFisica <= 0){
            this.forzaFisica = 1;
        }else if(forzaFisica >= 10){
            this.forzaFisica = 9;
        }
        this.forzaFisica = forzaFisica;
    }

    public void setAttakkoFisico(Attakko attakkoFisico){
        this.attakkoFisico = attakkoFisico;
    }

    public void setListAttakki(ArrayList<Attakko> listAttakki) {
        this.listAttakki = listAttakki;
    }

    public void aggiungiAttakko(Attakko newAttakko){
        listAttakki.add(newAttakko);
    }

    public void setProbSkivaAttakko(Double probSkivaAttakko) {
        if(probSkivaAttakko <= 0){
            this.probSkivaAttakko = 0.10;
        } else if (probSkivaAttakko >= 1) {
            this.probSkivaAttakko = 0.90;
        }
        this.probSkivaAttakko = probSkivaAttakko;
    }

    public void setResistenzaFisica(Double resistenzaFisica) {
        if(resistenzaFisica <= 0){
            this.resistenzaFisica = 0.10;
        } else if (resistenzaFisica >= 1) {
            this.resistenzaFisica = 0.90;
        }
        this.resistenzaFisica = resistenzaFisica;
    }

    Random random = new Random();

    public Attakko scagliaAttacco(){
        int randomValue = random.nextInt(listAttakki.size());
        Attakko attakkoScagliato = listAttakki.get(randomValue);
        System.out.println("Hai usato l'attacco: " + attakkoScagliato.getNome());
        return attakkoScagliato;
    }

    @Override
    public String toString() {
        return  "-----------------------------------------\n" +
                "Caratterisitiche personaggio:\n" +
                "nome:" + nome + "\n" +
                "pianetaDiOrigine:" + pianetaDiOrigine + "\n" +
                "puntiVita:" + puntiVita + "\n" +
                "forzaFisica:" + forzaFisica + "\n" +
                "attakkoFisico:" + attakkoFisico + "\n" +
                "listAttakki:" + listAttakki + "\n" +
                "probSkivaAttakko:" + probSkivaAttakko + "\n" +
                "resistenzaFisica:" + resistenzaFisica + "\n" +
                "-----------------------------------------"
                ;
    }

    @Override
    public int compareTo(PersonaggioDrangonball o){
        if(puntiVita > o.puntiVita){
            System.out.println("Il personaggio " + this.nome + " ha più salute del personaggio " + o.nome);
            return 1;
        }
        if(puntiVita < o.puntiVita){
            System.out.println("Il personaggio " + this.nome + " ha meno salute del personaggio " + o.nome);
            return -1;
        }
        System.out.println("Il personaggio " + this.nome + " ha la stessa salute del personaggio " + o.nome);
        return 0;
    }


}

public class Teknico {

    public String nomeTeknico;
    public int idTeknico;
    public int livelloEsperienza;
    public boolean assegnato = false;

    public Teknico(String nomeTeknico, int idTeknico, int livelloEsperienza ){
        this.nomeTeknico = nomeTeknico;
        this.idTeknico = idTeknico;
        if(livelloEsperienza <= 0){
            //System.out.println("NON PUOI INSERIRE UN NUMERO NEGATIVO COME ESPERIENZA, " +
            //                    "VERRà QUINDI ASSEGNATO IL LIVELLO MINIMO COME ESPERIENZA");
            this.livelloEsperienza = 1;
        }else if(livelloEsperienza > 5){
            this.livelloEsperienza = 5;
        } else{
            this.livelloEsperienza = livelloEsperienza;
        }
    }

    @Override
    public String toString() {
        return "Nome Teknico: " + nomeTeknico +
                "\nCodice Dipendente: " +  idTeknico +
                "\nEsperienza: livello-" + livelloEsperienza + "\n";
    }
}

import java.util.ArrayList;

public class DittaRiparazioni {

    public String nomeDitta;
    public ArrayList<Teknico> listaTeknici;

    public DittaRiparazioni(String nomeDitta){
        this.nomeDitta = nomeDitta;
    }

    @Override
    public String toString(){
        return "Nome ditta: " + nomeDitta +
                "\n Lista teknici attuali: \n" + listaTeknici;
    }

    //METODI PER GESTIRE LA DITTA

    //Creare lista tecnici dopo che l'oggetto ditta è stato creato
    public void creaListaTeknici(ArrayList<Teknico> listaTeknici){
        this.listaTeknici = listaTeknici;
    }
    //Aggiungere un teknico
    public void aggiungiTeknico(ArrayList<Teknico>listaTeknici, Teknico nuovoTeknico){
            for(int i = 0; i < listaTeknici.size(); i++){
                if(nuovoTeknico.idTeknico == listaTeknici.get(i).idTeknico){
                    System.out.println("ERRORE: NON PUOI ASSEGNARE A UN NUOVO TEKNICO UN ID GIà ESISTENTE");
                    return;
                }
            }
            listaTeknici.add(nuovoTeknico);
    }
    //Lista dei tecnici operativi
    public void mostraTeknici(ArrayList<Teknico> listaTeknici){
        System.out.println("LISTA TEKNICI DELLA DITTA:\n" + listaTeknici);
    }

    //Aggiungere una nuova riparazione da fare
    public void aggiungiRiparazione(ArrayList<Riparazioni> listaRiparazioni, Riparazioni nuovaRiparazione){
        listaRiparazioni.add(nuovaRiparazione);
    }
    //Lista delle riparazioni
    public void mostraRiparazioni(ArrayList<Riparazioni> listaRiparazioni){
        System.out.println("LISTA RIPARAZIONI DA EFFETTUARE:\n" + listaRiparazioni);
        System.out.println("RIPARAZIONI TOTALI: " + listaRiparazioni.size());

    }
    //Prossima riparazione in base alla priorità
    public void mostraRiparazioniUrgenti(ArrayList<Riparazioni> listaRiparazioni){
        Riparazioni max = listaRiparazioni.get(0);
        for(int i = 0; i < listaRiparazioni.size(); i++ ){
            if(listaRiparazioni.get(i).prioritaIntervento > max.prioritaIntervento){
                max = listaRiparazioni.get(i);
            }
        }
        System.out.println("PROSSIMA RIPARAZIONE PIù URGENTE:\n" + max);
    }

    //Assegnare una riparazione a un tecnico
    public void setTeknicoRiparazione(Riparazioni riparazioneAssegnata, Teknico teknicoAssegnato){
        if(!teknicoAssegnato.assegnato){
            teknicoAssegnato.assegnato = true;
            System.out.println("LA RIPARAZIONE PRESSO\n" + riparazioneAssegnata.indirizzoIntervento + "\n" +
                    "è STATA ASSEGNATA AL TECNICO\n" +
                    teknicoAssegnato.nomeTeknico + " - Codice Dipendente:" + teknicoAssegnato.idTeknico);
        }
        else {
            System.out.println("IL TECNICO SELEZIONATO è GIà IMPEGNATO IN UN ALTRO LAVORO, SELEZIONA UN ALTRO TECNICO:");
            for (int i = 0; i < listaTeknici.size(); i++) {
                if (!listaTeknici.get(i).assegnato) {  // Se il tecnico non è impegnato
                    System.out.println("Tecnico disponibile: " + listaTeknici.get(i).nomeTeknico +
                                        " - Codice Dipendente: " + listaTeknici.get(i).idTeknico);
                }
            }

        }
    }
    //Marcare una riparazione come conclusa
    public void setRiparazioneConclusa(Riparazioni riparazioneAssegnata, Teknico teknicoAssegnato, ArrayList<Riparazioni> listaRiparazioni){
       riparazioneAssegnata.completata = true;
       teknicoAssegnato.assegnato = false;
       System.out.println("LA RIPARAZIONE PRESSO\n" + riparazioneAssegnata.indirizzoIntervento + "\n" +
                            "ASSEGNATA AL TECNICO\n" +
                            teknicoAssegnato.nomeTeknico + " - Codice Dipendente:" + teknicoAssegnato.idTeknico +
                            "\nè STATA COMPLETATA");
       for(int i = 0; i < listaRiparazioni.size(); i++){
            if (listaRiparazioni.get(i).completata){
                listaRiparazioni.remove(listaRiparazioni.get(i));
            }
       }
       System.out.println("RIPARAZIONI RIMANENTI: " + listaRiparazioni.size());

    }
    //Mandare in ferie in teknici
    //Per il momento nessuna vacanza...andate a lavorare vagabbondi sfadigati


}






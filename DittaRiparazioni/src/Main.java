import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        //DITTA
        DittaRiparazioni myTekCompany = new DittaRiparazioni("JDK-Caldaie");

        //TEKNICI
        Teknico teknico1 = new Teknico("Peppino", 174, 2);
        Teknico teknico2 = new Teknico("Tonino", 195, 5);
        Teknico teknico3 = new Teknico("Lalluccio", 143 , 3);
        Teknico teknico4 = new Teknico("Tonino", 162 , 2);
        Teknico teknico5 = new Teknico("Mariuccio", 158, -10);
        Teknico teknico6 = new Teknico("Gino", 180, 0);
        Teknico teknico7 = new Teknico("Franchino", 181, 100);

        ArrayList<Teknico> listaTekniciDitta = new ArrayList<>();
        myTekCompany.creaListaTeknici(listaTekniciDitta);

        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico1);
        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico2);
        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico3);
        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico4);
        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico5);
        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico6);
        myTekCompany.aggiungiTeknico(listaTekniciDitta, teknico7);

        myTekCompany.mostraTeknici(listaTekniciDitta);

        //RIPARAZIONI
        Riparazioni riparazione1 = new Riparazioni("Via Roma, 23", 10, 146.34);
        Riparazioni riparazione2 = new Riparazioni("Via Bari, 666", 4, 37.98);
        Riparazioni riparazione3 = new Riparazioni("Via Napoli, 11", 8,87.54);
        Riparazioni riparazione4 = new Riparazioni("Via Milano, 54", 6, 65.26);

        ArrayList<Riparazioni> listaRiparazioniDitta = new ArrayList<>();

        myTekCompany.aggiungiRiparazione(listaRiparazioniDitta, riparazione1);
        myTekCompany.aggiungiRiparazione(listaRiparazioniDitta, riparazione2);
        myTekCompany.aggiungiRiparazione(listaRiparazioniDitta, riparazione3);
        myTekCompany.aggiungiRiparazione(listaRiparazioniDitta, riparazione4);

        myTekCompany.mostraRiparazioni(listaRiparazioniDitta);
        myTekCompany.mostraRiparazioniUrgenti(listaRiparazioniDitta);

        //GESTIONE LAVORI DITTA
        myTekCompany.setTeknicoRiparazione(riparazione1,teknico1);
        myTekCompany.setTeknicoRiparazione(riparazione2,teknico2);
        myTekCompany.setTeknicoRiparazione(riparazione3,teknico2);
        myTekCompany.setTeknicoRiparazione(riparazione3,teknico3);

        myTekCompany.setRiparazioneConclusa(riparazione1, teknico1 , listaRiparazioniDitta);
        myTekCompany.setRiparazioneConclusa(riparazione2, teknico2 , listaRiparazioniDitta);
        myTekCompany.setRiparazioneConclusa(riparazione3, teknico3 , listaRiparazioniDitta);

        myTekCompany.setTeknicoRiparazione(riparazione4, teknico1);
        myTekCompany.setRiparazioneConclusa(riparazione4, teknico1 , listaRiparazioniDitta);










    }

}

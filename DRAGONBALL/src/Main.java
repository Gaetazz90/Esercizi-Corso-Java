public class Main {


    public static void main(String[] args) {

        //ATTACCHI

        Attakko attakkoSayan1 = new Attakko("Onda Energetica", 5, 0.5);
        Attakko attakkoSayan2 = new Attakko("Energia Sferica", 9, 0.9);
        Attakko attakkoSayan3 = new Attakko("Masenko", 7, 0.7);
        Attakko attakkoFisicoSayan1 = new Attakko("Pugno", 0, 0.6);
        Attakko attakkoFisicoSayan2 = new Attakko("Calcio", 0, 0.6);

        Attakko attakkoNamecciano1 = new Attakko("Telecinesi", 4, 0.4);
        Attakko attakkoNamecciano2 = new Attakko("Cannone Speciale", 6, 0.6);
        Attakko attakkoFisicoNamecciano = new Attakko("Gomitata", 0, 0.6);

        Attakko attakkoAlieno1 = new Attakko("Raggio della morte", 6, 0.6);
        Attakko attakkoAlieno2 = new Attakko("Supernova", 8, 0.8);
        Attakko attakkoFisicoAlieno = new Attakko("Testata", 0, 0.6);

        Attakko attakkoCyborg1 = new Attakko("Onda Energetica Copiata", 5, 0.5);
        Attakko attakkoCyborg2 = new Attakko("Cannone Speciale Copiato", 6, 0.6);
        Attakko attakkoFisicoCyborg = new Attakko("Ginocchiata", 0, 0.6);

        Attakko attakkoDemone1 = new Attakko("Raggio di Cioccolato", 6, 0.6);
        Attakko attakkoDemone2 = new Attakko("Palla svanente", 8, 0.8);
        Attakko attakkoFisicoDemone = new Attakko("Schiacciata", 0, 0.6);

        //PERSONAGGI

        Sayan sayan1 = new Sayan("Goku", "Pianeta Vegeta", 10, 9, attakkoFisicoSayan1 ,0.90, 0.90);
        sayan1.aggiungiAttakko(attakkoSayan1);
        sayan1.aggiungiAttakko(attakkoSayan2);
        attakkoFisicoSayan1.setDanno(sayan1.getForzaFisica());

        Sayan sayan2 = new Sayan("GohanBambino", "Pianeta Vegeta", 3, 3, attakkoFisicoSayan2 ,0.3, 0.3);
        sayan2.aggiungiAttakko(attakkoSayan1);
        sayan2.aggiungiAttakko(attakkoSayan3);
        attakkoFisicoSayan2.setDanno(sayan2.getForzaFisica());

        Namecciano namecciano = new Namecciano("Piccolo", "Pianeta Namek", 4, 4, attakkoFisicoNamecciano ,0.4, 0.4);
        namecciano.aggiungiAttakko(attakkoNamecciano1);
        namecciano.aggiungiAttakko(attakkoNamecciano2);
        attakkoFisicoNamecciano.setDanno(namecciano.getForzaFisica());

        Alieno alieno = new Alieno("Freezer", "Pianeta Freezer", 6, 5, attakkoFisicoAlieno ,0.5, 0.5);
        alieno.aggiungiAttakko(attakkoAlieno1);
        alieno.aggiungiAttakko(attakkoAlieno2);
        attakkoFisicoAlieno.setDanno(alieno.getForzaFisica());

        Cyborg cyborg = new Cyborg("Cell", "Pianeta Terra", 8, 7, attakkoFisicoCyborg,0.7, 0.7);
        cyborg.aggiungiAttakko(attakkoCyborg1);
        cyborg.aggiungiAttakko(attakkoCyborg2);
        attakkoFisicoCyborg.setDanno(cyborg.getForzaFisica());

        Demone demone = new Demone("MajinBuu", "Regno Demoniaco", 10, 9, attakkoFisicoDemone ,0.9, 0.9);
        demone.aggiungiAttakko(attakkoDemone1);
        demone.aggiungiAttakko(attakkoDemone2);
        attakkoFisicoDemone.setDanno(demone.getForzaFisica());

        System.out.println(sayan1);
        System.out.println(sayan2);
        System.out.println(namecciano);
        System.out.println(alieno);
        System.out.println(cyborg);
        System.out.println(demone);

        namecciano.compareTo(sayan2);
        alieno.compareTo(cyborg);
        sayan1.compareTo(demone);

        //COMBATTIMENTO

        Combattimento combattimento = new Combattimento("Torneo Tenkaichi");

        combattimento.aggiungiCombattente(sayan1);
        combattimento.aggiungiCombattente(sayan2);
        combattimento.aggiungiCombattente(namecciano);
        combattimento.aggiungiCombattente(alieno);
        combattimento.aggiungiCombattente(cyborg);
        combattimento.aggiungiCombattente(demone);

        combattimento.combatti();


    }


}
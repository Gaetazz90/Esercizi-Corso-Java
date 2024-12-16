import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Combattimento {

    private String nome;
    private ArrayList<PersonaggioDrangonball> listaCombattenti;

    public Combattimento(String nome){
        this.nome = nome;
        this.listaCombattenti = new ArrayList<>();
    }

    public ArrayList<PersonaggioDrangonball> getListaCombattenti() {
        return listaCombattenti;
    }

    public void aggiungiCombattente(PersonaggioDrangonball personaggio){
        this.listaCombattenti.add(personaggio);
    }

    public String stampaListaCombattenti(){
        String stringListaPersonaggi = " Personaggi disponibili:\n";
        for (PersonaggioDrangonball p : listaCombattenti) {
            stringListaPersonaggi += p.getNome() + "\n";
        }
        return stringListaPersonaggi;
    }

    //METODI PER GESTIRE IL COMBATTIMENTO

    Random random = new Random();

    public void combatti(){

        //SCELGO IL MIO PERSONAGGIO
        PersonaggioDrangonball combattente1 = null;
        boolean trovato = false;
        Scanner scanner = new Scanner(System.in);
        while(!trovato){
            System.out.println("Scegli un personaggio dalla lista:\n" + stampaListaCombattenti());
            String nomePersonaggio1 = scanner.next();
            for (PersonaggioDrangonball p : listaCombattenti) {
                if (nomePersonaggio1.equals(p.getNome())) {
                    combattente1 = p;
                    trovato = true;
                    System.out.println("Hai scelto il personaggio: " + combattente1.getNome());
                    break;
                }
            }
            if(!trovato){
                System.out.println("Personaggio inesistente...riprova");
            }
        }

        //SCELGO UN AVVERSARIO CASUALE
        PersonaggioDrangonball combattente2 = null;
        int randomValue = -1;
        while(combattente2 == null){
            randomValue = random.nextInt(listaCombattenti.size());
            if(randomValue == listaCombattenti.indexOf(combattente1)){
                continue;
            }
            combattente2 = listaCombattenti.get(randomValue);
            break;
        }
        System.out.println("Il tuo avversario sarà personaggio: " + combattente2.getNome());

        //INIZIO IL COMBATTIMENTO
        while (combattente1.getPuntiVita() > 0 && combattente2.getPuntiVita() > 0){
            //TURNO COMBATTENTE 1
            Attakko attakkoCombattente1 = combattente1.scagliaAttacco();
            double probAttakkoASegno1 = attakkoCombattente1.getProbSuccessoAttakko() * combattente2.getProbSkivaAttakko();
            double danno1 = 0.00;
            if(probAttakkoASegno1 > 0.5){
                danno1 = attakkoCombattente1.getDanno() * combattente2.getResistenzaFisica();
                System.out.println("Hai inflitto un danno pari a " + danno1);
            }
            else{
                System.out.println("Hai mancato l'attaco");
            }
            combattente2.setPuntiVita( (int) (combattente2.getPuntiVita() - danno1));

            //TURNO COMBATTENTE 2
            Attakko attakkoCombattente2 = combattente2.scagliaAttacco();
            double probAttakkoASegno2 = attakkoCombattente2.getProbSuccessoAttakko() * combattente1.getProbSkivaAttakko();
            double danno2 = 0.00;
            if(probAttakkoASegno2 > 0.5){
                danno2 = attakkoCombattente2.getDanno() * combattente1.getResistenzaFisica();
                System.out.println("L'avversario ti ha inflitto un danno pari a " + danno2);
            }
            else{
                System.out.println("L'avversario ha mancato l'attaco");
            }
            combattente1.setPuntiVita( (int) (combattente1.getPuntiVita() - danno2));

            //TERMINA LO SCONTRO
            if (combattente1.getPuntiVita() <= 0) {
                System.out.println("Hai perso! " + combattente1.getNome() + " è stato sconfitto.");
                break;
            }
            else if (combattente2.getPuntiVita() <= 0) {
                System.out.println("Hai vinto! " + combattente2.getNome() + " è stato sconfitto.");
            }


        }



    }


}












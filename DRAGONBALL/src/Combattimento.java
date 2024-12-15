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

        //SCAGLIO UN ATTACCO RANDOM
        Attakko attakkoCombattente1 = combattente1.scagliaAttacco();
        //CALCOLO LA PROBABILITà CHE L 'ATTACCO VADA A SEGNO
        double probAttakkoASegno = attakkoCombattente1.getProbSuccessoAttakko() * combattente2.getProbSkivaAttakko();
        System.out.println(probAttakkoASegno);
        //CALCOLO IL DANNO
        double danno = 0.00;
        if(probAttakkoASegno > 0.5){
            danno = attakkoCombattente1.getDanno() * combattente2.getResistenzaFisica();
            System.out.println("Hai inflitto un danno pari a " + danno);
        }
        //RIDUCO I PUNTI VITA
        combattente2.setPuntiVita( (int) (combattente2.getPuntiVita() - danno));
        if (combattente2.getPuntiVita() == 0){
            System.out.println("Hai vinto");
        }else{
            System.out.println("Lo scontro non è terminato...continua a combattere");
        }

    }










}

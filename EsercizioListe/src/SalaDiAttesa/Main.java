package SalaDiAttesa;

public class Main {

    public static void main(String[] args){

        SalaDiAttesa<String, Integer> prontoSoccorso = new SalaDiAttesa<String, Integer>();
        System.out.println(prontoSoccorso);

        prontoSoccorso.aggiungiNuovoCliente("Riccardo Lomuscio", 10085);
        prontoSoccorso.aggiungiNuovoCliente("Vincenzo Losappio", 10072);
        prontoSoccorso.aggiungiNuovoCliente("Giovanni Lorusso", 10039);
        System.out.println(prontoSoccorso);

        prontoSoccorso.rimuoviPrimoCliente();
        System.out.println(prontoSoccorso);


    }

}

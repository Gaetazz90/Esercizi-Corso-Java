package SalaDiAttesa;

import java.util.UUID;

public class SalaDiAttesa<T,S> {

    private static class Cliente<T,S>{
        T nome;
        S codiceCliente;

        Cliente<T,S> nextCliente;

        Cliente(T nome, S codiceCliente ){
            this.nome = nome;
            this.codiceCliente = codiceCliente;
        }

        public T getNome() {
            return nome;
        }

        public S getCodiceCliente() {
            return codiceCliente;
        }
    }

    Cliente<T,S> primoCliente;


    public void aggiungiNuovoCliente(T nome, S codiceCliente){
        //Se non c'è nessun cliente in lista...allora il nuovo cliente sarà il primo della lista
        Cliente<T,S> nuovoCliente = new Cliente<>(nome, codiceCliente);
        if (primoCliente == null){
            primoCliente = nuovoCliente;
            return;
        }
        //Adesso il discorso è un pò diverso dalla LIFO...
        /*
            perchè nella Lifo il nuovo elemento veniva inserito sempre in cima alla lista, quindi il resto della lista non mi interessa
            qua invece devo partire dal primo elemento e arrivare fino all'ultimo, prima di aggiungerne uno nuovo
            quindi dovrò dirgli: finchè un cliente ha un successore...vai al cliente successivo
            quando il cliente in lista non avrà più successori,allora il nuovo cliente me lo imposti come successore dell'ultimo.
        */
        Cliente<T,S> clienteInLista = primoCliente;
        while(clienteInLista.nextCliente != null){
            clienteInLista = clienteInLista.nextCliente;
        }
        clienteInLista.nextCliente = nuovoCliente;

    }

    public S rimuoviPrimoCliente() {
        if (primoCliente == null) {
            System.out.println("Lista clienti vuota...nessun cliente da rimuovere");
            return null;
        }
        S codicePrimoCliente = primoCliente.getCodiceCliente();
        primoCliente = primoCliente.nextCliente;
        return codicePrimoCliente;
    }

    @Override
    public String toString() {
        String listaClienti = "";
        if(primoCliente == null){
            return "Lista vuota";
        }
        Cliente<T,S> clienteInLista = primoCliente;
        while(clienteInLista != null){
            listaClienti += "Nome Cliente: " + clienteInLista.getNome() + ", \n";
            clienteInLista = clienteInLista.nextCliente;
        }
        return listaClienti.substring(0, listaClienti.length() - 2);
    }
}

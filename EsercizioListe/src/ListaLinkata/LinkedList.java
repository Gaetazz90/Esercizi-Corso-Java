package ListaLinkata;


public class LinkedList<T> {

    private static class Elemento <T> {
        T valore;
        Elemento<T> prossimo;

        public Elemento(T valore) {
            this.valore = valore;
            this.prossimo = null;
        }
    }

    Elemento<T> testa;

    public void addFirst(T valore){
        Elemento<T> nuovoElemento = new Elemento<>(valore);
        nuovoElemento.prossimo = testa;
        testa = nuovoElemento;
    }

    public T removeFirst(){
        if(testa == null){
            System.out.println("Coda vuota, hai rimosso già tutto");
            return null;
        }
        T vecchiaTesta = testa.valore;
        testa = testa.prossimo;
        return vecchiaTesta;
    }

}


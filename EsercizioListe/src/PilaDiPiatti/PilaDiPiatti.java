package PilaDiPiatti;


public class PilaDiPiatti<T> {

    private static class Elemento <T> {
        T valore;
        Elemento<T> precedente;

        public Elemento(T valore) {
            this.valore = valore;
            this.precedente = null;
        }

    }

    Elemento<T> cima;


    public void push(T valore){
        Elemento<T> nuovoElemento = new Elemento<T>(valore);
        nuovoElemento.precedente = cima;
        cima = nuovoElemento;
    }

    public T peek () {
        if(cima == null){
            System.out.println("Pila vuota, hai rimosso già tutto");
            return null;
        }
        T valoreCima = cima.valore;
        return valoreCima;
    }

    public T pop () {
        if(cima == null){
            System.out.println("Pila vuota, hai rimosso già tutto");
            return null;
        }
        T vecchiaCima = cima.valore;
        cima = cima.precedente;
        return vecchiaCima;
    }
    
}

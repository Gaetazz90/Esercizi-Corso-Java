package PilaDiPiatti;

public class PilaDiPiatti<T> {

    private  static class Piatto<T> {
        T value;
        Piatto<T> nextValue;

        public Piatto(T value) {
            this.value = value;
            this.nextValue = null;
        }
    }

    Piatto<T> firstPiatto;

    public void push(T value){
        Piatto<T> newPiatto = new Piatto<>(value);
        newPiatto.nextValue = firstPiatto;
        firstPiatto = newPiatto;
    }
    public T peek(){
        if(firstPiatto == null){
            System.out.println("Pila di piatti vuota");
            return null;
        }
         T head = firstPiatto.value;
         return head;
    }
    public T pop(){
        if(firstPiatto == null){
            System.out.println("Hai pulito tutti i piatti, non c'è niente da rimuovere");
            return null;
        }
        T oldHead = firstPiatto.value;
        firstPiatto = firstPiatto.nextValue;
        return oldHead;

    }

    @Override
    public String toString() {
        String stringPiatti = " { ";
        Piatto<T> currentElement = firstPiatto;
        if (firstPiatto == null){
            System.out.println("Pila di piatti vuota");
        }
        while(currentElement != null){
            stringPiatti += currentElement.value + ",";
            currentElement = currentElement.nextValue;
        }
        return stringPiatti.substring(0, stringPiatti.length()-1) + " }";
    }
}

package ListaLinkata;

public class LinkedList<T> {

    private static class Elemento<T> {
        T value;

        Elemento<T> nextValue;

        public Elemento(T value){
            this.value = value;
            this.nextValue = null;
        }

    }

    private Elemento<T> firstNode;

    public void addFirst(T value){
        //Procedimento:
        /*
        1.Creo un nuovo oggetto Elemento (newValue), che ha come valore il parametro di tipo T passato in input dalla funzione.
        2.Assegni a newValue.nextValue l'attuale testa della lista, che è firstNode.
        In altre parole, stai dicendo al nuovo nodo che il suo successore sarà il nodo che prima era il primo...cioè la vecchia testa
        (Quindi il vecchio primo della lista diventa il nuovo secondo della lista...)
        3.Imposti firstNode al nuovo Elemento newValue, quindi il nuovo nodo diventa il primo elemento della lista...la nuovatesta
         */
        Elemento<T> newValue = new Elemento<>(value);
        newValue.nextValue = firstNode;
        firstNode = newValue;
    }

    //Procedimento:
        /*
        1.Prima di rimuovere un elemento, controllo se la lista è vuota e quindi non ci sono elementi da eliminare
        2.Poi imposto il secondo nodo della lista come nuovatesta...e basta.
        3.Per tenere traccia però dell'elemento rimosso(la vecchiatesta), è meglio salvarmi il suo valore e ritornalo...
         */
    public T removeFirst(){
        if(firstNode == null){
            System.out.println("La lista è già vuota non puoi rimuovere niente!");
            return null;
        }
        T oldFirstNode = firstNode.value;
        firstNode = firstNode.nextValue;
        return oldFirstNode;
    }


    @Override
    public String toString() {
        if (firstNode == null) {
            return "Lista vuota";
        }
        String stringList = "{ ";
        Elemento<T> currentElement = firstNode;
        while (currentElement != null){
                stringList += currentElement.value + " , ";
                currentElement = currentElement.nextValue;
        }

        return stringList.substring(0, stringList.length()-2) + "}";
    }
}


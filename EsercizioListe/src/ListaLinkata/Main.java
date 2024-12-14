package ListaLinkata;

public class Main {


    public static void main(String[] args) {

        LinkedList<Integer> lista1 = new LinkedList<>();
        System.out.println(lista1);

        lista1.addFirst(5);
        lista1.addFirst(4);
        lista1.addFirst(3);
        lista1.addFirst(2);
        lista1.addFirst(1);
        lista1.addFirst(0);
        System.out.println(lista1);

        lista1.removeFirst();
        System.out.println(lista1);
        lista1.removeFirst();
        lista1.removeFirst();
        lista1.removeFirst();
        lista1.removeFirst();
        lista1.removeFirst();
        System.out.println(lista1);
        lista1.removeFirst();




    }


}
package Esempi;

public class CoppiaGenerica<T> {

    private T elemento1;
    private T elemento2;

    public CoppiaGenerica(T elemento1, T elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;

    }

    public T getElemento1() {
        return elemento1;
    }

    public T getElemento2() {
        return elemento2;
    }

    @Override
    public String toString() {
        return "CoppiaGenerica{" +
                "elemento1=" + elemento1 +
                ", elemento2=" + elemento2 +
                '}';
    }


}

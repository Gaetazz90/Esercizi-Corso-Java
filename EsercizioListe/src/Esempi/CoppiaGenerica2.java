package Esempi;

public class CoppiaGenerica2<T,S> {

    private T elementoTipo1;
    private S elementoTipo2;

    public CoppiaGenerica2(T elementoTipo1, S elementoTipo2) {
        this.elementoTipo1 = elementoTipo1;
        this.elementoTipo2 = elementoTipo2;
    }

    public T getElementoTipo1() {
        return elementoTipo1;
    }

    public S getElementoTipo2() {
        return elementoTipo2;
    }

    @Override
    public String toString() {
        return "CoppiaGenerica2{" +
                "elementoTipo1=" + elementoTipo1 +
                ", elementoTipo2=" + elementoTipo2 +
                '}';
    }


}

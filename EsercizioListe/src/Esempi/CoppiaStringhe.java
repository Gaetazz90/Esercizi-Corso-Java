package Esempi;

public class CoppiaStringhe{

    private String stringA;
    private String stringB;

    public CoppiaStringhe(String stringA, String stringB) {
        this.stringA = stringA;
        this.stringB = stringB;
    }

    public String getStringA() {
        return stringA;
    }

    public String getStringB() {
        return stringB;
    }

    @Override
    public String toString() {
        return "CoppiaStringhe{" +
                "stringA='" + stringA + '\'' +
                ", stringB='" + stringB + '\'' +
                '}';
    }
}

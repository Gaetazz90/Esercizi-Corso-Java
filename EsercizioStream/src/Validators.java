public class Validators {

    public static void requireNotNullNotBlank(Object input){
        if (input == null){
            throw new NullPointerException("L'input inserito non può essere null");
        }
        if (input instanceof String && ((String) input).isBlank()){
            throw new IllegalArgumentException("La stringa inserita non può essere blank");
        }
    }

    public static void requireBiggerThan(Double d1, Double d2){
        if(d1 < d2){
            throw new IllegalArgumentException("L'input" + d1 + "inserito non può essere minore di " + d2);
        }
    }


}

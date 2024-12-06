public class Anagramma2 {
    public static void anagramma2(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            System.out.println("Non Anagramma");
            return;
        }

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        boolean match = false;
        for(int i = 0; i < arrayA.length; i++){
            for(int j = 0; j < arrayB.length; j++){
                if(arrayA[i] == arrayB[j]){
                    arrayB[j] = '='; //elimino il carattere dove c'è corrispondenza
                    match = true;
                    break;

                }
            }
            if(match == false){
                System.out.println("Non Anagramma");
                return;
            }
        }

        System.out.println("Anagramma");
    }

    public static void main(String[] args){
        anagramma2("Anna", "Nano");
    }
}
//Non ho capito perchè l'if (match == false) va dentro il ciclo...pensavo andasse fuori come System.out.println("Anagramma");
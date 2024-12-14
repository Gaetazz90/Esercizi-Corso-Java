package Esempi;

public class Main {

    public static void main(String[] args){
        CoppiaInteri coppiaInteri1 = new CoppiaInteri(10,20);
        CoppiaStringhe coppiaStringhe1 = new CoppiaStringhe("Tazz", "One");
        CoppiaStringInt coppiaStringInt1 = new CoppiaStringInt(7, "Giugno");

        CoppiaGenerica<Integer> coppiaGenerica1 = new CoppiaGenerica<>(1,2);
        CoppiaGenerica<String> coppiaGenerica2 = new CoppiaGenerica<>("Gae", "Tano");
        CoppiaGenerica<Boolean> coppiaGenerica3 = new CoppiaGenerica<>(true, false);
        CoppiaGenerica2<Integer, String> coppiaGenerica4 = new CoppiaGenerica2<>(13, "Dicembre");
        CoppiaGenerica<?> coppiaGenerica5 = new CoppiaGenerica<>(10, 5);
        System.out.println(coppiaGenerica5);
        coppiaGenerica5 = new CoppiaGenerica<>("Bella", "zio");
        System.out.println(coppiaGenerica5);
        coppiaGenerica5 = new CoppiaGenerica<>(true, 5.78);
        System.out.println(coppiaGenerica5);

        System.out.println(coppiaInteri1);
        System.out.println(coppiaStringhe1);
        System.out.println(coppiaStringInt1);
        System.out.println(coppiaGenerica1);
        System.out.println(coppiaGenerica2);
        System.out.println(coppiaGenerica3);
        System.out.println(coppiaGenerica4);

//        coppiaInteri1 = coppiaStringhe1;
//        coppiaGenerica1 = coppiaInteri1;
//        coppiaGenerica1 = coppiaGenerica2;
//        coppiaGenerica1 = new CoppiaGenerica<>("Bella", "Zio");
    }


}

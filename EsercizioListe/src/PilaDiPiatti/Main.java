package PilaDiPiatti;

public class Main {


    public static void main(String[] args){

        PilaDiPiatti<Integer> myPilaDiPiattiSporchi = new PilaDiPiatti<Integer>();

        myPilaDiPiattiSporchi.push(1);
        myPilaDiPiattiSporchi.push(2);
        myPilaDiPiattiSporchi.push(3);
        myPilaDiPiattiSporchi.push(4);
        myPilaDiPiattiSporchi.push(5);
        myPilaDiPiattiSporchi.push(6);
        myPilaDiPiattiSporchi.push(7);
        myPilaDiPiattiSporchi.push(8);
        myPilaDiPiattiSporchi.push(9);
        myPilaDiPiattiSporchi.push(10);

        System.out.println(myPilaDiPiattiSporchi);

        System.out.println(myPilaDiPiattiSporchi.peek());

        myPilaDiPiattiSporchi.pop();
        System.out.println(myPilaDiPiattiSporchi);
        System.out.println(myPilaDiPiattiSporchi.peek());

        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        myPilaDiPiattiSporchi.pop();
        System.out.println(myPilaDiPiattiSporchi);
        System.out.println(myPilaDiPiattiSporchi.peek());

        myPilaDiPiattiSporchi.pop();





    }


}

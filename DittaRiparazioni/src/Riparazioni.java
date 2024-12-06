public class Riparazioni {

    public String indirizzoIntervento;
    public int prioritaIntervento;
    public double preventivoIntervento;
    public boolean completata = false;

    public Riparazioni(String indirizzoIntervento, int prioritaIntervento, double preventivoIntervento ){
        this.indirizzoIntervento = indirizzoIntervento;
        if(prioritaIntervento <= 0){
            //System.out.println("NON PUOI INSERIRE UN NUMERO NEGATIVO COME PRIORITà");
            this.prioritaIntervento = 1;
        }else if(prioritaIntervento > 10){
            this.prioritaIntervento = 10;
        } else{
            this.prioritaIntervento = prioritaIntervento;
        }
        this.preventivoIntervento = preventivoIntervento;
    }

    @Override
    public String toString() {
        return "Indirizzo chiamata: " + indirizzoIntervento +
                "\nPriorità: " +
                prioritaIntervento + "\nPreventivo: " +
                preventivoIntervento + "\n";
    }
}

import java.util.ArrayList;

public abstract class Buoni extends PersonaggioDrangonball {


    protected Buoni(String nome, String pianetaDiOrigine, Integer puntiVita, Integer forzaFisica, Attakko attakkoFisico, Double probSkivaAttakko, Double resistenzaFisica) {
        super(nome, pianetaDiOrigine, puntiVita, forzaFisica, attakkoFisico, probSkivaAttakko, resistenzaFisica);
    }

    public void salvaIlPianeta(){
        System.out.println("Salvate il pianeta e proteggete gli umani!!!");
    }

}

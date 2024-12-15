import java.util.ArrayList;

public abstract class Cattivi extends PersonaggioDrangonball{


    protected Cattivi(String nome, String pianetaDiOrigine, Integer puntiVita, Integer forzaFisica, Attakko attakkoFisico, Double probSkivaAttakko, Double resistenzaFisica) {
        super(nome, pianetaDiOrigine, puntiVita, forzaFisica, attakkoFisico, probSkivaAttakko, resistenzaFisica);
    }

    public void distruggiIlPianeta(){
        System.out.println("Distruggete il pianeta e sterminate gli umani!!!");
    }

}

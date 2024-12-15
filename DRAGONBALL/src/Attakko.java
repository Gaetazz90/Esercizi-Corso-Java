public class Attakko {

    private final String nome;
    private  Integer danno;
    private  Double probSuccessoAttakko;

    public Attakko(String nome, Integer danno, Double probSuccessoAttakko) {
        this.nome = nome;
        if (danno <= 0) {
            this.danno = 1;
        } else if (danno >= 10) {
            this.danno = 9;
        } else {
            this.danno = danno;
        }
        if (probSuccessoAttakko <= 0) {
            this.probSuccessoAttakko = 0.10;
        } else if (probSuccessoAttakko >= 1) {
            this.probSuccessoAttakko = 0.9;
        } else {
            this.probSuccessoAttakko = probSuccessoAttakko;
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getDanno() {
        return danno;
    }

    public Double getProbSuccessoAttakko() {
        return probSuccessoAttakko;
    }

    public void setDanno(Integer danno) {
        this.danno = danno;
    }

    public void setProbSuccessoAttakko(Double probSuccessoAttakko) {
        this.probSuccessoAttakko = probSuccessoAttakko;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + ", " +
                "danno=" + danno + ", " +
                "probSuccessoAttakko=" + probSuccessoAttakko;
    }
}

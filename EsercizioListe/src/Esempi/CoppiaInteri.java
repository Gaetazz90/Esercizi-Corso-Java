package Esempi;

public class CoppiaInteri {

    private Integer x;
    private Integer y;

    public CoppiaInteri(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "CoppiaInteri{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

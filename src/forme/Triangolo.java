package forme;

public class Triangolo extends Forma {

    private double base;
    private double altezza;

    public Triangolo(double b, double a) {
        this.base = b;
        this.altezza = a;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltezza() {
        return this.altezza;
    }

}

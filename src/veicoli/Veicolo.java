package veicoli;

//superclasse
public class Veicolo {

    private String marca;
    private String modello;
    private double velocitaMax;

    public Veicolo() {
        this.marca = "";
        this.modello = "";
        this.velocitaMax = 0.0;
    }

    //overload
    public Veicolo(String ma, String mo, double v) {
        this.marca = ma;
        this.modello = mo;
        this.velocitaMax = v;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String m) {
        this.modello = m;
    }

    public double getVelocitaMax() {
        return velocitaMax;
    }

    public void setVelocitaMax(double velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

    //metodo toString per stampare il veicolo
    @Override
    public String toString() {
        return "Il tuo veicolo è un: "+marca+", modello: "+modello+" avente velocità max pari a "+velocitaMax +"km/h";
    }



}

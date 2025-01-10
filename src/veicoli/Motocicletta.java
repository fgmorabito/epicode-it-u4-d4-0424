package veicoli;

public class Motocicletta extends Veicolo {

    //estende veicoli, quindi avrà già marca, modello e la velocità max

    private boolean cavalletto;

    //costruttore
    public Motocicletta() {
        super();    //invocando in maniera esplicita il costruttore della superclasse
        this.cavalletto = true;
    }

    //overload: costruttore con tutti gli attributi
    public Motocicletta(String m, String mod, double velM, boolean cav) {
        super(m,mod,velM);
        this.cavalletto = cav;
    }

    public boolean hasCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }

    @Override
    public String toString() {
        //la moto è un veicolo
        //quindi stampo le informaizoni del veicolo (superclasse)
        //aggiungo le info specifiche della motocicletta in questione

        return super.toString() + " è una motocicletta, cavalletto ? " + cavalletto;
    }
}

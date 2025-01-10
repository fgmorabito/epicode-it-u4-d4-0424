package interfacce;

public class Motocicletta implements Veicolo {

    private String marca;
    private String modello;

    public Motocicletta(String m, String mod) {
        this.marca = m;
        this.modello = mod;
    }

    @Override
    public void avvia() {   //avvia obbligato dalla interf
        System.out.println("Moto avviata");
    }

    //ho una motocicletta che si avvia ANCHE con la "pedivella"
    //OVERLOAD
    public void avvia(boolean pedivella) {
        if (pedivella)
            System.out.println("mannaggia, oggi partenza problematica");
    }

    @Override
    public void ferma() {
        System.out.println("Moto ferma");

    }
}

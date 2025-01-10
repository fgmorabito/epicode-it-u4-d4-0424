package interfacce;

public class Automobile implements Veicolo {

    private String marca;
    private String modello;
    private int numeroPorte;

    public Automobile(String marca, String modello, int numeroP) {
        this.marca = marca;
        this.modello = modello;
        this.numeroPorte = numeroP;
    }

    @Override
    public void avvia() {
        System.out.println("Automobile messa in moto");
    }

    @Override
    public void ferma() {
        System.out.println("Automobile spenta");
    }

}

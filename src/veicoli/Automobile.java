package veicoli;
/*
* definisco una sottoclasse Automobile
* estende attributi e metodi di Veicolo (superclasse)
* e può definire nuovi metodi o fare overloading o override di metodi già esistenti
*
 */
public class Automobile extends Veicolo {

    private int numeroPorte;

    /*
    *Automobile è comunque un veicolo, quindi ha
    * marca, modello, velocità max, numero porte
    */

    public Automobile(String ma, String mo, double v, int numeroP) {
        //attenzione all ordine gerarchico delle chiamate (prima super e poi i miei attributi)
        super(ma,mo,v);
        this.numeroPorte = numeroP;
    }

    //overload d esempio
    public Automobile() {
        super();
        this.numeroPorte = 4; //ipotesi 4 porte
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String toString() {
        //debbo restituire una stringa con tutte le info della mia automobile
        //le info del veicolo + il numero di porte
        //super.toString() chiama il toString della superclasse (Veicolo) => Stringa
        return super.toString() + " , è un Automobile con numero di porte pari a " + numeroPorte;

    }


}

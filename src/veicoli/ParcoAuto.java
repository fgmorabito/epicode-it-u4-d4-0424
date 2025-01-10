package veicoli;

public class ParcoAuto {

    public static void main(String[] args) {

        Automobile autoDiFrancesco = new Automobile("Fiat", "Panda", 160.0, 4);
        System.out.println(autoDiFrancesco);

        Motocicletta motoDiMaria = new Motocicletta("Honda", "CBR600", 220.0, true);
        System.out.println(motoDiMaria);

        Veicolo veicoloDiLuisa = new Veicolo();
        System.out.println(veicoloDiLuisa);

        System.out.println();


        //polimorfismo: creando un'istanza di Automobile usando il suo supertipo trattandola quindi come Veicolo

        //se e solo se Veicolo è supertipo (superclasse) di Automobile)
        Veicolo veicoloDiLuigi = new Automobile("Fiat", "500", 180.0, 4);

        System.out.println(veicoloDiLuigi); //in compilazione non sa chi chiamare
        //a run time JVM potrà risolvere (capire) il tipo (cos'è) veicoloDiLuigi e chiamare quind il toString() corretto
        //cosa uscirà sulla console?
        //toString di Automobile ?



        //voglio verificare se veicolo di luigi è effettivamente un'automobile

        if(veicoloDiLuigi instanceof Automobile)    //viene risolto a runtime
            System.out.println("Veicolo di Luigi è un automobile");

        if(motoDiMaria instanceof  Veicolo)
            System.out.println("la moto di Maria è un veicolo");





    }
}

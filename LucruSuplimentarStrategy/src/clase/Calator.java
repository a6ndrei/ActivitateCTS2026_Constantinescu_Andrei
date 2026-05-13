package clase;

public class Calator {

    private String nume;
    private ModalitatePlata modalitatePlata;

    public Calator(String nume) {
        this.nume = nume;

    }

    public void setModalitatePlata(ModalitatePlata modalitate){
        this.modalitatePlata = modalitate;
    }

    public void platesteTranzactie(double suma){
        modalitatePlata.plateste(nume,suma);
    }
}

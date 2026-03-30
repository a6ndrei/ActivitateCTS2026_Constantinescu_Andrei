package simplefactory.clase.bautura;

public class Cafea implements Bautura {
    private String nume;
    private float volum;
    private float pret;

    public Cafea(String nume, float volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getVolum() {
        return volum;
    }

    public float getPret() {
        return pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }


    @Override
    public void afiseazaComanda() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comanda de cafea a fost plasata de ");
        sb.append(this.nume);
        sb.append(" si are volumul: ");
        sb.append(this.volum);
        sb.append(" si a costat: ");
        sb.append(this.pret);
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}

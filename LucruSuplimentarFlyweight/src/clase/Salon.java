package clase;

public class Salon {

    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public Salon(int nrZileSpitalizare, int nrPat, int nrSalon) {
        this.nrZileSpitalizare = nrZileSpitalizare;
        this.nrPat = nrPat;
        this.nrSalon = nrSalon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileSpitalizare=").append(nrZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}

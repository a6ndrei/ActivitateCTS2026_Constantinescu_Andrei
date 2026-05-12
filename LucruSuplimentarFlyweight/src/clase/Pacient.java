package clase;

public class Pacient implements IPacient{
    private String nume;
    private int nrTelefon;
    private String adresa;

    public Pacient(String nume, int nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void interneaza(Salon salon) {
        System.out.println("Pacientul "+this.nume+" S-a internat"+" la salonul "+salon);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

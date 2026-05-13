package clase;

public class Rezervare implements Command{
    private Masa masa;

    public Rezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezerva();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("masa=").append(masa);
        sb.append('}');
        return sb.toString();
    }
}

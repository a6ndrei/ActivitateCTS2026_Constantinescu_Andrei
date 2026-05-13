package clase;

public class Bilet implements IBilet{
    private String text;

    public Bilet(String text) {
        this.text = text;
    }

    @Override
    public void afiseaza() {
        System.out.println(this.text);
    }
}

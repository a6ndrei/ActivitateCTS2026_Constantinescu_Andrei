package clase;

public class Item implements Structura{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String spatii) {
        System.out.println(spatii+this.nume);
    }
}

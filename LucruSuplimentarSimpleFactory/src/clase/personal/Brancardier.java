package clase.personal;

public class Brancardier implements PersonalSpital{
    public String nume;
    public int ani;

    public Brancardier(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }

    @Override
    public void afiseaza() {
        System.out.println("Brancardierul "+this.nume+" are "+this.ani);
    }
}

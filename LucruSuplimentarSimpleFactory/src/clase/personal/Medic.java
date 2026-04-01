package clase.personal;

public class Medic implements PersonalSpital{
    public String nume;
    public int ani;

    public Medic(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }

    @Override
    public void afiseaza() {
        System.out.println("Medicul "+this.nume+" are "+this.ani);
    }
}

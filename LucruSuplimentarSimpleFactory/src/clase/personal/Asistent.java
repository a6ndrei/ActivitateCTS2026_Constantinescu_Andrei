package clase.personal;

public class Asistent implements PersonalSpital {
    public String nume;
    public int ani;

    public Asistent(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }

    @Override
    public void afiseaza() {
        System.out.println("Asistentul "+this.nume+" are "+this.ani);
    }
}

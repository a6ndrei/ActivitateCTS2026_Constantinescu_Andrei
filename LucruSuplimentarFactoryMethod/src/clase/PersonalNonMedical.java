package clase;

public abstract class PersonalNonMedical implements PersonalSpital {
    public String nume;
    public int ani;

    public PersonalNonMedical(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }
}

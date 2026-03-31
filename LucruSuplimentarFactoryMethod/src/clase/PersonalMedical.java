package clase;

public abstract class PersonalMedical implements PersonalSpital {
    public String nume;
    public int ani;

    public PersonalMedical(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }

}

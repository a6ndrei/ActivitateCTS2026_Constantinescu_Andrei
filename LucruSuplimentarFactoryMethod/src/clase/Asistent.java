package clase;

public class Asistent extends PersonalMedical {

    public Asistent(String nume, int ani) {
        super(nume, ani);
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Asistentul "+super.nume+" are "+super.ani+" ani");
    }
}

package clase;

public class Medic extends PersonalMedical{

    public Medic(String nume, int ani) {
        super(nume, ani);
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Medicul cu numele "+super.nume+" are "+super.ani+" ani");
    }
}

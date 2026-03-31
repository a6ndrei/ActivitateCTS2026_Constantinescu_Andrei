package clase;

public class Secretar extends PersonalNonMedical{

    public Secretar(String nume, int ani) {
        super(nume, ani);
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Secretarul "+super.nume+" are "+super.ani+" ani");
    }
}

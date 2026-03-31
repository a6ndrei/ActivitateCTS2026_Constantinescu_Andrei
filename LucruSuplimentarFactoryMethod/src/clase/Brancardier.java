package clase;

public class Brancardier extends PersonalMedical {

    public Brancardier(String nume, int ani) {
        super(nume, ani);
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Brancardierul "+super.nume+" are "+super.ani+" ani");
    }
}

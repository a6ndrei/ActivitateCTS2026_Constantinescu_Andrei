package clase;

public class Registrator extends PersonalNonMedical{

    public Registrator(String nume, int ani) {
        super(nume, ani);
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Registratorul "+super.nume+" are "+super.ani+" ani");
    }
}

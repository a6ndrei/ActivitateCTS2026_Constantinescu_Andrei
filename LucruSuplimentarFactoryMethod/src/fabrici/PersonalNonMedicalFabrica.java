package fabrici;

import clase.PersonalSpital;
import clase.Registrator;
import clase.Secretar;

import static fabrici.TipPersonalNonMedical.REGISTRATOR;
import static fabrici.TipPersonalNonMedical.SECRETAR;

public class PersonalNonMedicalFabrica implements PersonalFabrica{

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, int ani) {
        switch (tip){
            case REGISTRATOR->{
                return new Registrator(nume,ani);
            }
            case SECRETAR -> {
                return new Secretar(nume,ani);
            }
            default -> {
                return null;
            }
        }
    }
}

package fabrici;

import clase.Asistent;
import clase.Brancardier;
import clase.Medic;
import clase.PersonalSpital;

import static fabrici.TipPersonalMedical.*;

public class PersonalMedicalFabrica implements PersonalFabrica {

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, int ani) {
        switch(tip){
            case MEDIC -> {
                return new Medic(nume,ani);
            }
            case ASISTENT -> {
                return new Asistent(nume,ani);
            }
            case BRANCARDIER -> {
                return new Brancardier(nume,ani);
            }
            default -> {
                return null;
            }
        }
    }
}

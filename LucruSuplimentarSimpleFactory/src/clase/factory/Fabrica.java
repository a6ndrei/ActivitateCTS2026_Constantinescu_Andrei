package clase.factory;

import clase.personal.Asistent;
import clase.personal.Brancardier;
import clase.personal.Medic;
import clase.personal.PersonalSpital;

public class Fabrica {
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip,String nume,int ani){
        switch (tip){
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

package main;

import clase.PersonalSpital;
import fabrici.*;

public class Main {
    public static void main(String[] args) {
        PersonalFabrica fabricaPersonalMedical = new PersonalMedicalFabrica();
        PersonalSpital medic = fabricaPersonalMedical.getPersonalSpital(TipPersonalMedical.MEDIC,"Chiriches",33);
        PersonalSpital asistent = fabricaPersonalMedical.getPersonalSpital(TipPersonalMedical.ASISTENT,"Gnohere",34);

        PersonalFabrica fabricaPersonalNonMedical = new PersonalNonMedicalFabrica();
        PersonalSpital secretar = fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.SECRETAR,"Diaz",29);
        PersonalSpital registrator = fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.REGISTRATOR,"Lalana",37);

       medic.afiseazaPersonal();
       asistent.afiseazaPersonal();
       secretar.afiseazaPersonal();
       registrator.afiseazaPersonal();

    }
}
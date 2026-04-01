package main;

import clase.factory.Fabrica;
import clase.factory.TipPersonalSpital;
import clase.personal.Medic;
import clase.personal.PersonalSpital;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        PersonalSpital medic = fabrica.getPersonalSpital(TipPersonalSpital.MEDIC,"Lewandowski",37);
        PersonalSpital asistent = fabrica.getPersonalSpital(TipPersonalSpital.ASISTENT,"Zielinski",32);
        PersonalSpital brancardier = fabrica.getPersonalSpital(TipPersonalSpital.BRANCARDIER,"Lewa",38);

        medic.afiseaza();
        asistent.afiseaza();
        brancardier.afiseaza();
    }
}
package main;

import clase.simplefactory.Factory;
import clase.simplefactory.TipDeSupa;
import clase.tipsupa.TipSupa;

public class Main {
    public static void main(String[] args) {
        Factory supe = new Factory();
        TipSupa supaDeLegume = supe.getSupa(TipDeSupa.SUPA_LEGUME,"Rogers","Pescobar");
        supaDeLegume.afiseazaTipSupa();
        TipSupa supaDeCiuperci = supe.getSupa(TipDeSupa.SUPA_CIUPERCI,"Kvaratskelia","Basilico");
        supaDeCiuperci.afiseazaTipSupa();
        TipSupa supaDeVita = supe.getSupa(TipDeSupa.SUPA_VITA,"Suarez","Vulturul");
        supaDeVita.afiseazaTipSupa();
    }
}
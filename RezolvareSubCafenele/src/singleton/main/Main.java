package singleton.main;

import simplefactory.clase.factory.Factory;
import simplefactory.clase.factory.TipBautura;
import singleton.clase.CasaDeMarcat;

public class Main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        float pretTotal=0;
        CasaDeMarcat comanda1 = CasaDeMarcat.getInstanta();
        comanda1.adaugaBautura(fabrica.getBautura(TipBautura.CAFEA,"Dias",13,14));
        comanda1.adaugaBautura(fabrica.getBautura(TipBautura.CEAI,"Ekitike",11,20));
        comanda1.afiseazaComanda();
        pretTotal=comanda1.calculeazaPret();
        System.out.println(pretTotal);
    }
}

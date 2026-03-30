package simplefactory.main;

import simplefactory.clase.bautura.Bautura;
import simplefactory.clase.factory.Factory;
import simplefactory.clase.factory.TipBautura;

public class Main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        Bautura cafea =fabrica.getBautura(TipBautura.CAFEA,"Foden",233,10);
        cafea.afiseazaComanda();
    }
}
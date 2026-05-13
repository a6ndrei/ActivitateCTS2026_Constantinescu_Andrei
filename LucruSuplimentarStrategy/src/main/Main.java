package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        Calator calator1 = new Calator("Joao Neves");
        ModalitatePlata cardBancar = new CardBancar();
        ModalitatePlata cardDeCalatorii = new CardDeCalatorii();
        ModalitatePlata sms = new Sms();

        Calator calator2 = new Calator("Ekitike");
        Calator calator3 = new Calator("Wirtz");

        calator1.setModalitatePlata(cardBancar);
        calator1.platesteTranzactie(234);

        calator2.setModalitatePlata(cardDeCalatorii);
        calator2.platesteTranzactie(112);

        calator3.setModalitatePlata(sms);
        calator3.platesteTranzactie(34);
    }
}
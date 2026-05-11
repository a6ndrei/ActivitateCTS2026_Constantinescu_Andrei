package main;

import clase.GestionareCuratenie;
import clase.GestionareMese;
import clase.LogisticaMese;
import facade.RestaurantFacade;

public class Main {
    public static void main(String[] args) {

        GestionareMese gestionareMese = new GestionareMese();
        LogisticaMese logisticaMese = new LogisticaMese();
        GestionareCuratenie gestionareCuratenie = new GestionareCuratenie();

        RestaurantFacade fatada = new RestaurantFacade(gestionareCuratenie,gestionareMese,logisticaMese);

        fatada.verificaDisponibilitate();

    }
}
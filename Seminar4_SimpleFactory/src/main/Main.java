package main;

import clase.mijlocTransport.MijlocDeTransport;
import clase.simpleFactory.Factory;
import clase.simpleFactory.TipMijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Factory fabricaTransport=new Factory();
        MijlocDeTransport autobuz= fabricaTransport.getMijlocTransport(TipMijlocDeTransport.AUTOBUZ,"UTD",102);
        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai=fabricaTransport.getMijlocTransport(TipMijlocDeTransport.TRAMVAI,"CCC",20);
        tramvai.afiseazaTipTransport();
        MijlocDeTransport troleibuz= fabricaTransport.getMijlocTransport(TipMijlocDeTransport.TROLEIBUZ,"DDD",32);
        troleibuz.afiseazaTipTransport();

    }
}
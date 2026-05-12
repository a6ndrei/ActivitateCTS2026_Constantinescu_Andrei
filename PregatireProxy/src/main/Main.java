package main;

import clase.IRezervare;
import clase.Rezervare;
import proxy.RezervareProxy;

public class Main {
    public static void main(String[] args) {

        IRezervare rezervare1 = new Rezervare();
        IRezervare rezervare2 = new Rezervare();

        IRezervare rezervareProxy1 = new RezervareProxy(rezervare1);
        IRezervare rezervareProxy2 = new RezervareProxy(rezervare2);

        rezervareProxy1.rezerva(5);
        rezervareProxy2.rezerva(2);

    }
}
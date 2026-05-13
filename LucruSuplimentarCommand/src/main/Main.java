package main;

import clase.Command;
import clase.Masa;
import clase.Operator;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);

        Command comanda1 = new Rezervare(masa1);
        Command commanda2 = new Rezervare(masa2);

        Operator operator = new Operator();
        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(commanda2);

        operator.executaComanda();
        operator.executaComanda();

        System.out.println(operator.getComenzi());
    }
}
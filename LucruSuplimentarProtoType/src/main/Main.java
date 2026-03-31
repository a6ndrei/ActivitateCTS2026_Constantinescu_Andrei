package main;

import clase.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta1 = new Reteta("Guardiola","fotbalist");
        Reteta reteta2 = (Reteta) reteta1.clonare();

        System.out.println(reteta1.toString());

        reteta2.setMedic("Klopp");
        System.out.println(reteta2.toString());

    }
}
package main;

import clase.Item;
import clase.Sectiune;
import clase.Structura;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("bauturi");
        Item item1 = new Item("bumbu");

        Sectiune deserturi = new Sectiune("deserturi");
        Item item2 = new Item("orez cu lapte turcesc");

        bauturi.adauga(item1);
        deserturi.adauga(item2);
        bauturi.adauga(deserturi);
        bauturi.afiseaza("");
    }
}
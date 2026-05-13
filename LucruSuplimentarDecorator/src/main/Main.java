package main;

import clase.Bilet;
import clase.IBilet;
import decorator.BiletDecorator;
import decorator.BiletZiNationala;

public class Main {
    public static void main(String[] args) {

        IBilet bilet = new Bilet("Bine ati venit! Ne bucuram sa va avem");
        bilet.afiseaza();

        BiletDecorator biletCustomizat = new BiletZiNationala(bilet);
        biletCustomizat.afiseaza();
        biletCustomizat.printeazaFelicitare();
    }
}
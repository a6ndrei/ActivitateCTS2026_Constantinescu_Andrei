package main;

import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare.RezervareBuilder()
                .setAsezareLaGeam(true)
                .setGenMuzica("Jazz")
                .build();
        System.out.println(rezervare.toString());

    }
}
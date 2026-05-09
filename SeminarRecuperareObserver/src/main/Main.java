package main;

import clase.ISpital;
import clase.Pacient;
import clase.PacientAbonat;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1=new PacientAbonat("Gyokeres",22);
        Pacient pacient2=new PacientAbonat("Eze",22);
        Pacient pacient3=new PacientAbonat("Stanisic",12);

        ISpital spital=new Spital("Militar");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);


        ((Spital)spital).notificaEpidemie();
        System.out.println("\n-------------\n");
        spital.dezaboneazaPacient(pacient2);
        ((Spital)spital).notificaVirus();

    }
}
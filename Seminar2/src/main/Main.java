package main;

import clase.Aplicant;
import clase.readers.ReaderAngajati;
import clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try{
            ReaderAplicanti ra = new ReaderAngajati();
            listaAngajati = ra.readAplicanti("Seminar2/angajati.txt");
            for(Aplicant aplicant: listaAngajati){
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
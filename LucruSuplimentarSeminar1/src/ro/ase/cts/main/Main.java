package ro.ase.cts.main;

import ro.ase.cts.persoane.Asistent;
import ro.ase.cts.persoane.Persoana;
import ro.ase.cts.persoane.Profesor;
import ro.ase.cts.persoane.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Eze",23,"3");
        Asistent asistent=new Asistent("Cubarsi",34,"2");
        Profesor profesor=new Profesor("Carrasco",29,"1");
        profesor.preda();
        asistent.preda();
        Persoana persoana=new Persoana("Griezmann",34);
        System.out.println(persoana.getNume());

    }
}
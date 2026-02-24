package ro.ase.cts.persoane;

import ro.ase.cts.interfete.IPersoana;

public class Persoana implements IPersoana {
    private String name;
    private int varsta;

    public Persoana(String name, int varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    public String getNume() {
        return name;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

package ro.ase.cts.persoane;

import ro.ase.cts.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String name, int varsta, String idAngajat) {
        super(name, varsta);
        this.idAngajat = idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Profesoruk:");
        buffer.append(super.toString());
        buffer.append("id");
        buffer.append(idAngajat);
        return buffer.toString();
    }

    @Override
    public void preda() {
        System.out.println("Profesorul cu numele"+this.getNume()+"preda");
    }
}

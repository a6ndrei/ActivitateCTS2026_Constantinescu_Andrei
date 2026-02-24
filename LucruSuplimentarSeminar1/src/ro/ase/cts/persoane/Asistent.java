package ro.ase.cts.persoane;

import ro.ase.cts.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public Asistent(String name, int varsta, String idAsistent) {
        super(name, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Asistentul:");
        buffer.append(super.toString());
        buffer.append("id");
        buffer.append(idAsistent);
        return buffer.toString();
    }

    @Override
    public void preda() {
        System.out.println("Asistentul"+this.getNume()+"preda");
    }
}

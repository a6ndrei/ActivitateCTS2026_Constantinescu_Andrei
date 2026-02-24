package ro.ase.cts.persoane;

public class Student extends Persoana{
    private String idStudent;

    public Student(String name, int varsta, String idStudent) {
        super(name, varsta);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Studentul:");
        buffer.append(super.toString());
        buffer.append("id");
        buffer.append(idStudent);
        return buffer.toString();
    }
}

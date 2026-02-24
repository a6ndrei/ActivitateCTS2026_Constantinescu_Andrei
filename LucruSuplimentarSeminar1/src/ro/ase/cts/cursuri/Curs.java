package ro.ase.cts.cursuri;

import ro.ase.cts.persoane.Profesor;
import ro.ase.cts.persoane.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private int credite;
    private String numeCurs;
    public Profesor profesor;
    public List<Student> studenti=new ArrayList<>();

    public Curs(int credite, String numeCurs, Profesor profesor) {
        this.credite = credite;
        this.numeCurs = numeCurs;
        this.profesor = profesor;
    }

    public int getCredite() {
        return credite;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "credite=" + credite +
                ", numeCurs='" + numeCurs + '\'' +
                ", profesor=" + profesor +
                ", studenti=" + studenti +
                '}';
    }
}

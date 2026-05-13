package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura{
    private String nume;
    private List<Structura> substructuri = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String spatii) {
        System.out.println(spatii+this.nume);
        for(Structura structura:substructuri){
            structura.afiseaza(spatii+"  ");
        }
    }

    public void adauga(Structura structura){
        this.substructuri.add(structura);
    }
}

package clase.readers;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicanti {
    protected String numefisier;

    public ReaderAplicanti(String numefisier) {
        this.numefisier = numefisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
    public void citesteAplicanti(Scanner input, Aplicant aplicant) {
        String nume=input.next();
        aplicant.setNume(nume);
        String prenume=(input.next()).toString();
        aplicant.setPrenume(prenume);
        int varsta= Integer.valueOf(input.nextInt());
        aplicant.setVarsta(varsta);
        int punctaj = Integer.valueOf(input.nextInt());
        aplicant.setPunctaj(punctaj);
        int nr=Integer.valueOf(input.nextInt());
        String[] vect= new String[nr];
        for(int i=0;i<nr;i++){
            vect[i]=input.next();
        }
        aplicant.setNrProiecte(nr,vect);

    }
}

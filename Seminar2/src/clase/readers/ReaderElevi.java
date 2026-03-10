package clase.readers;

import clase.Aplicant;
import clase.Elev;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElevi extends ReaderAplicanti {
    public ReaderElevi(String numaFisier) {
        super(numaFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input= new Scanner(new File(super.numefisier));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi= new ArrayList<>();
        while(input.hasNext()) {
            Elev e = new Elev();
            super.citesteAplicanti(input,e);
            int clasa = input.nextInt();
            e.setClasa(clasa);
            String tutore = input.next();
            e.setTutore(tutore);
            elevi.add(e);
        }
        input.close();
        return elevi;
    }
}

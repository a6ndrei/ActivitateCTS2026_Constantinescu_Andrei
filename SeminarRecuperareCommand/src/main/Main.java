package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        Pacient pacient=new Pacient("Valverde",22);
        Pacient pacient2=new Pacient("Tchouameni",12);

        PersonalSpital medic=new Medic("Arbeloa");
        PersonalSpital asistenta=new Asistenta("Coentrao");

        Command internare=new Internare(medic,pacient);
        Command tratare=new Tratare(asistenta,pacient2);

        Operator operator=new Operator();
        operator.inregistreaza(internare);

        operator.executaComanda();
        operator.inregistreaza(new Tratare(new Asistenta("Benitez"),new Pacient("Modric",80)));
        operator.executaComanda();
        operator.stergeComanda(internare);

        operator.inregistreaza(tratare);
        operator.executaComanda();

    }
}
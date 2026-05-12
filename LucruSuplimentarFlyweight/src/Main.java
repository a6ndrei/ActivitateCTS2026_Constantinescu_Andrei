import clase.IPacient;
import clase.Pacient;
import clase.RegistruInternari;
import clase.Salon;

public class Main {

    public static void main(String[] args) {

        IPacient pacient1 = new Pacient("MichaelOlise",0234,"Faurei");
        IPacient pacient2 = new Pacient("Harry",345,"Galati");

        Salon salon = new Salon(3,4,5);

        RegistruInternari registruInternari = new RegistruInternari();

        registruInternari.getPacient("MichaelOlise",0234,"Faurei").interneaza(salon);
        registruInternari.getPacient("Harry",345,"Galati").interneaza(salon);

        System.out.println(registruInternari.getInternari());


    }
}
package builder1.main;

import builder1.clase.AbstractBuilder;
import builder1.clase.Internare;
import builder1.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare1=new Internare();
        internare1.setNumePacient("Georgel Vasilescu");
        internare1.setPatRabatabil(true);

        Internare internare2=new Internare();
        internare2.setNumePacient("Georgică");
        internare2.setPatRabatabil(true);

        AbstractBuilder builder=new InternareBuilder("Georgica");
        Internare internare3=builder.setPatRabatabil(true).build();
        Internare internare4=builder.setPapuciCamera(true).setNumePacient("Gigel").build();


        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        //se afiseaza ultimul obiect de 2 ori
        //solutie: prototype (o noua clona in build) sau mutam apelul constructorului in build !!!
    }
}
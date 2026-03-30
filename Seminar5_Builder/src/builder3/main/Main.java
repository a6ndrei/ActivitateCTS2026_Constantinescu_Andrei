package builder3.main;

import builder3.clase.Internare;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare.InternareBuilder()
                .setNumePacient("Cherki")
                .setMicDejunInclus(true)
                .build();
        System.out.println(internare.toString());


//        internare.setPatRabatabil(true);
//        System.out.println(internare.toString());
    }
}

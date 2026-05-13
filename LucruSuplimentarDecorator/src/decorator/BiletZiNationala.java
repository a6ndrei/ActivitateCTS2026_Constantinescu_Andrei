package decorator;

import clase.IBilet;

public class BiletZiNationala extends BiletDecorator {
    public BiletZiNationala(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}

package decorator;

import clase.IBilet;

public abstract class BiletDecorator implements IBilet {

    private IBilet bilet;

    public BiletDecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void afiseaza() {
        this.bilet.afiseaza();
    }

    public abstract void printeazaFelicitare();
}

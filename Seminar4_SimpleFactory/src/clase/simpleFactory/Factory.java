package clase.simpleFactory;

import clase.mijlocTransport.Autobuz;
import clase.mijlocTransport.Tramvai;
import clase.mijlocTransport.Troleibuz;
import clase.mijlocTransport.MijlocDeTransport;

public class Factory {
    public MijlocDeTransport getMijlocTransport(TipMijlocDeTransport tip, String marca, int nrLinii){

        switch (tip) {
            case AUTOBUZ -> {
                return new Autobuz(nrLinii,marca);
            }
            case TRAMVAI -> {
                return new Tramvai(nrLinii,marca);
            }
            case TROLEIBUZ -> {
                return new Troleibuz(nrLinii,marca);
            }
            default-> {
                return null;
            }
        }
    }
}

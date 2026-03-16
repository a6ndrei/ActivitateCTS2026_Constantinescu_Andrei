package clase.simplefactory;

import clase.tipsupa.SupaDeCiuperci;
import clase.tipsupa.SupaDeLegume;
import clase.tipsupa.SupaDeVita;
import clase.tipsupa.TipSupa;

public class Factory {
    public TipSupa getSupa(TipDeSupa tip,String bucatar,String restaurant) {
        switch(tip) {
            case SUPA_LEGUME-> {
                return new SupaDeLegume(bucatar,restaurant);
            }
            case SUPA_CIUPERCI -> {
                return new SupaDeCiuperci(bucatar,restaurant);
            }
            case SUPA_VITA -> {
                return new SupaDeVita(bucatar,restaurant);
            }
            default -> {
                return null;
            }
        }
    }
}

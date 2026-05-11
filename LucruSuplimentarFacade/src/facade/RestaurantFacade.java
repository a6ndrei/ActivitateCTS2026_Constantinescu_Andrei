package facade;

import clase.GestionareCuratenie;
import clase.GestionareMese;
import clase.LogisticaMese;

public class RestaurantFacade {

    private GestionareCuratenie gestionareCuratenie;
    private GestionareMese gestionareMese;
    private LogisticaMese logisticaMese;



    public RestaurantFacade(GestionareCuratenie gestionareCuratenie, GestionareMese gestionareMese, LogisticaMese logisticaMese) {
        this.gestionareCuratenie = gestionareCuratenie;
        this.gestionareMese = gestionareMese;
        this.logisticaMese = logisticaMese;
    }

    public void verificaDisponibilitate(){
        boolean curatenie = gestionareCuratenie.esteDebarasata();
        boolean masaLibera = gestionareMese.esteMasaLibera();
        boolean areServetele = logisticaMese.areServeteleNoi();

        if(curatenie&&masaLibera&&areServetele){
            System.out.println("masa este gata pentru clienti");
        }
        else{
            System.out.println("masa nu este gata pentru clienti");
        }

    }

}

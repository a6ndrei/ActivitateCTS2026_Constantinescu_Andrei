package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {

    private String nume;
    private List<IClient> listaAbonati = new ArrayList<>();

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient client:listaAbonati){
            client.primesteNotificare(mesaj);
        }
    }

    @Override
    public void aboneazaClient(Client client) {
        listaAbonati.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {
        listaAbonati.remove(client);
    }

    public void trimiteOfertaPret(){
       trimiteNotificare("Este o oferta noua de pret");
    }

    public void trimiteNouMeniu(){
        trimiteNotificare("Exista un nou meniu");
    }
}

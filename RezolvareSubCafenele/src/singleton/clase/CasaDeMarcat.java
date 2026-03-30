package singleton.clase;

import simplefactory.clase.bautura.Bautura;

import java.util.ArrayList;
import java.util.List;

public class CasaDeMarcat implements ComandaManager {
    private List<Bautura>lista;
    private static CasaDeMarcat instanta = null;

    private CasaDeMarcat() {
        lista=new ArrayList<>();
    }

    public static synchronized CasaDeMarcat getInstanta(){
        if(instanta==null){
            instanta=new CasaDeMarcat();
        }
        return instanta;
    }


    @Override
    public void adaugaBautura(Bautura bautura) {
        this.lista.add(bautura);
    }

    @Override
    public void afiseazaComanda() {
        for(Bautura bautura:lista){
            System.out.println(bautura.toString());
        }
    }

    @Override
    public float calculeazaPret() {
        float pretTotal=0;
        for(Bautura bautura:lista){
           pretTotal+=bautura.getPret();
        }
        return pretTotal;
    }
}

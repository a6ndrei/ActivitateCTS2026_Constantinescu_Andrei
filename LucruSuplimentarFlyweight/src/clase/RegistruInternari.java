package clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruInternari {
        private Map<String,IPacient> internari = new HashMap<>();

    public Map<String, IPacient> getInternari() {
        return internari;
    }

    public IPacient getPacient(String nume, int nrTel, String adresa){
        IPacient pacient = internari.get(nume);
        if(!internari.containsKey(nume)){
            pacient = new Pacient(nume,nrTel,adresa);
            internari.put(nume,pacient);
        }
        return pacient;
    }

}

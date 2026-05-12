package proxy;

import clase.IRezervare;
import clase.Rezervare;

public class RezervareProxy implements IRezervare {
 private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }



    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane>=4){
            rezervare.rezerva(nrPersoane);
        }
        else{
            System.out.println("Rezervarea nu poate fi realizata. Va rugam sa va prezentati la restaurant, deoarece sunt destule locuri pentru mese de 2 persoane");
        }
    }
}

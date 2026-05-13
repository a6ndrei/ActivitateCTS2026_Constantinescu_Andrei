package clase;

public class CardBancar implements ModalitatePlata {


    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Tranzactie reusita!Calatorul "+nume+" a platit "+suma+" prin card bancar");
    }
}

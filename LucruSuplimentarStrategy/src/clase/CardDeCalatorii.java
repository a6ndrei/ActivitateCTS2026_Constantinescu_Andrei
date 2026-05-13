package clase;

public class CardDeCalatorii implements ModalitatePlata {

    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Tranzactie reusita!Calatorul "+nume+" a platit "+suma+" prin card de calatorii");
    }
}

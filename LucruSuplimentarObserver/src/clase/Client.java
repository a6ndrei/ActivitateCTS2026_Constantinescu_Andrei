package clase;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("CLientul "+this.nume+" a primit o notificare despre "+mesaj);
    }
}

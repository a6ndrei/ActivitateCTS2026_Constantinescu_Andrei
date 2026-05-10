import adapter.AdapterSoft;
import clase.SoftNou;
import clase.SoftPrintare;

public class Main {
    public static void realizeazaPrintare(SoftPrintare softPrintare){
        softPrintare.printeaza();
    }
    public static void main(String[] args) {
        SoftPrintare softPrintare = new SoftPrintare();
        SoftNou softNou = new SoftNou();

        softPrintare.printeaza();
        softNou.proceseaza();

        realizeazaPrintare(softPrintare);
        AdapterSoft softNouAdaptat = new AdapterSoft(softNou);
        softNouAdaptat.printeaza();
    }
}
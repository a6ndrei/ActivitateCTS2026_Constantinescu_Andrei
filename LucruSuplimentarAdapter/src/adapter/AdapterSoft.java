package adapter;

import clase.SoftNou;
import clase.SoftPrintare;

public class AdapterSoft extends SoftPrintare {
    SoftNou softNou;

    public AdapterSoft(SoftNou softNou) {
        this.softNou = softNou;
    }

    @Override
    public void printeaza() {
        softNou.proceseaza();
    }
}

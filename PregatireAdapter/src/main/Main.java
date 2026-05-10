package main;

import clase.AdapteeYalaSmart;
import clase.DispozitivSecuritate;
import clase.YalaAdapter;

public class Main {
    public static void main(String[] args) {

        AdapteeYalaSmart yalaNoua = new AdapteeYalaSmart();


        DispozitivSecuritate dispozitivAdaptat = new YalaAdapter(yalaNoua);

        System.out.println("Sistemul central încearca să deschida yala:");
        dispozitivAdaptat.verificaIdentitate();
    }
}
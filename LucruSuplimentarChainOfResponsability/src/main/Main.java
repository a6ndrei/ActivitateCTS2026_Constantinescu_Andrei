package main;

import clase.NotificareEmail;
import clase.NotificareHandler;
import clase.NotificareManager;
import clase.NotificareSms;

public class Main {
    public static void main(String[] args) {

        NotificareHandler sms = new NotificareSms();
        NotificareHandler email = new NotificareEmail();
        NotificareHandler notificareManager = new NotificareManager();

        sms.setSuccesor(email);
        email.setSuccesor(notificareManager);

        System.out.println(sms.trimiteNotificari(false,true));
        System.out.println(sms.trimiteNotificari(false,false));
        System.out.println(sms.trimiteNotificari(true,true));
    }
    //era mai bine sa fac si clasa Client
}
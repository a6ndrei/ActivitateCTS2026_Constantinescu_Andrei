package clase;

public class NotificareSms extends NotificareHandler{
    @Override
    public String trimiteNotificari(boolean areNumarDeTelefon, boolean areEmail) {
        if(areNumarDeTelefon==true){
            return "Prin Sms";
        }
        return super.succesor.trimiteNotificari(areNumarDeTelefon,areEmail);
    }
}

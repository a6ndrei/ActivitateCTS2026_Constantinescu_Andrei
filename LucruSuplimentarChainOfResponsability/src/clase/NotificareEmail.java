package clase;

public class NotificareEmail extends NotificareHandler{


    @Override
    public String trimiteNotificari(boolean areNumarDeTelefon, boolean areEmail) {
        if(areNumarDeTelefon==false&&areEmail==true){
            return "Prin Email";
        }
        return super.succesor.trimiteNotificari(areNumarDeTelefon,areEmail);
    }
}

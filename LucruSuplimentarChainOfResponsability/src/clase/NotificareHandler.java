package clase;

public abstract class NotificareHandler {
    protected NotificareHandler succesor;

    public void setSuccesor(NotificareHandler succesor){
        this.succesor = succesor;
    }

    public abstract String trimiteNotificari(boolean areNumarDeTelefon,boolean areEmail);
}

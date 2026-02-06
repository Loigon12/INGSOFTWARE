public class NotificacionSMS extends Notificaciones {

    public NotificacionSMS(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(
                "Se envia el mensaje \"" + mensaje + "\" por SMS a: " + receptorNotificacion
        );
    }
}

public class NotificacionCorreo extends Notificaciones {

    public NotificacionCorreo(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(
                "Se envía el mensaje \"" + mensaje + "\" por correo a: " + receptorNotificacion
        );
    }
}

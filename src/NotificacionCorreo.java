public class NotificacionCorreo extends Notificaciones{


    public NotificacionCorreo(String receptorNotificacion) throws IllegalAccessException {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Se envia el mensaje \"" + mensaje + "\" por correo a:" + receptorNotificacion
        );
    }
}

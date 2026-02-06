 public class NotificacionSMS extends Notificaciones{


        public NotificacionSMS(String receptorNotificacion) throws IllegalAccessException {
            super(receptorNotificacion);
        }

        @Override
        public void enviarMensaje(String mensaje){
            System.out.println("Se envia el mensaje \"" + mensaje + "\" por SMS a:" + receptorNotificacion
            );
        }
    }



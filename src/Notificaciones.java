public class Notificaciones {

    protected final String receptorNotificacion;

    public Notificaciones(String receptorNotificacion) throws IllegalAccessException {
        if(receptorNotificacion == null || receptorNotificacion.isBlank())
            throw new IllegalAccessException("El receptor es invalido");
        this.receptorNotificacion = receptorNotificacion;
    }
}



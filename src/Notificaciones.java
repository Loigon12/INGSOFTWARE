public abstract class Notificaciones {

    protected final String receptorNotificacion;

    public Notificaciones(String receptorNotificacion) {
        if (receptorNotificacion == null || receptorNotificacion.isBlank()) {
            throw new IllegalArgumentException("El receptor es inválido");
        }
        this.receptorNotificacion = receptorNotificacion;
    }

    public abstract void enviarMensaje(String mensaje);
}

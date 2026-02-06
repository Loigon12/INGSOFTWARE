public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("1", 200);
        cuenta1.retirar(10);
        cuenta1.consignar(150);
        System.out.println("El saldo de la cuenta es: " + cuenta1.getSaldo());

        Notificaciones [] notificaciones = new Notificaciones [2];
        notificaciones [0] = new NotificacionCorreo("Antonio");
        notificaciones [1] = new NotificacionSMS("Juan");

        notificaciones [0].enviarMensaje("Hola bro");
        notificaciones [1].enviarMensaje("crack, idolo, mastodonte, fiera");


    }
}

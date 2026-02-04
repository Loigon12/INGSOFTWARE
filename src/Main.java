//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws IllegalAccessException {
        CuentaBancaria cuenta1 = new CuentaBancaria("1", 200);
        cuenta1.retirar(100);
        cuenta1.consignar(150);
        System.out.printf("El saldo de la cuenta es: " + cuenta1.getSaldo());

    }
}
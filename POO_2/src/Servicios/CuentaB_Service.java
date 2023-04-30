package Servicios;

import Entidad.CuentaB;
import java.util.Scanner;

public class CuentaB_Service {

    Scanner leer = new Scanner(System.in);

    //Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaB crearCuenta() {

        CuentaB user1 = new CuentaB();

        System.out.println("Ingrese su nombre y apellido: ");
        user1.setNombre(leer.nextLine());

        System.out.println("Ingrese el numero de cuenta: ");
        user1.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese su DNI: ");
        user1.setDniCliente(leer.nextLong());

        user1.setSaldoActual(0);

        return user1;

    }

    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaB user1, double ingreso) {
        System.out.print("cuanto dinero desea ingresar a la cuenta?: $");
        ingreso = leer.nextDouble();
        user1.setSaldoActual(user1.getSaldoActual() + ingreso);

    }

    /*Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0. */
    public void retirar(CuentaB user1, double retiro) {
        System.out.print("ingrese la cantidad que desea retirar: $");
        retiro = leer.nextDouble();
        if (retiro > user1.getSaldoActual()) {
            user1.setSaldoActual(0);
        }else{
            user1.setSaldoActual(user1.getSaldoActual() - retiro);
        }
    }

    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaB user1, double porc) {

        porc = user1.getSaldoActual() * 0.2;
        user1.setSaldoActual(user1.getSaldoActual() - porc);

        System.out.println("has retirado el 20% ($" + porc + ") de tu saldo");

    }

    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaB user1) {
        System.out.println("tu saldo es: $" + user1.getSaldoActual());
    }

    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaB user1) {
        System.out.println("___________________________________________");
        System.out.println("usuario: " + user1.getNombre());
        System.out.println("numero de cuenta: " + user1.getNumeroCuenta());
        System.out.println("DNI: " + user1.getDniCliente());
        System.out.println("saldo actual: " + user1.getSaldoActual());
        System.out.println("___________________________________________");
    }

    public void opciones() {
        System.out.println("1. ingresar dinero");
        System.out.println("2. retirar dinero");
        System.out.println("3. extraccion rapida (20%)");
        System.out.println("4. consultar saldo");
        System.out.println("5. consultar datos");

    }

}

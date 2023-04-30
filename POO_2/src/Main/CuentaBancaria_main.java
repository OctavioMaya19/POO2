package Main;

import Entidad.CuentaB;
import Servicios.CuentaB_Service;
import java.util.Scanner;

public class CuentaBancaria_main {
    
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CuentaB_Service user=new CuentaB_Service();
        CuentaB user1=user.crearCuenta();
        
        int opcion;
        String salida;
        do{
            user.opciones();
            opcion=leer.nextInt();
            switch(opcion){
                
                case 1:
                    user.ingresar(user1, opcion);
                    break;
                case 2:
                    user.retirar(user1, opcion);
                    break;
                case 3:
                    user.extraccionRapida(user1, opcion);
                    break;
                case 4:
                    user.consultarSaldo(user1);
                    break;
                case 5:
                    user.consultarDatos(user1);
                    break;
            }
            System.out.println("desea continuar? (si/no)");
            salida=leer.next();
        
        }while(salida.equalsIgnoreCase("si"));
        
    }
    
}

package Main;

import Entidad.Raices;
import Servicios.RaicesService;
import java.util.Scanner;

public class Raiz {

    public static void main(String[] args) {
        
        RaicesService raiz = new RaicesService();
        Raices rz = raiz.crearRaiz();
        raiz.calcular(rz, true, true);
        
        
    }
    
}

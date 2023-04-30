package Main;

import Entidad.NIF;
import Servicios.NIFService;

public class NIF_Main {

    public static void main(String[] args) {
        NIFService nif = new NIFService();
        NIF nif1=nif.crearNif();
        nif.mostrarNif(nif1, 0);
        
    }
    
}

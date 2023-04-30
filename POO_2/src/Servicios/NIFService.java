package Servicios;

import Entidad.NIF;
import java.util.Scanner;

public class NIFService {
    char[]letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    Scanner leer = new Scanner (System.in);
    
    public NIF crearNif(){
        
        NIF nif = new NIF();
        System.out.println("ingrese el numero de DNI");
        nif.setDni(leer.nextInt());
        
        return nif;
    }
    
    public void mostrarNif(NIF nif, int num){
        
        num= nif.getDni()%23;
        System.out.println("NIF: "+nif.getDni()+"-"+letra[num]);
        
    }
    
}
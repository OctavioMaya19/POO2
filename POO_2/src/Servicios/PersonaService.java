package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    private Scanner leer=new Scanner (System.in);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        
        System.out.println("ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        
        System.out.println("ingrese la edad");
        persona.setEdad(leer.nextInt());
        
        char sexo;
        do {   
             System.out.println("ingrese el sexo. M(masculino), F(femenino), O(otro)");
            sexo=leer.next().charAt(0);
        } while (sexo!= 'M' && sexo!= 'F' && sexo!= 'O');
        persona.setSexo(sexo);
        
        System.out.println("ingrese el peso");
        persona.setPeso(leer.nextDouble());
        
        System.out.println("ingrese la altura");
        persona.setAltura(leer.nextDouble());
        
        return persona;
    }
    public boolean esMayorDeEdad (Persona persona){
        return persona.getEdad()>18 ;
    }
    
    public int calcularIMC(Persona persona){
        
        double cPeso= persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        
        int retorno;
        if (cPeso<20) {
            retorno=-1;
        }else if (cPeso<=25){
            retorno=0;
        }else{
            retorno=1;
        }
        return retorno;
    }
}

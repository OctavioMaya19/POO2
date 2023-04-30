/*Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.

Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución
,para que esto ocurra, el discriminante debe ser igual que 0.

Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime 
las 2 posibles soluciones.

Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
los métodos obtenerRaices()o obtenerRaiz(), según lo que devuelvan nuestros
métodos y en caso de no existir solución, se mostrará un mensaje.


Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b*/
package Servicios;

import Entidad.Raices;
import java.util.Scanner;

public class RaicesService {

    private Scanner leer = new Scanner(System.in);

    public Raices crearRaiz() {
        Raices rz = new Raices();
        
        System.out.println("ingrese el valor de (a)");
        rz.setA(leer.nextDouble());
        System.out.println("ingrese el valor de (b)");
        rz.setB(leer.nextDouble());
        System.out.println("ingrese el valor de (c)");
        rz.setC(leer.nextDouble());
        
        return rz;
    }

    public double getDiscriminante(Raices rz) {
        
        rz.setDiscriminante((Math.pow(rz.getB(), 2))-4*rz.getA()*rz.getC());
        return rz.getDiscriminante();
    }
    
    public boolean tieneRaices(Raices rz){
        return rz.getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz(Raices rz){
        return rz.getDiscriminante() == 0;
    }
    
    public void obtenerRaices(Raices rz, boolean tieneRaices, double rst1, double rst2){
        
        rst1 = (-rz.getB()- (Math.sqrt(-rz.getDiscriminante())))/(2*rz.getA());
        rst2 = (-rz.getB()+ (Math.sqrt(-rz.getDiscriminante())))/(2*rz.getA());
        
        if (tieneRaices){
            System.out.println("solucion 1: "+rst1);
            System.out.println("solucion 2: "+rst2);
        }
    }
    
    public void obtenerRaiz(Raices rz, boolean tieneRaiz, double rst){
        rst=(-rz.getB()-Math.sqrt(-rz.getDiscriminante()))/(2*rz.getA());
        if (tieneRaiz){
            System.out.println("solucion: "+rst);
        }
    }
    
    public void calcular(Raices rz, boolean tieneRaiz, boolean tieneRaices){
        if (tieneRaices){
            obtenerRaices(rz, tieneRaices, 0, 0);
            
        }else{
            obtenerRaiz(rz, tieneRaiz, 0);
        }
    }
}

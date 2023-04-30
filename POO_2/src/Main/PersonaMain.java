package Main;

import Entidad.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        PersonaService ps = new PersonaService();
        int N;
        System.out.println("ingrese la cantidad de personas que desea controlar");
        N = leer.nextInt();
        Persona[] personas = new Persona[N];
        int[] IMC = new int[N];
        boolean[] mayor = new boolean[N];

        double sobrePeso = 0;
        double pesoIdeal = 0;
        double pesoBajo = 0;
        double esMayor = 0;
        double esMenor = 0;

        for (int i = 0; i < N; i++) {
            personas[i] = ps.crearPersona();
            IMC[i] = ps.calcularIMC(personas[i]);

            switch (IMC[i]) {
                case 1:
                    sobrePeso++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case (-1):
                    pesoBajo++;
                    break;
            }

            mayor[i] = ps.esMayorDeEdad(personas[i]);
            if (mayor[i]) {
                esMayor++;
            } else {
                esMenor++;
            }

        }
        
        System.out.println("promedio de menores de edad: " + ((esMayor / N) * 100));
        System.out.println("promedio de mayores de edad: " + ((esMenor / N) * 100));

        System.out.println("promedio de peso ideal: " + ((pesoIdeal / N) * 100));
        System.out.println("promedio de peso por debajo al ideal: " + ((pesoBajo / N) * 100));
        System.out.println("promedio de sobrepeso: " + ((sobrePeso / N) * 100));
        
    }

}

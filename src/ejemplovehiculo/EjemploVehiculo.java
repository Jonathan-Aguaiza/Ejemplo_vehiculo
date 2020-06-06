/*
Realizar un algoritmo que me permita ingresar por teclado un objeto real,
los requerimientos funcionales y no funcionales, la clase de objeto,
sus atributos y sus servicios.
 */
package ejemplovehiculo;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class EjemploVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("Ingrese un objeto:");
        String ob=objeto.nextLine();
        /*
        Vehiculo
        */
        System.out.println("Ingrese primer requerimiento  funcional:");
        String re1=objeto.nextLine();
        /*
        motor
        */
        System.out.println("Ingrese segundo requerimiento funcional");
        String re2=objeto.nextLine();
        /*
        caja de velocidades
        */
        System.out.println("Ingrese tercer requerimiento funcional:");
        String re3=objeto.nextLine();
        /*
        transmision
        */
        System.out.println("Ingrese primer requerimiento no funcional:");
        String ren1=objeto.nextLine();
        /*
        tapizados
        */
        System.out.println("Ingrese segundo requerimiento no funcional:");
        String ren2=objeto.nextLine();
        /*
        emergencia
        */
        System.out.println("Ingrese terce requerimiento no funcional:");
        String ren3=objeto.nextLine();
        /*
        radio
        */
        System.out.println("Ingrese clase 1:");
        String cl1=objeto.nextLine();
        /*
        camion 
        */
        System.out.println("Ingrese clase 2:");
        String cl2=objeto.nextLine();
        /*
        taxi
        */
        System.out.println("Ingrese clase 3:");
        String cl3=objeto.nextLine();
        /*
        moto
        */
        System.out.println("Ingrese clase 4:");
        String cl4=objeto.nextLine();
        /*
        automovil
        */
        System.out.println("Ingrese clase 5:");
        String cl5=objeto.nextLine();
        /*
        trailer
        */
        System.out.println("Ingrese primer atributo:");
        String atr1=objeto.nextLine();
        /*
        marca
        */
        System.out.println("Ingrese segundo atributo:");
        String atr2=objeto.nextLine();
        /*
        cilingraje
        */
        System.out.println("Ingrese tercer atributo:");
        String atr3=objeto.nextLine();
        /*
        potencia
        */
        System.out.println("Ingrese cuarto atributo:");
        String atr4=objeto.nextLine();
        /*
        serie
        */
        System.out.println("Ingrese quinto atributo:");
        String atr5=objeto.nextLine();
        /*
        tipo
        */
        System.out.println("Ingrese el primer servicio:");
        String ser1=objeto.nextLine();
        /*
        mclaren
        */
        System.out.println("Ingrese el segundo servicio:");
        String ser2=objeto.nextLine();
        /*
        8 en V
        */
        System.out.println("Ingrese el tercer servicio:");
        String ser3=objeto.nextLine();
        /*
        720 caballos de fuerza
        */
         System.out.println("Ingrese el cuarto servicio:");
        String ser4=objeto.nextLine();
        /*
        mclaren 720 S
        */
         System.out.println("Ingrese el quinto servicio:");
        String ser5=objeto.nextLine();
        /*
        deportivo
        */
        
        
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        System.out.println("");
        System.out.println("Objeto");
        System.out.println("");
        System.out.println("Requerimientos funcionales:");
        System.out.println("1.-"+re1);
        System.out.println("2.-"+re2);
        System.out.println("3.-"+re3);
        System.out.println("");
        System.out.println("Requerimientos no funcionales:");
        System.out.println("1.-"+ren1);
        System.out.println("2.-"+ren2);
        System.out.println("3.-"+ren3);
        System.out.println("");
        System.out.println("Clase de objeto");
        System.out.println("1.-"+cl1);
        System.out.println("2.-"+cl2);
        System.out.println("3.-"+cl3);
        System.out.println("4.-"+cl4);
        System.out.println("5.-"+cl5);
        System.out.println("");
        System.out.println("Convertir dicho objeto en uno informatico:");
        System.out.println("Atributos");
        System.out.println("1.-"+atr1);
        System.out.println("2.-"+atr2);
        System.out.println("3.-"+atr3);
        System.out.println("4.-"+atr4);
        System.out.println("5.-"+atr5);
        System.out.println("");
        System.out.println("Servicio:");
        System.out.println("1.- Identificar marca:");
        System.out.println(""+ser1);
        System.out.println("2.- Determinar cilindraje");
        System.out.println(""+ser2);
        System.out.println("3.- Definir potencia");
        System.out.println(""+ser3);
        System.out.println("2.- Reconocer serie");
        System.out.println(""+ser4);
        System.out.println("3.- Seleccionar tipo");
        System.out.println(""+ser5);
    }
    
}

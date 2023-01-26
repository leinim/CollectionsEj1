/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package collectionsej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class CollectionsEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        String opcion = "";
        do {
            System.out.println("Ingrese el nombre de la raza");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("Desea continuar?S/N");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
        
        for (String raza : razas) {
            System.out.println(raza);
        }   
    
    } 
    
    
}

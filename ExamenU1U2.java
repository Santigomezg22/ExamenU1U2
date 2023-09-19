/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    public static void main(String[] args) {
        Scanner precio = new Scanner(System.in);
     
        System.out.println("Ingrese el nombre del primer videojuego");
        String Nombre1 = precio.nextLine();
        System.out.println("Ingrese el nombre del segundo videojuego");
        String Nombre2 = precio.nextLine();
        System.out.println("Ingrese el nombre del tercer videojuego");
        String Nombre3 = precio.nextLine();
        
        
        System.out.println("Ingrese el precio del primer videojuego");
        double Precio1 = precio.nextDouble();
        System.out.println("Ingrese el precio del segundo videojuego");
        double Precio2 = precio.nextDouble();
        System.out.println("Ingrese el precio del tercer videojuego");
        double Precio3 = precio.nextDouble();
        
        
        double descuento1 = (Precio1*30)/100;
        double descuentox = Precio1 - descuento1;
        
        double descuento2 = (Precio2*65)/100;
        double descuentoy = Precio2 - descuento2;
        
        double descuento3 = (Precio3*15)/100;
        double descuentoz = Precio3 - descuento3;
        
        
        System.out.println("El precio final del videojuego1 es: " + descuentox);
        System.out.println("El precio final del videojuego2 es: " + descuentoy);
        System.out.println("El precio final del videojuego3 es: " + descuentoz);     
        
        precio.close();
        
    }
    
}

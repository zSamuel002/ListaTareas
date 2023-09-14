/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Practica4 {

    public static void main(String[] args) {
       double dolar, euro;
       
       final double PRECIOUSA = 17.13;
       final double PRECIOEURO = 18.27;
       
       Scanner moneda = new Scanner(System.in);
        
        System.out.print("Ingrese su cantidad en pesos Mexicanos: $");
        Double pesosmxn = moneda.nextDouble();
//------------------------------------------------------------------------------
System.out.println("");
//------------------------------------------------------------------------------
        System.out.println("Pesos mexicanos a dolares ");
       
        dolar = pesosmxn / PRECIOUSA;
        System.out.println("$" + pesosmxn + " MXN Son: " + dolar + " dolares.");
//------------------------------------------------------------------------------
System.out.println("");
//------------------------------------------------------------------------------
        System.out.println("Pesos mexicanos a euros ");
        
        euro = pesosmxn / PRECIOEURO;
        System.out.println("$" + pesosmxn + " MXN Son: " + euro + " euros.");
    }
    
}

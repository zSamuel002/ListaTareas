/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author labcca
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String nombre ="Samuel";
        String carrera = "TICs";
        String nombreMascota ="Gato";
        String nombreMateria = "Fundamentos de programacion";
        final int anioNacimiento = 2005;
        boolean apagarLuz;
        
        apagarLuz = !true;
        System.out.println(apagarLuz);
        apagarLuz = !false;
        
        edad  = 18;
        
        System.out.println("Mi nombre es: " + nombre + ", y estudio " + carrera + ".");
        System.out.println("Y mi materia favorita es; " + nombreMateria + ".");
        
        System.out.println("Yo naci el anio de: " + anioNacimiento + ".");
        System.out.println("Mi edad es: " + edad);
        
        System.out.println(apagarLuz);

    }
    
}

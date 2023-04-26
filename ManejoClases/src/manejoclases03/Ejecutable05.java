/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author Italo
 */
public class Ejecutable05 {
    public static void main(String[]args){
    Hospital miHospital = new Hospital();
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Cual es el nombre del hospital");
    String nombre = scanner.nextLine();
    
    
    System.out.println("Cuantas camas hay?");
    int camas = scanner.nextInt();
    
    
    System.out.println("Cual es el presupuesto?");
    double presupuesto = scanner.nextDouble();
    
    
    
    miHospital.establecerNombre(nombre);
    miHospital.establecerNumeroCamas(camas);
    miHospital.establecerPresupuesto(presupuesto);
    
        System.out.printf("%s - %d - %.1f\n", miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());
   
    
    }
}

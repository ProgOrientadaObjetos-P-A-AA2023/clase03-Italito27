/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.1f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        // Objeto de tipo hospital
        
        Hospital utpl = new Hospital();
        
        utpl.nombre = "Hospital Santa Ines";
        utpl.numeroCamas= 154;
        utpl.presupuesto=5060.80;
        
        System.out.printf("%s - %d - %.1f\n", utpl.nombre,
                utpl.numeroCamas, utpl.presupuesto);
    }
}

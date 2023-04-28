/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udi_ej1;

/**
 *
 * @author Felipe
 */

import java.util.Scanner;
        
public class UDI_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre");
        String Nombre = scanner.nextLine();
        
        System.out.println("Ingrese su telefono");
        int Telefono = scanner.nextInt();
        
        System.out.println("Su nombre es " +Nombre);
        System.out.println("Su telefono es "+Telefono);
    }
    
}

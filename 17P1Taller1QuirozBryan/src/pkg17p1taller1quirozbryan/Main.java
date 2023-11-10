/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg17p1taller1quirozbryan;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("    UNIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("===========================================");
        System.out.println("CARRERA: ITIN");
        System.out.println("NOMBRES: BRYAN ALEXANDER QUIROZ GONZALEZ");
        System.out.println("MATERIA: POO");
        System.out.println("FECHA: 10 / 11 / 2023");
        System.out.println("===========================================");
        
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble(); 
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        //OPERACIONES VACICAS 
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double divicion = numero1 / numero2;
        //IMPRIMIR EN PANTALLA
        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+suma);
        System.out.println("La resta de "+numero1+" y "+numero2+" es: "+resta);
        System.out.println("La multiplicacion de "+numero1+" y "+numero2+" es: "+multiplicacion);
        System.out.println("La divicion de "+numero1+" y "+numero2+" es: "+divicion);
    }
}

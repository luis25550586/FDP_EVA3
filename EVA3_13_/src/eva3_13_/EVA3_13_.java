/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA3_13_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resu;
        resu = capturar("Introduce el nombre del cliente: ");
        System.out.println(resu);
        double valor;
        valor = capturar("Salario del empleado: ",0.0);
        int edad;
        edad = capturar("Edad del usuario: " ,1);
    }
    public static String capturar(String mensaje){
        Scanner captu = new Scanner (System.in);
        System.out.println(mensaje);
        return captu.nextLine();
    }
     public static double capturar(String mensaje, double nada){
        Scanner captu = new Scanner (System.in);
        System.out.println(mensaje);
        return captu.nextDouble();
    }
     public static int capturar(String mensaje, int nada){
        Scanner captu = new Scanner (System.in);
        System.out.println(mensaje);
        return captu.nextInt();
}
}
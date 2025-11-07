/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA3_4_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
        int valor;
        // Opciones a elegir
        do{
        imprimirMenu(); 
        valor = captu.nextInt();
        
        switch(valor){
            case 1:
                System.out.println("Fahrenheit a Celsius");
                    farCelsius();
                break;
            case 2:
                System.out.println("Celsius a Fahrenheit");
                celFahrenheit();
                
            case 3:
                System.out.println("Kelvin a Celsius");
                kelCelsius();
                break;
               
        }
        }while(valor != 4);
        System.out.println("Hasta Pronto");
       
    }
    // Imprimir menu
    public static void imprimirMenu(){
        System.out.println("Bienvenido");
        System.out.println("Elije cualquier opcion");
        System.out.println("1. Fahrenheit a Celsius");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.println("3. Kelvin a Celsius ");
        System.out.println("4. Terminar");
    }
    // Grados Fahrenheit a Celsius
    public static void farCelsius(){
        Scanner captu = new Scanner (System.in);
        double far;
                
        System.out.println("Grados fahrenheit: ");
        far = captu.nextDouble();
        double resu = cel (far);
        System.out.println("Celsius: " + resu);
        
    }
    
    public static double cel(double far){
        double resu = (far - 32) / 1.8 ;
        return resu;
    }
    // Celsius a Fahrenheit
    public static void celFahrenheit(){
        Scanner captu = new Scanner (System.in);
        double cel;
                
        System.out.println("Grados Celsius: ");
        cel = captu.nextDouble();
        
        double resu = far (cel);
        System.out.println("Fahrenheit: " + resu);
        
    }
    
    public static double far(double cel){
        double resu = cel * 1.8 + 32 ;
        return resu;
    
    } // Kelvin a Celsius
     public static void kelCelsius(){
        Scanner captu = new Scanner (System.in);
        double cel;
                
        System.out.println("Grados Kelvin: ");
        cel = captu.nextDouble();
        
        double resu = kcel (cel);
        System.out.println("Celsius: " + resu);
     }
    public static double kcel(double kel){
        double resu = kel - 273 ;
        return resu;
    }
}

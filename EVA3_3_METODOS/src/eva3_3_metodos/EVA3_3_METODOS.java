/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA3_3_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor;
       
        do{
        imprimirMenu(); 
        valor = captu.nextInt();
        switch(valor){
            case 1:
                System.out.println("Suma de numeros");
                realizarSuma();
                break;
            case 2:
                System.out.println("Potencia");
                realizarPotencia();
                break;
            case 3:
                System.out.println("Imprimir mensaje");               
                break;
               
        }
        }while(valor != 4);
        System.out.println("Hasta pronto");
    }
    // IMPRIMIR MENU
    public static void imprimirMenu(){
        System.out.println("Bienvenido");
        System.out.println("Elije cualquier opcion");
        System.out.println("1. calcular una suma");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir mensaje: ");
        System.out.println("4. Terminar");   
        
    }// Realizar Suma
    public static void realizarSuma(){
        Scanner captu = new Scanner (System.in);
        int val1, val2;
        System.out.println("Valor 1: ");
        val1 = captu.nextInt();
        System.out.println("Valor 2: ");
        val2 = captu.nextInt();
        int resu = sumar (val1, val2);
        System.out.println("El resultado es: " + resu);
    }
    public static int sumar(int num1,int num2){
        return num1 + num2;
    }
    // Potencia
    public static void realizarPotencia(){
        Scanner captu = new Scanner (System.in);
        int val1, val2;
        System.out.println("Base: ");
        val1 = captu.nextInt();
        System.out.println("Exponente: ");
        val2 = captu.nextInt();
        int resu = potencia (val1, val2);
        System.out.println("El resultado es: " + resu);
    }
    public static int potencia(int base,int expo){
           int potencia = 1;
                   for(int i = 1;i <= expo;i++){
                       potencia = potencia * base;
          
           }    
           return potencia;
    }
} 


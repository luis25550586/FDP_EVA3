/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eav3_5_arreglos_metodos;

/**
 *
 * @author Luism
 */
public class EAV3_5_ARREGLOS_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] siArreglo;
        siArreglo = crearArreglo(10,100);
        imprimirArreglo(siArreglo);
        
    }
    // Metosdo que cree u arreglo y lo llene de variables aleatorias
     public static  int [] crearArreglo(int tama, int valAl){
         int resu[] = new int [tama];
         for (int i = 0; i < resu.length; i++) {
         resu[i] = (int)(Math.random()* valAl);
     }
     return resu;
     }
     
    //Imprimir un arreglo
    public static void imprimirArreglo(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++){
        System.out.println("[" + arreglo[i]+"]");
    }
        System.out.println("");
    }
    
}

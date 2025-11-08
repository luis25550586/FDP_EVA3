/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_paso_referencia;

/**
 *
 * @author Luism
 */
public class EVA3_8_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] datos = new int[1];
        datos[0] = 5;
        System.out.println("Original: " + datos[0]);
        incrementar(datos);// SE MANDA UNA COPIA DEL VALOR ALMACENADO
        System.out.println("Despoes de sumar:" + datos[0]);
    }
    public static void incrementar (int[] arreglo){
        for (int i = 0;i < arreglo.length;i++){
            arreglo[i] = arreglo [i] + 1;
            
        }
        
    }
}
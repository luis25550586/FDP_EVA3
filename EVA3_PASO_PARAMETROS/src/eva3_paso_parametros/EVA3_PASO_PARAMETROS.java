/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_paso_parametros;

/**
 *
 * @author Luism
 */
public class EVA3_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num = 5; 
        System.out.println("Original: " + num);
        incrementar(num);// SE MANDA UNA COPIA DEL VALOR ALMACENADO
        System.out.println("Despoes de sumar:" + num);
    }
    public static void incrementar (int valor){
        valor = valor + 1;
    }
}

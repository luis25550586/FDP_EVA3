/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_metodos;

/**
 *
 * @author Luism
 */
public class EVA3_6_ARREGLOS_METODOS {
    static String[] menu = {"productos","ventas","Clientes","salir"};
    static String[] Productos = {"Tacos","sopa","hamburguesa","salir"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirArreglo(menu);
        imprimirArreglo(Productos);
    }
    public static void imprimirArreglo(String[] arreglo){
        for (int i = 0; i < arreglo.length;i++){
            System.out.println((i + 1)+". "+arreglo[i]);
        }
        System.out.println("");
    }
}

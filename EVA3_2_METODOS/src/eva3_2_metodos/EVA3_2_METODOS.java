/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA3_2_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repetirMensaje("hola", 10);
    }
    // Declaracion del metodo.
    public static void repetirMensaje(String mensaje,int repetir){
        
        for(int i = 1;i <repetir;i++){
            System.out.println(mensaje);
        }
        
    }
}

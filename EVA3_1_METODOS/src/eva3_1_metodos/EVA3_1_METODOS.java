/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Luism
 */
public class EVA3_1_METODOS {

    
    public static void main(String[] args) {
       // INVOCAR AL METODO
       // LLAMADA PROCEDIMIENTO O FUNCION
       // 1 QUEREMOS RECUPERAR EL VALOR
       int resu = calcularCuadrado(4);
        System.out.println("El cuadrado de 4 es: " + resu);
        // 2 usar el valor sin guardarlo
        System.out.println("El cuadrado de 4 es: " + calcularCuadrado(4));
        // 3 no les interesa el resultado
        calcularCuadrado(4);
    }
        //modificadores
        // modificadores de acceso, public, private, protected, default
        //static  se necesita -para nuestros metodos en el main
        //public static
                //valor del metoso(tipo de dato
                //Nombre de metodo (usar verbos)
                        //lista de parametros
                  // cero o n cantidad de parametros
        public static int calcularCuadrado(int num) {  //encabezado
            // {} IMPLEMEENTACION DEK METODO
            int cuadrado = num * num;
            return cuadrado;// regresa el resultado
            //no se puede poner metodo
        }
                
                
                
        
    }
    


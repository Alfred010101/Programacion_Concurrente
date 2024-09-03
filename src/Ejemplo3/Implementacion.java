/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3;

import java.util.Arrays;

/**
 *
 * @author Alfred
 */
public class Implementacion
{

    public static void main(String[] args)
    {
        /*********************************
         * Ejercicio 3:
         *      Elimina el indeterminismo al asignar una seccion 
         *      sobre la que trabajara cada hilo.
         * 
         *      Evitando que los hilos trabajen con una misma celda de informacion
         *      eliminando la seccion critica.
         *********************************/
        int vector[] = new int[1000000];
        System.out.println("------------------Datos del arreglo------------------------------");
        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = (int) (Math.random() * 100);
            System.out.print(vector[i] + (((i+1) % 10 == 0) ? "\n" : "\t"));
        }
        System.out.println("------------------Datos del arreglo------------------------------");
        
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
        System.out.println("------------------Datos x10------------------------------");
    
        TareaMultiplicar h1 = new TareaMultiplicar(Arrays.copyOfRange(vector, 0, vector.length/4), 0, 10);
        h1.start();
        TareaMultiplicar h2 = new TareaMultiplicar(Arrays.copyOfRange(vector, vector.length/4, vector.length/2), 0, 10);
        h2.start();
        TareaMultiplicar h3 = new TareaMultiplicar(Arrays.copyOfRange(vector, vector.length/2, vector.length/4 * 3), 0, 10);
        h3.start();
        TareaMultiplicar h4 = new TareaMultiplicar(Arrays.copyOfRange(vector, vector.length/4 * 3, vector.length), 0, 10);
        h4.start();
        
        try
        {
           h1.join();
           h2.join();
           h3.join();
           h4.join();
        }catch(InterruptedException e)
        {
            
        }
        
        h1.unirVector(vector, 0);
        h2.unirVector(vector, vector.length/4);
        h3.unirVector(vector, vector.length/2);
        h4.unirVector(vector, vector.length/4 * 3);
        
        for (int i = 0; i < vector.length; i++)
        {
            System.out.print(vector[i] + (((i+1) % 10 == 0) ? "\n" : "\t"));
        }
        System.out.println("------------------Datos x10------------------------------");
    }
}

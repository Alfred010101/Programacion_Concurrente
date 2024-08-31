package Ejemplo1;

/**
 *
 * @author Alfred
 */

public class Inplementacion
{
    public static void main(String[] args)
    {
        /******************************
         * Ejemplo 1:
         ******************************
        Tarea t1 = new Tarea(1);
        Tarea t2 = new Tarea(2);
        Tarea t3 = new Tarea(3);
        Tarea t4 = new Tarea(4);
        Tarea t5 = new Tarea(5);
        Tarea t6 = new Tarea(6);
        Tarea t7 = new Tarea(7);
        Tarea t8 = new Tarea(8);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        ******************************/
        
        
        /******************************
         * Ejemplo 2:
         *  IMPORTANTE: 
         *      Observar como se imprimen(procesan) los indices
         *      Observar la carga de trabajo para el procesador 
         *      Compararlo con la impresion normal de los indices
         *      [Si el procesador aguamta da le hasta que true... 
         *      jeje no es cierto pero tu dale...]
         ******************************/
        Tarea proceso[] = new Tarea[100000];
        
        for (int i = 0; i < 100000; i++)
        {
            proceso[i] = new Tarea(i);
        }
        
        for (int i = 0; i < 100000; i++)
        {
            proceso[i].start();
        }
        System.out.println("Termino de ejecutar el main en el HILO principal");
    }
}

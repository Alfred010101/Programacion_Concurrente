
package Ejemplo6;

/**
 *
 * @author Alfred
 */

public class test
{
    public static void main(String[] args)
    {
        /**
         * Implementando la interfaz Runnable
         */
        Runnable tarea = new Hilo();
        Thread hilo = new Thread(tarea);
        hilo.start();
        try
        {
            hilo.join();
        } catch (InterruptedException e)
        {
        }
    }
}

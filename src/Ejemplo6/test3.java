
package Ejemplo6;

/**
 *
 * @author Alfred
 */
public class test3
{
     public static void main(String[] args)
    {
        /**
         * Implementando la interfaz Runnable
         */
        Thread hilos[] = new Thread[Runtime.getRuntime().availableProcessors()];
        for (int i = 0; i < hilos.length; i++)
        {
            hilos[i] = new Thread(new Hilo2());
            hilos[i].start();
        }

        for (Thread hilo : hilos)
        {
            try
            {
                hilo.join();
            }catch (InterruptedException e)
            {
            }
        }
        
        System.out.println(Hilo2.counter);
    }
}

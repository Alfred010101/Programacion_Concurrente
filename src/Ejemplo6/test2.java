package Ejemplo6;

/**
 *
 * @author Alfred
 */
public class test2
{

    public static void main(String[] args)
    {
        /**
         * Implementando la interfaz Runnable
         */
        Thread hilos[] = new Thread[Runtime.getRuntime().availableProcessors()];
        for (int i = 0; i < hilos.length; i++)
        {
            hilos[i] = new Thread(new Hilo());
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
    }
}

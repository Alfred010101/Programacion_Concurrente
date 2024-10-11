package Ejemplo7;

/**
 *
 * @author Alfred
 */
public class Run implements Runnable
{

    private int id;
    private static Object object = new Object();
    private static int cont = 0;

    public Run(int id)
    {
        this.id = id;
    }

    @Override
    public void run()
    {
        synchronized (object)
        {
            while (id != cont)
            {
                try
                {
                    object.wait();
                } catch (InterruptedException ex)
                {
                }
            }

            object.notifyAll();
            System.out.println("Hilo : " + id);
            cont++;
        }
    }

    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
        int nNucleos = runtime.availableProcessors();

        Thread[] hilos = new Thread[nNucleos];

        for (int i = 0; i < hilos.length; i++)
        {
            Runnable runnable = new Run(i);
            hilos[i] = new Thread(runnable);
            hilos[i].start();
        }

        for (Thread hilo : hilos)
        {
            try
            {
                hilo.join();
            } catch (InterruptedException ex)
            {
            }
        }

        System.out.println("Soy el hilo: principal");

    }
}

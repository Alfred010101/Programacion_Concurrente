package Ejemplo6;

/**
 *
 * @author Alfred
 */
public class Hilo2 implements Runnable
{

    public static int counter = 0;
    public static Object object = new Object();

    @Override
    public void run()
    {

        for (int i = 0; i < 20000; i++)
        {
            synchronized (object)
            {
                counter++;
            }
        }
    }

    /* Aqui se pierde practicamente la concurrencia
    @Override
    public void run()
    {
        synchronized (object)
        {
            for (int i = 0; i < 20000; i++)
            {

                counter++;
            }
        }
    }
     */
}

/**
 * Investigando un poco me encontre con esto; 
 * import java.util.concurrent.atomic.AtomicInteger;
 *
 * public class MyClass implements Runnable { public static AtomicInteger
 * counter = new AtomicInteger(0);
 *
 * @Override public void run() { for (int i = 0; i < 20000; i++) {
 * counter.incrementAndGet(); } } }
 */


package EjercicioA;

/**
 *
 * @author Alfred
 */
public class Run
{
    public static void main(String[] args)
    {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Thread[] hilos = new Thread[Runtime.getRuntime().availableProcessors()];
       
        Stock stock = new Stock();
        
        hilos[0] = new Thread(new Productor(stock));
        hilos[0].start();
        for (int i = 1; i < hilos.length; i++)
        {
            hilos[i] = new Thread(new Consumidor(i, stock));
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
        System.out.println("Termino ...");
    }
}

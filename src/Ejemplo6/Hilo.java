
package Ejemplo6;

/**
 *
 * @author Alfred
 */

public class Hilo implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Hilo concurrente");
    }
    
}

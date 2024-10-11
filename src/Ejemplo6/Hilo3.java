
package Ejemplo6;

/**
 *
 * @author Alfred
 */
public class Hilo3
{
    /**
     * formas de crear un hilo
     * @param args 
     */
    public static void main(String[] args)
    {
        Thread h = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Hola A");
            }
        });
        // La forma de arriba y de abajo son practicamente lo mismo solo que una usa programacion funcional
        Thread i = new Thread(() ->
        {
            System.out.println("Hola B");
        });
        
        Runnable j = () ->
        {
            System.out.println("Hola C");
        };
        
        Thread k = new Thread(j);
        
        h.start();
        
        try
        {
            k.join();
        } catch (InterruptedException e)
        {
        }
        
    }
}

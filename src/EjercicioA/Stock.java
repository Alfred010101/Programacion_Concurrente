package EjercicioA;

/**
 *
 * @author Alfred
 */
public class Stock
{

    private int stock = 0;

    /**
     * @param aStock the stock to set
     */
    public synchronized void reabastecerStock(int aStock)
    {
        while (stock > 0)
        {
            try
            {
                wait();
            } catch (InterruptedException ex)
            {
            }
        }
        stock = aStock;
        System.out.println("Stock COMPLETO !");
        notifyAll();
    }

    /**
     * consume un recurso/producto
     *
     * @param id
     */
    public synchronized void consumirStock(int id)
    {
        while (stock == 0)
        {
            try
            {
                wait();
            } catch (InterruptedException ex)
            {
            }
        }

        stock--;
        System.out.println("Hilo : {" + id + "} consumio el recurso {" + (stock + 1) + "}");

        if (stock == 0)
        {
            notifyAll();
        }
    }
}

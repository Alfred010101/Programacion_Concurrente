package EjercicioA;

/**
 *
 * @author Alfred
 */
public class Productor implements Runnable
{
    private final Stock stock;
    
    public Productor(Stock stock)
    {
        this.stock = stock;
    }

    private void producir()
    {
        stock.reabastecerStock(10);
    }

    @Override
    public void run()
    {
        while (true)
        {
            producir();
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException ex)
            {
            }
        }
    }
}

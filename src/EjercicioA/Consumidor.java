package EjercicioA;


/**
 *
 * @author Alfred
 */
public class Consumidor implements Runnable
{
    private final Stock stock;
    private final int id;

    public Consumidor(int id, Stock stock)
    {
        this.id = id;
        this.stock = stock;
    }
    
    private void consumir()
    {
        stock.consumirStock(id);
    }

    @Override
    public void run()
    {
        while (true)
        {
            consumir();
            try
            {
                Thread.sleep(900);
            } catch (InterruptedException ex)
            {
            }
        }
    }
}

package Ejemplo3;

/**
 *
 * @author Alfred
 */
public class TareaMultiplicar extends Thread
{

    private final int vector[];
    private final int operacion;
    private final int factor;

    public TareaMultiplicar(int vector[], int operacion, int factor)
    {
        this.vector = vector;
        this.operacion = operacion;
        this.factor = factor;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < vector.length; i++)
        {
            switch (operacion)
            {
                case 0 -> vector[i] = Operaciones.suma( vector[i], factor);
                case 1 -> vector[i] = Operaciones.resta( vector[i], factor);
                case 2 -> vector[i] = Operaciones.multi( vector[i], factor);
            }
        }
    }
    
    public void unirVector(int[]vector, int index)
    {
        for(int i = 0; i < this.vector.length; i++, index++)
        {
            vector[index] = this.vector[i];
        }
    }
}

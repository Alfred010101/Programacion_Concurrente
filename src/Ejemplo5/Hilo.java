package Ejemplo5;

/**
 *
 * @author Alfred
 */
public class Hilo extends Thread
{

    private static int matriz[][];
    private final int start;
    private final int finish;

    public Hilo(int start, int finish)
    {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public void run()
    {
        for (int i = start; i < finish; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = matriz[i][j] * 10;
            }
        }
    }

    public static void mostrar()
    {
        if (matriz != null)
        {
            for (int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz[i].length; j++)
                {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
        }else
        {
            System.out.println("Empty");
        }
    }

    /**
     * @return the matriz
     */
    public static int[][] getMatriz()
    {
        return matriz;
    }

    /**
     * @param aMatriz the matriz to set
     */
    public static void setMatriz(int[][] aMatriz)
    {
        matriz = aMatriz;
    }
}

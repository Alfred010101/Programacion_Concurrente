package Ejemplo4;

/**
 *
 * @author Alfred
 */
public class Hilo extends Thread
{
    private static int[][]matriz;
    private final int inicio;
    private final int fin;
    public Hilo(int inico, int fin)
    {
        this.inicio = inico;
        this.fin = fin;
    }
    
    @Override
    public void run()
    {
        if (matriz != null)
        {
            if (inicio < fin)
            {
                if (inicio < matriz.length && fin <= matriz.length)
                {
                    for (int i = inicio; i < fin; i++)
                    {
                        for (int j = 0; j < matriz[i].length; j++)
                        {
                            matriz[i][j] = matriz[i][j] * 10;
                        }
                    }
                }
            }else
            {
                System.out.println("Verifique los indices");
            }
        }else
        {
            System.out.println("Inicialice la matriz");
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

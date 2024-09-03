
package Ejemplo4;

/**
 *
 * @author Alfred
 */
public class Secuencial
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[20][1000000];
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = (int) (Math.random() * 100);
               // System.out.print(matriz[i][j] + "\t");
            }
         //   System.out.println("");
        }
        
        double tiempoInicial = System.nanoTime();
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = matriz[i][j] * 10;
            }
        }
        double tiempoFinal = System.nanoTime();
        System.out.println("Tiempo de procesamiento = "  + ((tiempoFinal - tiempoInicial)/1000000) + " ms");
    }
}

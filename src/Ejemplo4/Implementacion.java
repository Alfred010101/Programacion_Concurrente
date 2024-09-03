package Ejemplo4;

/**
 *
 * @author Alfred
 */
public class Implementacion
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

        Hilo.setMatriz(matriz);

        Hilo[] hilos = new Hilo[4];
        hilos[0] = new Hilo(0, 5);
        hilos[1] = new Hilo(5, 10);
        hilos[2] = new Hilo(10, 15);
        hilos[3] = new Hilo(15, 20);
        /*****
         * Ya NO aumenta el rendimiento apesar de crear mas hilos,
         * esto depende del procesador y su capacidad maxima.
        hilos[0] = new Hilo(0, 1);
        hilos[1] = new Hilo(1, 2);
        hilos[2] = new Hilo(2, 3);
        hilos[3] = new Hilo(3, 4);
        hilos[4] = new Hilo(4, 5);
        hilos[5] = new Hilo(5, 6);
        hilos[6] = new Hilo(6, 7);
        hilos[7] = new Hilo(7, 8);
        * 
        */
                
        double tiempoInicial = System.nanoTime();
        
        for (int i = 0; i < hilos.length; i++)
        {
            hilos[i].start();
        }

        try
        {
            for (int i = 0; i < hilos.length; i++)
            {
                hilos[i].join();
            }
        } catch (Exception e)
        {
        }
        double tiempoFinal = System.nanoTime();
        /*System.out.println("********************************");
        int[][] matrizTratada = Hilo.getMatriz();
        for (int i = 0; i < matrizTratada.length; i++)
        {
            for (int j = 0; j < matrizTratada[i].length; j++)
            {
                System.out.print(matrizTratada[i][j] + "\t");
            }
            System.out.println("");
        }*/
        System.out.println("Tiempo de procesamiento = "  + ((tiempoFinal - tiempoInicial)/1000000) + " ms");
    }
}

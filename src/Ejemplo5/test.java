package Ejemplo5;

/**
 *
 * @author Alfred
 */
public class test
{

    public static void main(String[] args)
    {
        //obtener el numero maximo de hilos soportados...
        int numHilos = Runtime.getRuntime().availableProcessors();
        
        //crear la matiz
        int[][] matriz = new int[5][15];
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        //crear arreglo de hilos
        Hilo[] hilos = new Hilo[numHilos];
        //asignar la matriz a matriz estatica
        Hilo.setMatriz(matriz);
        Hilo.mostrar();
        System.out.println("**************Separador**************************");
        
        int start = 0;
        int finish = 0;

        if (numHilos >= matriz.length)
        {
            for (int i = 0; i < matriz.length; i++)
            {
                //finish++;
                hilos[i] = new Hilo(start++, ++finish);
                hilos[i].start();
                //start++;
            }

            try
            {
                for (int i = 0; i < matriz.length; i++)
                {
                    hilos[i].join();
                }
            } catch (InterruptedException e)
            {
            }
        } else
        {
            int mod = matriz.length % numHilos;
            int div = matriz.length / numHilos;
            //int index = 0;
            
            for (int i = 0; i < hilos.length; i++)
            {
                finish += ((mod <= 0) ? div : div + 1);
                hilos[i] = new Hilo(start, finish);
                hilos[i].start();
                mod--;
                //index++;
                start = finish;
            }
            
            try
            {
                for (int i = 0; i < numHilos; i++)
                {
                    hilos[i].join();
                }
            } catch (InterruptedException e)
            {
            }
        }
        
        Hilo.mostrar();

        //System.out.println(numHilos);
    }
}

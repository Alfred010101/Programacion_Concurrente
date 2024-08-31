
package Ejemplo2;

/**
 *
 * @author Alfred
 */
public class Implementacion
{
    public static void main(String[] args)
    {
        Ejemplo1.Tarea proceso[] = new Ejemplo1.Tarea[9000];
        
        for (int i = 0; i < 9000; i++)
        {
            proceso[i] = new Ejemplo1.Tarea(i);
            proceso[i].start();
        }
        
        /*********************************
         * Ejercicio 2:
         *      Continuar la ejecion del hilo principal despues de
         *      una tarea determinada.
         * 
         *      Tambien, puedes eperar hasta el final de todas las 
         *      instrucciones en paralelo, usando un bucle
         *********************************/
        try
        {
//            proceso[4923].join();
            for (int i = 0; i < 9000; i++)
            {
                proceso[i].join();
            }
        }catch(InterruptedException ex)
        {
        }
        
        System.out.println("Termino de ejecutarse el hilo principal");
    }
}

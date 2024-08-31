/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1;

/**
 *
 * @author Alfred
 */
public class Tarea extends Thread
{
    private final int id;
    
    public Tarea(int id)
    {
        this.id = id;
    }
    
    @Override
    public void run()
    {
        System.out.println("Tarea " + id + " ejecutada en un HILO paralelo");
    }
}

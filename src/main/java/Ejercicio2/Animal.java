/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Samuel
 */
public abstract class  Animal {
    protected String nombre;
 
    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("Creando animal: " + nombre);
    }
 
    public abstract void sonido();
}

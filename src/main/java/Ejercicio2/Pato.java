/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Samuel
 */
public class Pato extends Animal implements Volador, Nadador {

    public Pato(String nombre) {
        super(nombre);
        System.out.println("Creando pato");
    }
 
    @Override public void volar()  { System.out.println(nombre + " vuela bajo"); }
    @Override public void nadar()  { System.out.println(nombre + " nada en el lago"); }
    @Override public void sonido() { System.out.println(nombre + " dice: Cuac"); }
 
    @Override public String habilidad() { return "Vuela y nada"; }

}

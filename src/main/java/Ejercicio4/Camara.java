/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Samuel
 */
public class Camara extends Dispositivo implements Fotografiable{
    private int megapixeles;

    public Camara(String marca, String modelo, double precio, int megapixeles) {
        super(marca, modelo, precio);
        this.megapixeles = megapixeles;
    }
    
    @Override
    void describir() {
        System.out.println("Camara "+ marca+ " "+ modelo + " - $"+precio + " - "+ funcion());
    }

    @Override
    public void tomarFoto() {
        System.out.println(marca + " tomo una foto profesional de "+megapixeles+ " MP");
    }

    @Override
    public int getMegaPixeles() {
        return megapixeles;
    }

    @Override
    public String funcion() {
        return Fotografiable.super.funcion(); 
    }
    
}

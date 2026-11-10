/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Samuel
 */
public class Smartphone extends Dispositivo implements Llamable, Fotografiable {
    private int megapixeles;

    public Smartphone(String marca, String modelo, double precio, int megapixeles) {
        super(marca, modelo, precio);
        this.megapixeles = megapixeles;
    }

    @Override
    void describir() {
        System.out.println("Smartphone "+ marca+ " "+ modelo + " - $"+precio + " - "+ funcion());
    }

    @Override
    public void llamar(String numero) {
        System.out.println(marca + " llamando a " + numero);
    }

    @Override
    public void colgar() {
        System.out.println(marca+ " finalizo la llamada");
    }

    @Override
    public String funcion() {
        return "Llamadas y fotografia";
    }

    @Override
    public void tomarFoto() {
        System.out.println(marca+ " tomo una foto de "+megapixeles+ " MP");
    }

    @Override
    public int getMegaPixeles() {
        return megapixeles;
    }

}

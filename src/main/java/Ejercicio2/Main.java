/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Samuel
 */
public class Main {
    public static void main(String[] args){
        Pato p = new Pato("Donald");
        Animal a = p;
        Volador v = p;
        Nadador n = p;
 
        a.sonido();
        v.volar();
        n.nadar();
        System.out.println(v.habilidad());
        System.out.println(a instanceof Nadador);
 
        if (a instanceof Volador) {
            ((Volador) a).volar();
        }
        Volador w = new Pato("Daisy");
    }
}

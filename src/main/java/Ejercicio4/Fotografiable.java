/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Samuel
 */
public interface Fotografiable {
    void tomarFoto();
    int getMegaPixeles();
    default String funcion(){
        return "Fotografia";
    }
}

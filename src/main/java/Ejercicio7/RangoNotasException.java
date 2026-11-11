/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Samuel
 */
public class RangoNotasException extends Exception {
    private final double notas;
    
    public RangoNotasException(double notas) {
        super("Error. Las notas deben ser de 0 a 5.");
        this.notas=notas;
    }

    public double getNotas() {
        return notas;
    }
    
}

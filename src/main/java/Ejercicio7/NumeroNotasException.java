/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Samuel
 */
public class NumeroNotasException extends Exception {
    private final int notas;
    
    public NumeroNotasException(int notas) {
        super("Error. El numero de notas no puede ser 0 o menos.");
        this.notas=notas;
    }

    public int getNotas() {
        return notas;
    }
}

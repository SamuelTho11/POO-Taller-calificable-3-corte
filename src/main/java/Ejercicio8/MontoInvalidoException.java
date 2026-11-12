/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Samuel
 */
public class MontoInvalidoException extends Exception {
    private final double monto;

    public MontoInvalidoException(double monto) {
        super("Monto invalido: " + monto + ". Debe ser mayor que cero.");
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}

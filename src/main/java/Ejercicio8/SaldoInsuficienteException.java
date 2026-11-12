/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Samuel
 */
public class SaldoInsuficienteException extends Exception {
    private final double saldo;
    private final double monto;

    public SaldoInsuficienteException(double saldo, double monto) {
        super("Saldo insuficiente. Saldo: $"+ saldo+" - Faltan: $"+ (monto-saldo));
        this.saldo = saldo;
        this.monto = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMonto() {
        return monto;
    }
    
    public double getFaltante(){
        return monto-saldo;
    }
}

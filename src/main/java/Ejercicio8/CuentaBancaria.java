/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Samuel
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double monto) throws MontoInvalidoException {
        if(monto <=0){ 
           throw new MontoInvalidoException(monto);
        }
        saldo+=monto;
        System.out.println("Saldo actualizado: $"+ saldo);
        return saldo;
    }
    
    public double retirar(double monto) throws SaldoInsuficienteException, MontoInvalidoException {
        if(monto<=0){
           throw new MontoInvalidoException(monto);
        }else if(monto>saldo){
            throw new SaldoInsuficienteException(saldo, monto);
        }
        saldo-=monto;
        System.out.println("Saldo actualizado: $"+saldo);
        return saldo;
    }
    
    public void consultar() {
        System.out.println("Cuenta Bancaria. " + "Titular: " + titular + ", Saldo: $" + saldo);
    }
}

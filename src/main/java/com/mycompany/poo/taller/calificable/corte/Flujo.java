/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.taller.calificable.corte;

/**
 *
 * @author Samuel
 */
public class Flujo {

    static int dividir(String texto) {
        int n = Integer.parseInt(texto);
        return 100 / n;
    }
 
    static void procesar(String texto) {
        System.out.println("Inicio: " + texto);
        try {
            int r = dividir(texto);
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático");
        } catch (NumberFormatException e) {
            System.out.println("No es un número");
        } finally {
            System.out.println("Fin de " + texto);
        }
        System.out.println("---");
    }
 
    public static void main(String[] args) {
        procesar("4");
        procesar("0");
        procesar("dos");
        procesar(null);
    }
}

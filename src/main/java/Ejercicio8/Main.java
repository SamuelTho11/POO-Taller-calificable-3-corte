/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;
import java.util.Scanner;
/*
 * @author Samuel
 */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        CuentaBancaria c1 = new CuentaBancaria("Santiago", 300000);
        try{
            do{
                try{
                System.out.println("1. Consultar   2. Depositar   3. Retirar   4. Salir");
                System.out.print("Opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1:{
                        c1.consultar();
                        break;
                    }  
                    case 2:{
                        System.out.println("Monto a depositar: ");
                        double monto = Double.parseDouble(sc.nextLine());
                        c1.depositar(monto);
                        break;
                    }
                    case 3:{
                        System.out.println("Monto a retirar: ");
                        double monto = Double.parseDouble(sc.nextLine());
                        c1.retirar(monto);
                        break;
                    }
                    case 4:{
                        System.out.println("Saliendo del programa...");
                        break;
                    }
                    default:{
                        System.out.println("Debe ingresar un numero valido.");
                    }
                }
                 }catch(NumberFormatException ex){
                    System.out.println("Error. debe ingresar un numero. ");
                }catch(MontoInvalidoException | SaldoInsuficienteException ex){
                    System.out.println(ex.getMessage());
                }
            }while(opcion!=4);
        }finally {
            sc.close();
        }
    }
}

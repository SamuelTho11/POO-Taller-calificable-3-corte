/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Promedio {
    
    public static double promedio(double[] notas) throws Exception {
           if (notas.length == 0 ) throw new Exception("Error. El numero de notas no puede estar vacio.");
           double suma = 0;
           for (int i = 0; i < notas.length; i++) {
               suma += notas[i];
          }
          return suma / notas.length;
    }
    public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(System.in);
          try {
              System.out.print("¿Cuántas notas? ");
              int n = Integer.parseInt(sc.nextLine());
              if(n<=0){
                  throw new NumeroNotasException(n);
              }
              double[] notas = new double[n];
              for (int i = 0; i < n; i++) {
                  notas[i] = Double.parseDouble(sc.nextLine());
                  if(notas[i]<0.0 || notas[i]>5.0){
                      throw new RangoNotasException(notas[i]); 
                  }    
              }
              System.out.println("Promedio: " + promedio(notas));
              } catch (NumberFormatException e) {
              System.out.println("Error. Debe ingresar un numero valido.");
              }catch (NumeroNotasException | RangoNotasException ex){
                 System.out.println(ex.getMessage());
              }catch(Exception e){
                  System.out.println(e.getMessage());
              }finally{
              sc.close();
          }
      }
}

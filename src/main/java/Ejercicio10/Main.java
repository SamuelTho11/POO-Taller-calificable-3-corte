/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class Main {
    public static void main(String[] args){
        Bitacora bitacora = new Bitacora();
        
        try{
            bitacora.registrar("Actualizando sistema...");
            bitacora.registrar("Autenticado credenciales de sesion...");
            bitacora.registrar("ERROR. Fallo inesperado al conectar con el sistema.");
            bitacora.registrar("ERROR. Tiempo agotado en la sesion, ingrese pronto.");
            List<String> eventos = bitacora.leer();
            for(String evento: eventos){
                System.out.println(evento); 
            }
            int errores = bitacora.contar("ERROR");
            System.out.println("Total de Errores encontrado: "+ errores);
        } catch(IOException ex){
            System.out.println("Error al manipular el archivo "+ ex.getMessage());
        }
        
        Bitacora bitacoraFake = new Bitacora("noexiste.txt");
        try{
            bitacoraFake.leer();
        } catch(FileNotFoundException ex){
            System.out.println("Archivo no encontrado, no existente. " + ex.getMessage());
        } catch(IOException ex){
            System.out.println("Error general. "+ ex.getMessage());
        }
    }
}

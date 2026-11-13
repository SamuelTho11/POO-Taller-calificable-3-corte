/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 *
 * @author Samuel
 */
public class Notas {
    public static void main(String[] args) throws IOException {
        String archivoEntrada = "notas.csv";
        String archivoSalida = "reporte.csv";
        
        int procesados = 0;
        int errores = 0;
        int numeroLinea = 0;
        FileReader frE = new FileReader(archivoEntrada, StandardCharsets.UTF_8);
        FileWriter fwS = new FileWriter(archivoSalida, StandardCharsets.UTF_8);
        try(BufferedReader brE = new BufferedReader(frE);
        BufferedWriter bwS = new BufferedWriter(fwS)){
            String cabecera = brE.readLine();
            if(cabecera !=null){
                numeroLinea++;
            }
            bwS.write("codigo,nombre,promedio,estado");
            bwS.newLine();
            
            String linea;
            while((linea = brE.readLine())!= null){
                numeroLinea++;
                
                if(linea.trim().isEmpty()){
                    continue;
                }
                try{
                    String[] columnas = linea.split(",");
                    if(columnas.length < 5){
                        throw new IllegalArgumentException("Columnas incompletas, llegaron "+ columnas.length);
                    }
                    String codigo = columnas[0].trim();
                    String nombre = columnas[1].trim();
                    double nota1 = Double.parseDouble(columnas[2].trim());
                    double nota2 = Double.parseDouble(columnas[3].trim());
                    double nota3 = Double.parseDouble(columnas[4].trim());
                    
                    double promedio = (nota1+nota2+nota3)/3.0;
                    String estado; 
                    if(promedio>=3.0){
                        estado = "APROBADO";
                    } else{
                        estado = "REPROBADO";
                    }
                    String filaSalida = String.format(Locale.US, "%s,%s,%.2f,%s", codigo, nombre, promedio, estado);
                    bwS.write(filaSalida);
                    bwS.newLine();
                    procesados++;
                } catch(NumberFormatException ex){
                    errores++;
                    System.out.println("Error en la linea "+ numeroLinea+": Nota ingresada no es numero valido "+ex.getMessage());
                }catch(IllegalArgumentException ex){
                    errores++;
                    System.out.println("Error en la linea "+ numeroLinea+ ": "+ex.getMessage());
                }
            }
            System.out.println("Registos correctamente procesados: "+ procesados);
            System.out.println("Registros con errores: " + errores);
        }catch(IOException ex){
            System.out.println("Error en la entrada o salida del archivo: " + ex.getMessage());
        }
    }
    
}

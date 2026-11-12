/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class Bitacora {
    private final String archivo;
    
    public Bitacora(){
        this.archivo= "bitacora.txt";
    }
    public Bitacora(String archivo) {
        this.archivo = archivo;
    }
    
    
    public void registrar(String mensaje) throws IOException{
        String fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String linea = "["+ fechaHora + "] " + mensaje;
        
        FileWriter fw = new FileWriter(archivo, StandardCharsets.UTF_8, true);
        try(BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(linea);
            bw.newLine();
        }
    }
    
    public List<String> leer() throws IOException{
        List<String> lineas = new ArrayList<>();
        FileReader fr = new FileReader(archivo, StandardCharsets.UTF_8);
        try(BufferedReader br = new BufferedReader(fr)){
            String linea;
            while((linea = br.readLine())!=null){
                lineas.add(linea);
            }
        }
        return lineas;
    }
    
    public int contar(String palabra) throws IOException{
        int contador = 0;
        String buscada =palabra.toLowerCase();
        for(String linea: leer()){
            if(linea.toLowerCase().contains(buscada)){
                contador++;
            }
        }
        return contador;
    }
}

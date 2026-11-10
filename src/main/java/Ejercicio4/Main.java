package Ejercicio4;

/**
 *
 * @author Samuel
 */
public class Main {
    public static void main(String[] args){
        Dispositivo[] dispositivos = {
            new Smartphone("Samsung", "Galaxy S24", 3500000, 50),
            new Smartphone("Huawei", "Nova 12 SE", 2800000, 108),
            new Camara("Canon", "EOS R50", 4200000, 24)
        };
        for(Dispositivo dispositivo: dispositivos){
            dispositivo.describir();
            if(dispositivo instanceof Fotografiable){
                ((Fotografiable) dispositivo).tomarFoto();
            }
            if(dispositivo instanceof Llamable){
                ((Llamable) dispositivo).llamar("3001234567");
                ((Llamable) dispositivo).colgar();
            }
        }
        int mpMayor = 0;
        for(Dispositivo dispositivo: dispositivos){
            if(dispositivo instanceof Fotografiable){
                if(((Fotografiable) dispositivo).getMegaPixeles() > mpMayor){
                    mpMayor = ((Fotografiable) dispositivo).getMegaPixeles();
                }
            }
        }
        System.out.println("Mayor resolucion: "+ mpMayor + " MP");  
    }
}

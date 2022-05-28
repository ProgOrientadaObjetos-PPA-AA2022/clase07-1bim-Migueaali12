
package paquete6;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // nombre del archivo
        String nombreArchivo = "Hospital.txt";
        
        Hospital h1 = new Hospital("San Pancho",100,1000.35);
        Hospital h2 = new Hospital("Las Fuentes",500,14000);
        Hospital h3 = new Hospital("San Pancho",200,13000);
        Hospital h4 = new Hospital("San Agustin",600,22000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {h1, h2, h3};
        
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        
        archivo.establecerRegistro(h4);
        archivo.establecerSalida();
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        
    }
    
}

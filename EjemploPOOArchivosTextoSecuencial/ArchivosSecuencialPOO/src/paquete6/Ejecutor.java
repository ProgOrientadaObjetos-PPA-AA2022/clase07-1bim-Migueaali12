
package paquete6;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // nombre del archivo
        String nombreArchivo = "calificaciones2.txt";
        
        Hospital h1 = new Hospital("San Pancho",100,1000.35);
        Hospital h2 = new Hospital("Las Fuentes",500,14000);
        Hospital h3 = new Hospital("San Pancho",200,13000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {h1, h2, h3};
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        
    }
    
}

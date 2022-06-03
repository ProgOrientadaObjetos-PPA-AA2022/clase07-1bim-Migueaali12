
package paquete4;


public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/profesores.data";
        
        Profesor profesor1 = new Profesor("Tara Hernandez", 
                "contratado", "1111");
        Profesor profesor2 = new Profesor("Gregory Walsh", 
                "nombramiento", "2222");
        Profesor profesor3 = new Profesor("Kevin Page", 
                "nombramiento", "3333");

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        
        archivo.establecerRegistroProfesor(profesor1);
        archivo.establecerSalida();
        archivo.establecerRegistroProfesor(profesor2);
        archivo.establecerSalida();
        archivo.establecerRegistroProfesor(profesor3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerProfesores();
        System.out.println(lectura);
    }
}
